
public class Scoreboard {
    private int numEntries = 0;
    private final GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries-1].getScore())
        {
            if (numEntries < board.length) // no score drops from the board
                numEntries++; // so overall number increases
            int j = numEntries - 1;
            while (j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1]; // shift entry from j-1 to j
                j--; // and decrement j
                }
            board[j] = e; // when done, add new entry
            }
        }

    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1 ; j++)
            board[j] = board[j+1];
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }

    public int getSize(){
        return numEntries;
    }

    public String toString(){
        StringBuilder boardEntry = new StringBuilder();
        for (GameEntry gameEntry : board) {
            if (gameEntry != null)
                boardEntry.append(gameEntry.toString()).append(" ");
        }
        return "[ " + boardEntry.toString() + " ]";
    }
}
