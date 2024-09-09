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
            for (int j = i; j <= 5; j++) {
//                if (true ) {
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]) {
     // squire();
        triangle();
    }
}
