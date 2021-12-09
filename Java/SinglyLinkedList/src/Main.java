public class Main {
    public static void main(String[] args){

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addFirst(1);
        list.addFirst(6);
        list.addFirst(7);

        for (int i= 0; i < list.size(); i++){
            System.out.println(list.nodeAt(i).getElement());
        }

    }
}
