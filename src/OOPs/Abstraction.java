package OOPs;
 abstract class Car
{
    String brand;
    int marketPrize;
    String name;
    public Car(String name,int marketPrize,String brand){
        this.name=name;
        this.brand=brand;
        this.marketPrize=marketPrize;
    }

     abstract void car();
     abstract String BuyCar();
     static  void carBrand(String brand,int marketPrize,String name){
         System.out.println("Brand->"+brand+" marketPrize->"+marketPrize+" Name->"+name);
     }

}
public class Abstraction {
    public static void main(String[] args) {
        Car c=new Car("Oodi123",123,"Oodi") {
            @Override
            void car() {
                System.out.println(brand);
                System.out.println(marketPrize);
                System.out.println(name);
            }

            @Override
            String BuyCar() {
                return "";
            }
        };
        c.carBrand("OOdi123",3400000,"Oodi");
    }
}
