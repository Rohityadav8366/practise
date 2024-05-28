package CodeChef;

import java.util.Scanner;

public class PetStore {
        public static void main (String[] args)
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int A=0,B=0;
                int[] arr=new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                if(n%2==1)
                {
                    System.out.println("NO");
                }
                else{
                    for(int i=0;i<arr.length;i++)
                    {
                        if(i<n/2)
                        {
                            A+=arr[i];
                        }
                        else{
                            B+=arr[i];
                        }}
                        if(A==B)
                        {
                            System.out.println("Yes");
                        }
                        else{
                            System.out.println("NO");
                        }
                }
            }

        }
