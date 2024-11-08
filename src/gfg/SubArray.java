package gfg;
import java.util.Arrays;
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
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of array:");
        int n=sc.nextInt();
          System.out.println("Enter the element of array: ");
        int[] arr=new int[n];
        int min=0;
        int p=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==0){
            min=arr[0];}
            if(min>arr[i]){
                min=arr[i];
                p=i;
            }
        }
        int max=0;
        for(int i=p+1;i<n;i++){
            if(i==p+1){
            max=arr[p+1]-min;}
            int pro=arr[i]-min;
            if(max<pro){
                max=pro;
            }
        }
          System.out.println("Maximum profit is "+max);
      }
      public static void missingNumber(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          int min=0,max=0;
          System.out.println("Enter the element of array");
           int[] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
               max=Arrays.stream(arr).max().getAsInt();
               min=Arrays.stream(arr).min().getAsInt();
           }

          Arrays.sort(arr);
           while(min<=max){//jhh
               if(min>max){
                   System.out.println("null");
               }
           }
      }

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Entre the N:");
//        int n=sc.nextInt();
//        System.out.println("Entre the s:");
//        int s=sc.nextInt();
//        System.out.println("Entre the element:");
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        stockBuyAndShell();
    }
}
