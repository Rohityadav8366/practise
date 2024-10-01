package ANR;


import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
//        int count = 0, same = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == arr[(n - 1) - i]) {
//                same++;
//
//            } else {
//                count++;
//            }
//
//        }
//        if (count > 0) {
//            System.out.println("Not palindrome");
//        } else {
//            System.out.println("Palindrome");
//        }
        int s=0,c=0;
        for(int i= arr.length-1;i>=0;i--){
            s=(s*10)+arr[i];
            c=(c*10)+arr[(n-1)-i];
        }
        if(s==c){
            System.out.println(" palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
