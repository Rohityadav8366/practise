package OOPs;
 class Detail{
    private String name="rahul";
    private int passWord;
    private String email;

     public Detail(int passWord, String name, String email) {
         this.passWord = passWord;
         this.name = name;
         this.email = email;
     }
     public String getName() {
         return name;
     }

//     public void setName(String name) {
//         this.name = name;
//     }

     public int getPassWord() {
         return passWord;
     }

//     public void setPassWord(int passWord) {
//         this.passWord = passWord;
//     }

     public String getEmail() {
         return email;
     }

//     public void setEmail(String email) {
//         this.email = email;
//     }
 }

public class EncapOops {
    public static void main(String[] args) {
        //Detail d=new Detail();
//        d.setEmail("rohitkr@123");
//        d.setName("Rohit");
//        d.setPassWord(12345678);
        Detail d=new Detail(123,"rohit","Rohit@123");
        System.out.println(d.getEmail());
        System.out.println(d.getName());
        System.out.println(d.getPassWord());
    }
}
