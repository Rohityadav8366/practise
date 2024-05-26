package CodeChef;

import java.util.*;
class Towerofhanoi {
    static void TOH(int n, char Source, char Aux, char Dest)
    {
        if(n==1){
            System.out.println(Source+"->"+Dest);
            return;
        }
        TOH(n-1,Source,Aux,Dest);
        System.out.println(Source+"->"+Dest);
        TOH(n-1,Aux,Dest,Source);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the no of disk");
        int n=sc.nextInt();
        TOH(n,'A','B','C');

        }
}