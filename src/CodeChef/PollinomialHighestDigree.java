package CodeChef;
import java.util.Scanner;

public class PollinomialHighestDigree {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int count = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (!(arr[i] == 0)) {
                     count=i;
                }
                //System.out.println(count);
            }
            System.out.println(count);
            t--;
        }

    }
}