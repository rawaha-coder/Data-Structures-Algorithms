import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("\n*** Array Stack ***\n");
        Stack<Integer> S = new ArrayStack<>(); // contents: ()
        S.push(5); // contents: (5)
        S.push(3); // contents: (5, 3)
        System.out.println(S.size()); // contents: (5, 3) outputs 2
        System.out.println(S.pop()); // contents: (5) outputs 3
        System.out.println(S.isEmpty()); // contents: (5) outputs false
        System.out.println(S.pop()); // contents: () outputs 5
        System.out.println(S.isEmpty()); // contents: () outputs true
        System.out.println(S.pop()); // contents: () outputs null
        S.push(7); // contents: (7)
        S.push(9); // contents: (7, 9)
        System.out.println(S.top()); // contents: (7, 9) outputs 9
        S.push(4); // contents: (7, 9, 4)
        System.out.println(S.size()); // contents: (7, 9, 4) outputs 3
        System.out.println(S.pop()); // contents: (7, 9) outputs 4
        S.push(6); // contents: (7, 9, 6)
        S.push(8); // contents: (7, 9, 6, 8)
        System.out.println(S.pop()); // contents: (7, 9, 6) outputs 8

        System.out.println("\n*** Linked Stack ***\n");
        Stack<Integer> LS = new ArrayStack<>(); // contents: ()
        LS.push(5); // contents: (5)
        LS.push(3); // contents: (5, 3)
        System.out.println(LS.size()); // contents: (5, 3) outputs 2
        System.out.println(LS.pop()); // contents: (5) outputs 3
        System.out.println(LS.isEmpty()); // contents: (5) outputs false
        System.out.println(LS.pop()); // contents: () outputs 5
        System.out.println(LS.isEmpty()); // contents: () outputs true
        System.out.println(LS.pop()); // contents: () outputs null
        LS.push(7); // contents: (7)
        LS.push(9); // contents: (7, 9)
        System.out.println(LS.top()); // contents: (7, 9) outputs 9
        LS.push(4); // contents: (7, 9, 4)
        System.out.println(LS.size()); // contents: (7, 9, 4) outputs 3
        System.out.println(LS.pop()); // contents: (7, 9) outputs 4
        LS.push(6); // contents: (7, 9, 6)
        LS.push(8); // contents: (7, 9, 6, 8)
        System.out.println(LS.pop()); // contents: (7, 9, 6) outputs 8

        System.out.println("\n*** Reversing arrays ***\n");
        Integer[ ] a = {4, 8, 15, 16, 23, 42}; // autoboxing allows this
        String[ ] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        Utils.reverse(a);
        Utils.reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
    }
}
