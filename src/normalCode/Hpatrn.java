package normalCode;

public class Hpatrn
{
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                if (j == 1 || j == 8 || (i == 4 && (j >= 2 && j <= 6))) {
                        System.out.print("* ");
                }
                else {
                        System.out.print("  "); // Adjust spaces as needed
                    }
                }
                System.out.println();
        }
    }
}


