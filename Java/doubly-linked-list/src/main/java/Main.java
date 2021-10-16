public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<String> list0 = new DoublyLinkedList<>();
        list0.push("Rabat").push("Sale").push("Meknes").push("Fes").push("Tanger");

        System.out.println(list0);

        System.out.println(list0.size());
        System.out.println(list0.head.value);
        System.out.println(list0.head.next.value);
        System.out.println(list0.tail.value);
        System.out.println(list0.tail.previous.value);
    }
}
