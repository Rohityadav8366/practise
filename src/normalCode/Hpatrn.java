package normalCode;

public class Hpatrn
{
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || (i == 4 && (j >= 2 && j <= 6))) {
                        System.out.print("# ");
                }
                else {
                        System.out.print("  "); // Adjust spaces as needed
                    }
                }
                System.out.println();
        }
    }
}


