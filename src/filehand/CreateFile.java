package filehand;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        System.out.println("plz enter the data");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try {
            FileWriter insert=new FileWriter("filedatabase.txt");
            insert.write(str);
            System.out.println("data inserted");
            insert.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
