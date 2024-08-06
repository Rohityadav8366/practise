package OOPs;

    interface FuncInterface {
        // An abstract function
        void abstractFun(int x);

        // A non-abstract (or default) function
        default void normalFun() {
            System.out.println("Hello");
        }
    }
    interface Student {
       abstract  void sum(int x,int y);
    }
    interface Animal{
        void name(String str,int x);
    }

    class LambdaExp {
        public static void main(String args[]) {
            // lambda expression to implement above
            // functional interface. This interface
            // by default implements abstractFun()
            FuncInterface fobj = (int x) -> System.out.println(2 * x);

            Student student=(int x,int y)-> System.out.println(x+y);
            // This calls above lambda expression and prints 10.
            fobj.normalFun();
            fobj.abstractFun(5);
            student.sum(3,4);

            //Zero Parametrized
//            Animal animal=()-> System.out.println("Rohit");
//            animal.name();
            //one Parametrized
           Animal animal= (str,x)-> System.out.println();
          animal=(String str,int x)-> System.out.println(str);
            animal.name("rohit",4);
            //rohit kr yadav
        }
    }

