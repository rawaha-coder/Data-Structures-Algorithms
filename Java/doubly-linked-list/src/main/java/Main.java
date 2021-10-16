public class Main {
    public static void main(String[] args) {

        System.out.println("********** Double linked list push operation *********");

        DoublyLinkedList<String> list0 = new DoublyLinkedList<>();
        list0.push("Rabat").push("Sale").push("Meknes").push("Fes").push("Tanger");

        System.out.println(list0);

        System.out.println(list0.size());
        System.out.println(list0.head.value);
        System.out.println(list0.head.next.value);
        System.out.println(list0.tail.value);
        System.out.println(list0.tail.previous.value);

        System.out.println("********** Double linked list append operation *********");

        DoublyLinkedList<String> list1 = new DoublyLinkedList<>();
        list1.append("Rabat").append("Sale").append("Meknes").append("Fes").append("Tanger");

        System.out.println(list1);

        System.out.println(list1.size());
        System.out.println(list1.head.value);
        System.out.println(list1.head.next.value);
        System.out.println(list1.tail.value);
        System.out.println(list1.tail.previous.value);

        System.out.println("********** Double linked list nodeAt and insert operations *********");

        System.out.println(list1);
        list1.insert("Oujda", list1.head);
        list1.insert("Casa", list1.nodeAt(2));
        list1.insert("Agadir", list1.tail);

        System.out.println("********** Double linked list pop operation *********");

        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<>();
        list2.append(2).append(3).append(4).push(1);
        System.out.println(list2);
        System.out.println(list2.pop());
        System.out.println(list2);
        System.out.println(list2.pop());
        System.out.println(list2);
        System.out.println(list2.pop());
        System.out.println(list2);
        System.out.println(list2.pop());
        System.out.println(list2);
        System.out.println(list2.size());
        list2.append(2).append(3).append(4).push(1);
        System.out.println(list2);
    }
}
