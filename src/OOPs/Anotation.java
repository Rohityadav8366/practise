/*
* Annotations in Java
Annotations are used to provide supplemental information about a program.

Annotations start with ‘@’.
Annotations do not change the action of a compiled program.
Annotations help to associate metadata (information) to the program elements i.e.
*  instance variables, constructors, methods, classes, etc.
Annotations are not pure comments as they can change the way a program is
*  treated by the compiler. See below code for example.
Annotations basically are used to provide additional information,
*  so could be an alternative to XML and Java marker interfaces
*
*  @Deprecated
*  @Override
*  @SuppressWarnings
*  @Documented
*   @Inherited
 */




package OOPs;
class Ab
{
    public void showDataThisClass()
    {
        System.out.println("in A show");
    }

}
class Bc extends Ab{
    public void showDataThisClass(){
        System.out.println("in B show");
    }

}
public class Anotation {
    public static void main(String[] args) {
        Bc obj=new Bc();
        obj.showDataThisClass();
    }
}
