package pattarn;

public class AtoZ {
    public static void main(String[] args) {
        int n = 10;
        int m=10;
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


//print   A
//        for (int i =1; i<=m; i++)
//        {
//            for (int j=1;j<n;j++)
//            {
//                if((i==1&&j==5)||(i==2&&(j==4||j==6))||(i==3&&(j==3||j==4||j==5||j==6||j==7))||(i==4&&(j==2||j==8))||(i==5&&(j==1||j==9)))
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        //Actual V
//        for (int i = m; i>=1; i--)
//        {
//            for (int j=1;j<n;j++)
//            {
//                if((i==1&&j==5)||(i==2&&(j==4||j==6))||(i==3&&(j==3||j==7))||(i==4&&(j==2||j==8))||(i==5&&(j==1||j==9)))
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }



        //B
//        for (int i =1; i<m; i++)
//        {
//            for (int j=1;j<m;j++)
//            {
//                if((i==1&&j==9)||(i==5&&j==9)||(i==9&&j==9))
//                {
//                    System.out.print(" ");
//                }
//                else if(j==1||j==9||(i==1)||i==5||i==9)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        //D
//        for (int i =1; i<=5; i++)
//        {
//            for (int j=1;j<m;j++)
//            {
//                if((i==1&&j==9)||(i==5&&j==9))
//                {
//                    System.out.print(" ");
//                }
//                else if(j==1||j==9||(i==1)||i==5)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        //C
//        for (int i =1; i<=5; i++)
//        {
//            for (int j=1;j<m;j++)
//            {
//                if((i==1&&j==1)||(i==5&&j==1))
//                {
//                    System.out.print(" ");
//                }
//                else if(j==1||(i==1)||i==5||i==9)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //E
//        for (int i =1; i<m; i++)
//        {
//            for (int j=1;j<m;j++)
//            {
//                 if(j==1||i==1||i==5||i==9)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //F
        for (int i =1; i<m; i++)
        {
            for (int j=1;j<m;j++)
            {
                if(j==1||i==1||i==5)
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
}
