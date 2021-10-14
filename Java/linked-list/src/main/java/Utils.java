public class Utils<T> {


    public static <T> void printList(LinkedList<T> list){
        if (list.getHead() !=null)
            print(list.getHead());
    }
    /**
     * Recursively traverse this list and print the node value
     */
    private static <T> void print(Node<T> node) {
        if (node.getNext() != null){
            System.out.print(node.getData() + " -> ");
            print(node.getNext());
        } else {
            System.out.println(node.getData());
        }
    }
}
