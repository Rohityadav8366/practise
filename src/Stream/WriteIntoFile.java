package Stream;

import java.io.FileOutputStream;

public class Demo {
    public static void main(String[] args)
    {
        try {
            FileOutputStream WriteINtoFile = new FileOutputStream("D:\\java pro\\practice\\src\\Stream\\Stream.txt");
            String str="Learn Stream in Java Programming  ";
            //Print the whole String by char wise into byte form;
            WriteINtoFile.write(str.getBytes());
            //Print the char from n to m;
            WriteINtoFile.write(str.getBytes(),5,28);
            //print the String via char by char 
            byte[] b=str.getBytes();
            for(byte x:b)
                WriteINtoFile.write(x);
            WriteINtoFile.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception => "+e);
        }
    }
}
