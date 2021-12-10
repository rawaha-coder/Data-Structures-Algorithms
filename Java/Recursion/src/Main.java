public class Main {
    public static void main(String[] args){

        System.out.println("\n**** Factorial Function ****\n");
        System.out.println(FactorialFunction.factorialInt(5));

        System.out.println("\n**** Binary Search ****\n");
        int[] data = {1,3,4,6,7,8,9,15};
        boolean find = BinarySearch.isExist(data, 7, 0, data.length);
        System.out.println(find);

        System.out.println("\n**** Recursion linear Sum ****\n");

        int sum = LinearRecursion.linearSum(data, data.length);
        System.out.println(sum);

        System.out.println("\n**** Recursion Binary Sum ****\n");
        sum = BinaryRecursion.binarySum(data, 0, data.length-1);
        System.out.println(sum);

        System.out.println("\n**** Recursion reverse Array ****\n");
        for (int i : data){
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        LinearRecursion.reverseArray(data, 0,data.length - 1);
        for (int i : data){
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("\n**** Recursion power ****\n");
        System.out.println("Power(8,5) : " + LinearRecursion.power(8,5));
        System.out.println("\n**** Recursion power Squaring ****\n");
        System.out.println("PowerSquaring(8,5) : " + LinearRecursion.powerSquaring(8,5));


/*        System.out.println("\n**** File Systems ****\n");
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString();
        File file = new File(path);
        FileSystems.diskUsage(file);*/

/*        System.out.println("\n**** English Ruler ****\n");
        EnglishRuler.drawRuler(5,3);*/
    }
}
