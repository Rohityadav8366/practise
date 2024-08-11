package OOPs;
 class Detail{
    private String name;
    private int passWord;
    private String email;


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPassWord() {
         return passWord;
     }

     public void setPassWord(int passWord) {
         this.passWord = passWord;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

 }

public class EncapOops {
    public static void main(String[] args) {
        Detail d=new Detail();
        d.setEmail("rohitkr@123");
        d.setName("Rohit");
        d.setPassWord(12345678);
        System.out.println(d.getEmail());
        System.out.println(d.getName());
        System.out.println(d.getPassWord());
    }
}
