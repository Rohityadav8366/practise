package Stream;

import java.io.FileInputStream;
import java.io.FileReader;

public class ReadIntoFile {
    public ReadIntoFile(String filePath) {
    }

    public static void main(String[] args)
    {try {
        FileReader r=new FileReader("D:\\java pro\\practice\\src\\Stream\\Stream.txt");
        FileInputStream ReadFromFile = new FileInputStream("D:\\java pro\\practice\\src\\Stream\\Stream.txt");
        byte b[]=new byte[ReadFromFile.available()];
        // By using typeCasting convert the Byte data which is store into the file read into String form
//         ReadFromFile.read(b);
//        String str=new String(b);
//        System.out.println(str);

        //by using while loop
        int x;
        while((x=r.read())!=-1)
        {
            System.out.print((char) x);
        }
    }
    catch(Exception e)
    {
        System.out.println("Exception => "+e);
    }
    }
}
