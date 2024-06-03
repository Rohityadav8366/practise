package CodeChef;

import java.util.HashSet;
import java.util.Scanner;

public class CardSwap {
         public static int maxPeopleInOffice(int[] arr) {
            HashSet<Integer> currentInside = new HashSet<>();
            int Count = 0;
            int max = 0;

            for (int swipeId : arr) {
                if (currentInside.contains(swipeId)) {
                    currentInside.remove(swipeId);
                    Count--;
                } else {
                    currentInside.add(swipeId);
                    Count++;
                    if (Count > max) {
                        max = Count;
                    }
                }
            }
            return max;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(maxPeopleInOffice(arr));
    }
}
