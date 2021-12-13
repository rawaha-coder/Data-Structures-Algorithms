public class Main {
    public static void main(String[] args){
        System.out.println("\n*** Trees Codes ***\n");


    }

    public static int diskSpace(Tree<Integer> T, Position<Integer> p) {
          int subtotal = p.getElement(); // we assume element represents space usage
          for (Position<Integer> c : T.children(p))
              subtotal += diskSpace(T, c);
          return subtotal;
    }

}
