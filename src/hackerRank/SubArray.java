package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static int minSubarr(int[] A, int[] B) {
        int n = A.length;
        int left = 0;
        while (left < n && A[left] == B[left]) {
            left++;
        }
        if (left == n) {
            return 0;
        }
        int right = n - 1;
        while (right >= 0 && A[right] == B[right]) {
            right--;
        }
        return right - left + 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }

        System.out.println(minSubarr(A,B));
    }
}
