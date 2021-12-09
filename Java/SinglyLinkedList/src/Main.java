public class Main {
    public static void main(String[] args){

        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        list1.addFirst(1);
        list1.addFirst(6);
        list1.addFirst(7);

        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        list2.addFirst(1);
        list2.addFirst(6);
        list2.addFirst(7);

        SinglyLinkedList<Integer> list3 = new SinglyLinkedList<>();

        list3.addFirst(2);
        list3.addFirst(6);
        list3.addFirst(7);

        boolean test = list1.equals(list2);

        System.out.println(test);

        boolean test1 = list1.equals(list3);

        System.out.println(test1);

    }
}
