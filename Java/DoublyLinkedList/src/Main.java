public class Main {
    public static void main(String[] args){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();

        list.addFirst(1);
        list.addFirst(6);
        list.addFirst(7);

        list1.addFirst(1);
        list1.addFirst(6);
        list1.addFirst(7);

        boolean test = list.equals(list1);

        System.out.println(test);
    }
}
