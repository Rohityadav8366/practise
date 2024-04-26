package pattarn;

import java.util.Random;
import java.util.Scanner;

public class AtoZ {
    int n = 10;
    int m = 10;

    // Squarish A
//        for(int i=1;i<n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if(i==1||j==1||j==10||i==5)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    public static void A() {
        int n = 10;
        int m = 10;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j < n; j++) {
                if ((i == 1 && j == 5) || (i == 2 && (j == 4 || j == 6)) || (i == 3 && (j == 3 || j == 4 || j == 5 || j == 6 || j == 7)) || (i == 4 && (j == 2 || j == 8)) || (i == 5 && (j == 1 || j == 9))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        public static void B() {
            int m = 10;

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < m; j++) {
                    if ((i == 1 && j == 9) || (i == 5 && j == 9) || (i == 9 && j == 9)) {
                        System.out.print(" ");
                    } else if (j == 1 || j == 9 || (i == 1) || i == 5 || i == 9) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

       public static void D() {
           int m = 10;
           for (int i = 1; i <= 5; i++) {
               for (int j = 1; j < m; j++) {
                   if ((i == 1 && j == 9) || (i == 5 && j == 9)) {
                       System.out.print(" ");
                   } else if (j == 1 || j == 9 || (i == 1) || i == 5) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }

        public static void C(){
        int m=10;
        for (int i =1; i<=7; i++)
        {
            for (int j=1;j<m;j++)
            {
                if((i==1&&j==1)||(i==7&&j==1)||(i==7&&j==9)||(i==1&&j==9))
                {
                    System.out.print(" ");
                }
                else if(j==1||(i==1)||i==7||(i==2&&j==9)||(i==6&&j==9))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
       public static void E() {
           int m = 10;
           for (int i = 1; i < m; i++) {
               for (int j = 1; j < m; j++) {
                   if (j == 1 || i == 1 || i == 5 || i == 9) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }

       public static void F() {
           int m= 10;
           for (int i = 1; i < m; i++) {
               for (int j = 1; j < m; j++) {
                   if (j == 1 || i == 1 || i == 5) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }

       public static void G() {
        int m=10;
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j < m; j++) {
                    if ((i == 1 && j == 1) || (i == 7 && j == 1) || (i == 7 && j == 9) || (i == 1 && j == 9)) {
                        System.out.print(" ");
                    } else if (j == 1 || (i == 1) || i == 7 || (i == 2 && j == 9) || (i == 6 && j == 9) || (i == 5 && (j == 8 || j == 9 || j == 7))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


        public static void H() {
            int m = 10;
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < m; j++) {
                    if (j == 1 || j == 9 || i == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

           public static void I() {
               int m = 10;
               for (int i = 1; i < m; i++) {
                   for (int j = 1; j < m; j++) {
                       if (i == 1 || i == 9 || j == 5) {
                           System.out.print("*");
                       } else {
                           System.out.print(" ");
                       }
                   }
                   System.out.println();
               }
           }


        public static void J() {
            int m = 10;
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < m; j++) {
                    if (j == 5 || (j == 1 && i == 8) || (j == 1 && i == 7) || (j == 2 && i == 9) || (j == 3 && i == 9) || (j == 4 && i == 9)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void K() {
            int m = 10;
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (j == 1 || i == 3 && j == 2 || (i == 2 || i == 4) && j == 4 || (i == 1 || i == 5) && j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


     public static void L() {
         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 5; j++) {
                 if (j == 1 || i == 5) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }


       public static void M()
    {
        int m=10;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 1 || j == 10 || (i == 2 && (j == 2 || j == 9)) || (i == 3 && (j == 3 || j == 8)) || (i == 4 && (j == 4 || j == 7)) || (i == 5 && j == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

       public static void N() {
           int m = 10;
           for (int i = 1; i <= 10; i++) {
               for (int j = 1; j <= m; j++) {
                   if (j == 1 || j == 10 || (i == j)) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }
       public static void O() {
           int m = 10;
           for (int i = 1; i <= 10; i++) {
               for (int j = 1; j <= m; j++) {
                   if (((i == 1 || i == 10) && (j == 1 || j == 10 || j == 2 || j == 9))) {
                       System.out.print(" ");
                   } else if (i == 1 || i == 10 || j == 1 || j == 10) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }

        public static void P() {
            int m=10;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= m; j++) {
                    if ((i == 1 || i == 5) && (j == 10)) {
                        System.out.print(" ");
                    } else if (i == 1 || j == 1 || i == 5 || (i == 2 && j == 10) || (i == 3 && j == 10) || (i == 4 && j == 10)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //Q
    public static void Q(){
        int m=10;
        for(int i=1;i<=10;i++)
        {
            for (int j=1;j<=m;j++)
            {
                if(((i==9&&j==10)||(i==9||i==10)&&(j==1)||i==1||i==8)&&(j==1||j==10||j==2||j==9))
                {
                    System.out.print(" ");
                }
               else if(i==1||i==8||j==1||j==10||(i==9&&j==9)||(i==7&&j==7))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void R()
    {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == 1 || i == 5) && (j == 10)) {
                    System.out.print(" ");
                } else if (i == 1 || j == 1 || i == 5 || (i == 2 && j == 10) || (i == 3 && j == 10) || (i == 4 && j == 10)||(i==6&&j==3)||(i==7&&j==5)||(i==8&&j==7)||(i==9&&j==9)||(i==10&&j==10)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void S()
    {
        for (int i = 1; i <10; i++) {
            for (int j = 1; j <=10; j++) {
                if (((i == 1||i==5||i==9) && (j == 1||j==10)) || ((i ==3||i==4) && j == 10)||j==1&&(i==6||i==7)) {
                    System.out.print(" ");
                } else if (i==1||i==5||i==9||j==1||j==10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void T()
    {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                if (i == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void U() {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j== 1 || i == 10|| j ==10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void V(){
        int n=10;
        int m=10;
        for(int i=m;i>=1;i--)

        {
            for (int j = 1; j < n; j++) {
                if ((i == 1 && j == 5) || (i == 2 && (j == 4 || j == 6)) || (i == 3 && (j == 3 || j == 7)) || (i == 4 && (j == 2 || j == 8)) || (i == 5 && (j == 1 || j == 9))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void W()
    {
        for (int i = 10; i >=1; i--) {
            for (int j = 10; j >= 1; j--) {
                if (j == 1 || j == 10 || (i == 2 && (j == 2 || j == 9)) || (i == 3 && (j == 3 || j == 8)) || (i == 4 && (j == 4 || j == 7)) || (i == 5 && j == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void X()
    {
        for (int i=1;i<=10;i++)
        {
            for(int j=10;j>=1;j--)
            {
                if(i==j||(i+j)==11)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Y()
    {
        for (int i=1;i<=10;i++)
        {
            for(int j=10;j>=1;j--)
            {
                if(i==j||(i+j)==11&&i==4||(i+j)==11&&i==3||(i+j)==11&&i==2||(i+j)==11&&i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Z()
    {
        for (int i=1;i<=10;i++)
        {
            for(int j=10;j>=1;j--)
            {
                if(i==1||i==j||i==10)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("which letter Pattarn you want" );
        String str=sc.next();

        switch (str.toUpperCase())
        {
            case "A":
                A();
                break;
            case "B":
                B();
                break;
            case "C":
                C();
                break;
            case "D":
                D();
                break;
            case "E":
                E();
                break;
            case "F":
                F();
                break;
            case "G":
                G();
                break;
            case "H":
                H();
                break;
            case "I":
                I();
                break;
            case "J":
                J();
                break;
            case "K":
                K();
                break;
            case "L":
                L();
                break;
            case "M":
                M();
                break;
            case "N":
                N();
                break;
            case "O":
                O();
                break;
            case "P":
                P();
                break;
            case "Q":
                Q();
                break;
            case "R":
                R();
                break;

            case "S":
                S();
                break;
            case "T":
                T();
                break;
            case "U":
                U();
                break;
            case "V":
                V();
                break;
            case "W":
                W();
                break;
            case "X":
                X();
                break;
            case "Y":
                Y();
                break;
            case "Z":
                Z();
                break;
            default:
                System.out.println("please Enter valid Letter :");
        }

    }
}
