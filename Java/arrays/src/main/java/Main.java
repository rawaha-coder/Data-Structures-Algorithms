public class Main {
    public static void main(String[] args){

        System.out.println("*** Arrays ***");

        Scoreboard scoreboard = new Scoreboard(10);

        scoreboard.add(new GameEntry("Jack", 510));
        scoreboard.add(new GameEntry("Rose", 590));
        scoreboard.add(new GameEntry("Anna", 660));
        scoreboard.add(new GameEntry("Paul", 720));
        scoreboard.add(new GameEntry("Rob", 750));
        scoreboard.add(new GameEntry("Mike", 1100));

        System.out.println(scoreboard.toString());

        System.out.println("\n****** Adding to Array ******");

        GameEntry jillGE = new GameEntry("Jill", 740);

        System.out.println(jillGE.toString());
        scoreboard.add(jillGE);
        System.out.println(scoreboard.toString());

        System.out.println("\n****** Removing from Array ******");

        GameEntry paulGE = scoreboard.remove(3);

        System.out.println(paulGE.toString());

        System.out.println(scoreboard.toString());

        System.out.println("\n****** Clone Array ******");

        int[] data = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] backup;
        int[] cloneData;
        backup = data;
        cloneData = data.clone();

        printIntArray(data);
        printIntArray(backup);
        printIntArray(cloneData);

        data[2] = 6587;

        System.out.println("\n************");

        printIntArray(data);
        printIntArray(backup);
        printIntArray(cloneData);

    }

    static void printIntArray(int[] arr){
        System.out.print("[");
        for (int i: arr){
            System.out.print(" " + i + ",");
        }
        System.out.print("]\n");
    }

    public static int[ ][ ] deepClone(int[ ][ ] original) {
        int[ ][ ] backup = new int[original.length][ ]; // create top-level array of arrays
        for (int k=0; k < original.length; k++)
            backup[k] = original[k].clone(); // copy row k
        return backup;
    }
}
