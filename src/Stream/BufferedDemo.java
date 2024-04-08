package Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedDemo {
    public static void main(String[] args) throws Exception
    {
        FileInputStream read=new FileInputStream("D:\\java pro\\practice\\src\\Stream\\Stream.txt");
        BufferedInputStream buff=new BufferedInputStream(read);
        //this line of code is read the data from file.
//        int x;
//        while ((x=read.read())!=-1)
//        {
//            System.out.print((char) x);
//        }

        //this line of code is take  the data from file and transffer to the buffer space(it is temporery space in memory which store the data for some time)

 //        System.out.println("File "+read.markSupported());
//        System.out.println("Buffer "+buff.markSupported());

        //this line of code is read the data from file and reverse and  repeat the data again
        System.out.print((char) buff.read());
        System.out.print((char) buff.read());
        System.out.print((char)buff.read());
        read.mark(10);
        System.out.print((char)buff.read());
        System.out.print((char)buff.read());
        read.reset();
        System.out.print((char) buff.read());
        System.out.print((char) buff.read());


    }
}
