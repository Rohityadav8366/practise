package OOPs;

import org.w3c.dom.ls.LSOutput;

class loginID
{
   private String email;
    private int password;

    public void setEmail(String a) {
        email=a;
    }

    public String getEmail() {
       // System.out.println(email);
        return email;
    }
    public void setPassword(int a)
    {
       password=a;
    }
    public int getPassword()
    {
       // System.out.println(password);
        return password;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        loginID li=new loginID();
        li.setEmail("rohityadav@1f23");
        li.setPassword(12345);
        System.out.println(li.getEmail());
        System.out.println(li.getPassword());
    }
}


