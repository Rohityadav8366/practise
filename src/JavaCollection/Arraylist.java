package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> al =new ArrayList<>();
       ArrayList<Integer> al1=new ArrayList<>(List.of(23,24,13,45,65,20,30));
       al.add(0,10);
       al.add(1,20);
       al.add(2,30);
       al.add(3,40);
        al.add(23);
        al.add(54);
        al1.addAll(al);
        System.out.println(al);
        System.out.println(al1);
        System.out.println(al.indexOf(30));
    }
}
