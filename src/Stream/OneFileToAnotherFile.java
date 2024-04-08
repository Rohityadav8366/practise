package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class OneFileToAnotherFile {
    public static void main(String[] args) throws Exception
    {
        FileInputStream read=new FileInputStream("D:\\java pro\\practice\\src\\Stream\\Stream.txt");
        FileOutputStream write=new FileOutputStream("D:\\java pro\\practice\\src\\Stream\\Stream2.txt");
        FileOutputStream destination=new FileOutputStream("D:\\java pro\\practice\\src\\Stream\\Stream3.txt");
      // SequenceInputStream sis=new SequenceInputStream(read,);
        int x;
        while((x=read.read())!=-1)
        {
            if(x>=65&&x<=120)
                write.write(x+32);
               // destination.write(x+32);
            else
                write.write(x);
            destination.write(x);
        }
        read.close();
        write.close();
    }
}
