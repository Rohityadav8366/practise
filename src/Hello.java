//class Outer{
//    int x=20;
//    class Inner{
//        int y=10;
//        void innerDisplay()
//        {
//            System.out.println("outer \n"+x);
//            System.out.println("inner "+y);
//        }
//
//    }
//    void outerDisplay()
//    {
//        Inner i=new Inner();
//        i.innerDisplay();
//    }
//}
//class Hello{
//    public static void main(String[] args) {
//        Outer o=new Outer();
//        o.outerDisplay();
//        Outer.Inner oi=new Outer.newInner();
//        oi.outerDisplay();
//
//    }
//}