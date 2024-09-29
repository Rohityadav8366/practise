package ANR;

import java.util.*;

public class ArrayList1 {
    public static void dynamicMatrix() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and m ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("Enter the element ");
        for (int i = 0; i < n * m; i++) {
            int d = sc.nextInt();
            list.add(d);
        }
        Collections.sort(list);
        System.out.println("Sorted Array" + list);
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = list.get(index++);
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal of matrix " + sum);
        System.out.println("Entered element !");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void patt1() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void arrayPallindrom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array m :");
        int m = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int[] arr1= new int[5];
        int a = arr.length - 1;
        int n = 0;
        int s = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            //arr1[s-i]=arr[i];
            n = (n * 10) + arr[i];
            s = (s * 10) + arr[a - i];
        }

        System.out.println(n);
        System.out.println(s);
        if (s == n) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }

    public static void list(){

        List<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(14);
        list1.add(16);
        

    }


    public static void main(String[] args) {
//        List<Integer> a1= new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the n");
//        int n=sc.nextInt();
//        System.out.println("Enter "+n+" number");
//        for(int i=0;i<n;i++)
//        {
//            int num=sc.nextInt();
//            a1.add(num);
//
//        }
//            for(int a:a1)
//            {
//                System.out.print(a+" ");
//            }
//
//;
list();

    }
}