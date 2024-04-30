package TwoDArray;

import java.util.Scanner;

public  class Matrix {
    static  void addMatrix(int n,int m,int[][] m1,int [][]m2,int[][]m3) {
        System.out.println("Add two Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m3[i][j] = (m1[i][j] + m2[i][j]);
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }

        static  void subMatrix(int n,int m,int[][] m1,int [][]m2,int[][]m3)
        {
            System.out.println("substraction two Matrix");
            for(int i=0;i< n;i++)
            {
                for(int j=0;j< m;j++)
                {
                    m3[i][j]=(m1[i][j]-m2[i][j]);
                    System.out.print(m3[i][j]+" ");
                }
                System.out.println();
            }
    }

    static  void mulMatrix(int n,int m,int[][] m1,int [][]m2,int[][]m3) {
        System.out.println("multiply two Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m3[i][j] = (m1[i][j] * m2[j][i]);
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }

    static  void divMatrix(int n,int m,int[][] m1,int[][]m2,int [
            ][]m3) {
        System.out.println("division two Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m3[i][j] = (m1[i][j] / m2[j][i]);
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposed(int n,int m,int[][] m1,int[][] m3)
    {
        System.out.println("Transposed Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m3[i][j] = m1[j][i];
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void LowerTriMat(int n,int m,int[][] m1,int[][] m3)
    {
        System.out.println("Lower triangular Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!(m1[i][j]==0&&i<j)) {
                    m3[i][j] = m1[i][j];
                    System.out.print(m3[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void UpperTriMat(int n,int m,int[][] m1,int[][] m3)
    {
        System.out.println("Upper triangular Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!(m1[i][j]==0&&i>j)) {
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

    static void TriDiaMat(int n,int m,int[][] m1,int[][] m3)
    {
        System.out.println("Tri diagonal Matrix");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix N , M ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("First matrix :");
        int[][] m1=new int[n][m];
        for(int i=0;i< n;i++)
        {
            for (int j=0;j< m;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("your Second matrix");
        int[][] m2=new int[n][m];
        for(int i=0;i< n;i++)
        {
            for (int j=0;j< m;j++) {
                m2[i][j] = sc.nextInt();
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
        System.out.println("Second matrix : ");
        for(int i=0;i< n;i++)
        {
            for(int j=0;j< m;j++)
            {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        int[][] m3=new int[n][m];
        String str= sc.next();
        do{
            switch (str.toUpperCase()) {
                case "ADD":
                    addMatrix(n,m,m1,m2,m3);
                    str= sc.next();
                    break;
                case "SUB":
                    subMatrix(n,m,m1,m2,m3);
                    str= sc.next();
                    break;
                case "MUL":
                    mulMatrix(n,m,m1,m2,m3);
                    str= sc.next();
                    break;
                case "DIV":
                    divMatrix(n,m,m1,m2,m3);
                    str= sc.next();
                    break;
                case "TRAS":
                    transposed(n,m,m1,m3);
                    str= sc.next();
                    break;
                case "LOW":
                    LowerTriMat(n,m,m1,m3);
                    str= sc.next();
                    break;
                case "UPP":
                    UpperTriMat(n,m,m1,m3);
                    str= sc.next();
                    break;
                case "TRI":
                    TriDiaMat(n,m,m1,m3);
                    str= sc.next();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }while(true);

    }
}