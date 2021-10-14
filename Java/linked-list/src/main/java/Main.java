import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list0 = new LinkedList<>();
        list0.push("Manish");
        list0.push("Pandit");
        list0.push("Tanvi");
        list0.print();

        System.out.println("list size: " + list0.size());
        System.out.println("list head value: " + list0.getHead().getData());

        System.out.println("***********************************");

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.push(1).push(2).push(3);
        list1.print();

        System.out.println("***********************************");

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(4);
        list2.append(5);
        list2.append(6);
        list2.print();

        System.out.println("***********************************");

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.push(10).push(20).push(10);
        System.out.println("Before inserting: ");
        list3.print();
        Node<Integer> middleNode = list3.nodeAt(1);
        for (int i = 1; i <= 3; i++) {
            middleNode = list3.insert(-1 * i, middleNode);
        }
        System.out.println("After inserting:");
        list3.print();

        System.out.println("***********************************");

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.push(100).push(200).push(300);
        System.out.println("Before popping from the list: ");
        list4.print();
        Integer poppedValue = list4.pop();
        System.out.println("After popping from the list: ");
        list4.print();
        System.out.println("Popped value: " + poppedValue);

        System.out.println("***********************************");

        LinkedList<Integer> list5 = new LinkedList<>();
        list5.push(7).push(9).push(5);
        System.out.println("Before remove the last: ");
        list5.print();
        Integer removedValue = list5.removeLast();
        System.out.println("After remove the last: ");
        list5.print();
        System.out.println("removed value: " + removedValue);

        System.out.println("***********************************");

        LinkedList<Integer> list6 = new LinkedList<>();
        list6.push(47).push(96).push(52);
        System.out.println("Before remove the node: ");
        list6.print();
        int index = 1;
        Node<Integer> node = list6.nodeAt(index - 1);
        Integer removedValueAt = list6.removeAfter(node);
        System.out.println("After remove the node at index: " + index);
        list6.print();
        System.out.println("removed value: " + removedValueAt);

        System.out.println("***********************************");

        LinkedList<String> list7 = new LinkedList<>();

        list7.push("abc");
        list7.push("mno");
        list7.push("pqr");
        list7.push("xyz");

        // Iterate through the list using For Each Loop
        for (String str : list7)
            System.out.println(str);

        Utils.printList(list7);

        System.out.println("***********************************");

        LinkedList<Integer> list8 = new LinkedList<>();
        list8.add(3);
        list8.add(2);
        list8.add(1);
        Utils.printList(list8);
        list8.remove(1);
        Utils.printList(list8);

        System.out.println("***********************************");

        LinkedList<Integer> list9 = new LinkedList<>();
        list9.add(3);
        list9.add(2);
        list9.add(1);
        list9.add(4);
        list9.add(5);
        Utils.printList(list9);
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(4);
        lst.add(5);
        list9.retainAll(lst);
        Utils.printList(list9);

        System.out.println("***********************************");

        LinkedList<Integer> list10 = new LinkedList<>();
        list10.add(3);
        list10.add(2);
        list10.add(1);
        list10.add(4);
        list10.add(5);
        Utils.printList(list10);
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(3);
        ls.add(4);
        ls.add(5);
        list10.removeAll(ls);
        Utils.printList(list10);

    }
}
