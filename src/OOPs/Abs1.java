package OOPs;

import javax.xml.catalog.Catalog;

abstract class Animal1{
    private String name;
    public Animal1(String name){
        this.name=name;
    }
    public abstract void makeSound();
    public String getName(){
        return name;
    }
}

class Dog extends Animal1{
    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+" sound  barks");
    }
}
class Cat extends Animal1{
    public Cat(String name){
        super(name);
    }
    public void makeSound()
    {
        System.out.println(getName()+" sound  meows");
    }
}
public class Abs1 {
    public static void main(String[] args) {
        Animal1 a=new Cat("Tomy");
        Animal1 a1=new Dog("penny");
        a.makeSound();
        a1.makeSound();
    }
}
