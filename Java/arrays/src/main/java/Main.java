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
    }
}
