package ANR;

public class Patarn {

    public static void squire(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==1||j==1||j==5||i==5 ) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1;j<=5;j++) {
                if ( i==5||j==5||(i==2)&&(j==4)||(i==3)&&(j==4||j==3)||(i==4)&&(j==4||j==3||j==2)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                //System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1;j<=5;j++) {
                if ( i==1||j==1||(i==2)&&(j==4)||(i==3)&&(j==4||j==3)||(i==4)&&(j==4||j==3||j==2)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                System.out.println("rohit");
            }
            System.out.println();
        }
    }
    public static void swap(){
        int a=9;
        int b=8;
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
    }
    public static void main(String arg[]) {
     // squire();
        triangle1();
        swap();
    }
}
