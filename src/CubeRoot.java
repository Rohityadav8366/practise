import java.util.Scanner;

public class CubeRoot {
    static void cubeRoot(int n)
    {
        int a=(int) Math.cbrt(n);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Cube root:");
        cubeRoot(n);
    }
}
