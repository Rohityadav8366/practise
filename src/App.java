import java.util.Scanner;
public class App { 


static int primeNo(int t)
{
    for(int i=2;i<=t/2;i++){
        if(t%i==0){
        System.out.println("not prime"+ t);
        }else{ 
        System.out.println("prime ");}
    }
    return t; 
  
}
    
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            
            primeNo(x);
           
        }
    }


