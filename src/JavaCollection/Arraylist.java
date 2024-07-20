package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> al =new ArrayList<>();
       ArrayList<Integer> al1=new ArrayList<>(List.of(23,24,13,45,65,20,30));
       int [] arr=new int[10];
       arr[0]=2;
       arr[1]=34;
       arr[2]=56;
       al.add(0,arr[2]);
       al.addAll(0, Collections.singleton(arr[0]));
        System.out.println(al.stream().count());
        System.out.println(arr[2]);

    }
}
