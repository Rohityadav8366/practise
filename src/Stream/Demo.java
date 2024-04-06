package Stream;

import java.io.FileOutputStream;

public class Demo {
    public static void main(String[] args)
    {
        try {
            FileOutputStream WriteINtoFile = new FileOutputStream("D:\\java pro\\practice\\src\\Stream\\Stream.txt");
            String str="Learn Stream in Java Programming1 ";
            WriteINtoFile.write(str.getBytes());
            WriteINtoFile.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
