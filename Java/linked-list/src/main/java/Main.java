public class Main {
    public static void main(String[] args){

        LinkedList<String> list0 = new LinkedList<>();
        list0.push("Manish");
        list0.push("Pandit");
        list0.push("Tanvi");
        list0.print();

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.push(1).push(2).push(3);
        list1.print();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(4);
        list2.append(5);
        list2.append(6);

        list2.print();

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.push(10);
        list3.push(20);
        list3.push(10);
        System.out.println("Before inserting: ");
        list3.print();
        Node<Integer> middleNode = list3.nodeAt(1);
        for (int i=1; i <= 3; i++) {
            middleNode = list3.insert(-1 * i, middleNode);
        }
        System.out.println("After inserting:");
        list3.print();
    }
}
