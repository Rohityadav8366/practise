package Stream;

import java.io.*;

class Student implements Serializable
{
    private int rollNo;
    private  String name;
    private float avg;
    private String dept;
    public static int Data=10;//it is not send into file serilizable is not access the static and transient keyword;

    public transient int t;//not send into file
    public Student(){}
    public Student(int r,String n,float a,String d)
    {
        rollNo=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    public String toString()
    {
        return "\nStudent Detail\n"+
                "\nRollNO "+rollNo+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}
public class Serialization
{
    public static void main(String[] args) throws Exception
    {
        // to write
//        FileOutputStream fos=new FileOutputStream("D:\\java pro\\practice\\src\\Stream\\Stream4.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        Student s=new Student(10,"Rohit",75.6f,"CSE");
//        oos.writeObject(s);
//        fos.close();
//        oos.close();

        // to read
        FileInputStream fos=new FileInputStream("D:\\java pro\\practice\\src\\Stream\\Stream4.txt");
        ObjectInputStream ois=new ObjectInputStream(fos);
        Student s=(Student) ois.readObject();
        System.out.println(s);
        fos.close();
        ois.close();
    }
}
