package ANR;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> a1= new ArrayList<>();
            a1.add(1);
            a1.add(2);
            a1.add(3);
            for(int a:a1)
            {
                System.out.print(a+" ");
            }
    }
}
