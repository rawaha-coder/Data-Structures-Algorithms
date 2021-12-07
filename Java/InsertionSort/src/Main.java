public class Main {
    public static void main(String[] args){


        char[] data = {'S', 'M', 'W','Z','A'};

        System.out.println("*** Before sorting ***");
        printArray(data);
        InsertionSort(data);
        System.out.println("*** After sorting ***");
        printArray(data);
    }

    public static void printArray(char[] arr){
        for (char c : arr) System.out.println(c);
    }

    public static void InsertionSort(char[] data){
        int size = data.length;
        for (int i = 1 ; i < size; i++){
            char current = data[i];
            int j = i;
            while (j > 0 && data[j-1]>current){
                data[j] = data[j-1];
                j--;
            }
            data[j] = current;
        }
    }
}
