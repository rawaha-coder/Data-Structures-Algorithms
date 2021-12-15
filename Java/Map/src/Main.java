import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("\n*** Map code example ***\n");
        // Map<String,Integer> freq = new UnsortedTableMap();
        //Map<String,Integer> freq = new ChainHashMap<>();
        Map<String,Integer> freq = new ProbeHashMap();
        String input = "hello world such a lovely day take a walk through the field, days in our world";
        // scan input for words, using all nonLetters as delimiters
        Scanner doc = new Scanner(input).useDelimiter("[^a-zA-Z]+");

        while (doc.hasNext()) {
            String word = doc.next().toLowerCase(); // convert next word to lowercase
            Integer count = freq.get(word); // get the previous count for this word
            if (count == null)
                 count = 0; // if not in map, previous count is zero
             freq.put(word, 1 + count); // (re)assign new count for this word
             }

         int maxCount = 0;
         String maxWord = "no word";
         for (Entry<String,Integer> ent : freq.entrySet()) // find max-count word
             if (ent.getValue() > maxCount) {
             maxWord = ent.getKey();
             maxCount = ent.getValue();
             }
         
         System.out.print("The most frequent word is '" + maxWord);
         System.out.println("' with " + maxCount + " occurrences.");
         }
}
