/*
* In Java, Enumerations or Java Enum serve the purpose of representing
* a group of named constants in a programming language. Java Enums are
*  used when we know all possible values at compile time, such as choices
*  on a menu, rounding modes, command-line flags, etc. The set of constants
* in an enum type doesn’t need to stay fixed for all time.
*
* what is Enumeration or Enum in Java?
*
*A Java enumeration is a class type. Although we don’t need to instantiate
*  an enum using new, it has the same capabilities as other classes.
*  This fact makes Java enumeration a very powerful tool. Just like
*  classes, you can give them constructors, add instance variables
*  and methods, and even implement interfaces.
*
*One thing to keep in mind is that, unlike classes, enumerations
* neither inherit other classes nor can get extended(i.e become
*  superclass).  We can also add variables, methods, and constructors
* to it. The main objective of an enum is to define our own data types
* (Enumerated Data Types).
*
*Declaration of enum in Java
Enum declaration can be done outside a Class or inside a Class but not inside a Method.
*
*Properties of Enum in Java
There are certain properties followed by Enum as mentioned below:

Every enum is internally implemented by using Class.
Every enum constant represents an object of type enum.
Enum type can be passed as an argument to switch statements.
Every enum constant is always implicitly public static final.
* Since it is static, we can access it by using the enum Name.
*  Since it is final, we can’t create child enums.
We can declare the main() method inside the enum.
*  Hence we can invoke the enum directly from the Command Prompt.
*
* */

package OOPs;
enum Status
{
    Rohit ,kumar,yadav,Raju ,Prachi;
}
public class Enum {
    public static void main(String[] args) {
        Status[] s= new Status[]{Status.kumar};
       for(Status v:Status.values()){
           System.out.println(v+" : "+v.ordinal());
        }
    }
}
