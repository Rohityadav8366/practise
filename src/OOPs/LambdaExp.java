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
       abstract int  sum(int x,int y);

        default void fun(){
            System.out.println("Ram");
        }
    }

    class LambdaExp {
        public static void main(String args[]) {
            // lambda expression to implement above
            // functional interface. This interface
            // by default implements abstractFun()
            FuncInterface fobj = (int x) -> System.out.println(2 * x);
            Student student=(int x,int y)->x+y;
            // This calls above lambda expression and prints 10.
            System.out.println(student);
            fobj.abstractFun(5);
            student.sum(3,4);
            fobj.normalFun();
        }
    }

