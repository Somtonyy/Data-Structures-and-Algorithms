import java.util.*;

public class StaticInitializationBlocks {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        if (length > 0 && width > 0) {
            System.out.println(length * width);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
}