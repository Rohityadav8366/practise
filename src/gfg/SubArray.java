package gfg;
import java.util.Scanner;


public class SubArray {
    public static void subarraySum(int[] arr, int n, int s)
    {
        int sum=0;
//      for(int i=0;i<n;i++){
//          for(int j=i+1;j<n;j++){
//              sum=arr[i]+arr[j];
//              if(s==sum) {
//                  System.out.println(i + "," + j);
//              }
//          }
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
      }

      public static void stockBuyAndShell(){
          System.out.println("gfegfi");
      }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the N:");
        int n=sc.nextInt();
        System.out.println("Entre the s:");
        int s=sc.nextInt();
        System.out.println("Entre the element:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subarraySum(arr,n,s);
    }
}
