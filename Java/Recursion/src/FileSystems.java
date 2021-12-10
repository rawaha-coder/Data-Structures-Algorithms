import java.io.File;

public class FileSystems {
    public static long diskUsage(File root) {
        long total = root.length(); // start with direct disk usage
        if (root.isDirectory()) { // and if this is a directory,
            for (String childName : root.list()) { // then for each child
                File child = new File(root, childName); // compose full path to child
                total += diskUsage(child); // add child’s usage to total
                }
            }
        System.out.println("Size: " + total + "\t Path: " + root + "\n"); // descriptive output
        return total; // return the grand total
        }
}
