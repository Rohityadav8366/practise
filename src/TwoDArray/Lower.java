package TwoDArray;

import java.util.Scanner;

public class Lower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix N , M ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("First matrix :");
        int[][] m1=new int[n][m];
        int[][] m3=new int[n][m];
        for(int i=0;i< n;i++)
        {
            for (int j=0;j< m;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("First matrix : ");
        for(int i=0;i< n;i++)
        {
            for(int j=0;j< m;j++)
            {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Lower triangular Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!(m1[i][j]==0&&i==j)||(m1[i][j]==0&&i==j+1)||(m1[i][j]==0&&i==j-1)) {
                    m3[i][j] = m1[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
