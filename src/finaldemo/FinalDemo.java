package finaldemo;
//variable,class,method can be final
//to declare constant initialize only once

public class FinalDemo {
     final int i = 1;
    String name;//blank final variable without initialization
     String address;
    public FinalDemo(){
        name="abc";

    }
    final void show(){
        System.out.println("in show method");
    }

    public static void main(String[] args) {
        FinalDemo obj =new FinalDemo();
        obj.show();
      //  obj.name="abc";//complile time error beacuse of final
        obj.address="pune";
    }
}
//class Child1 extends FinalDemo{
    //void show(){
  //  compile ti error because show method declared as final
//}
//void show1(){
    //System.out.println("in show1 method");
//}

   // public static void main(String[] args) {
   //     Child1 obj2=
    //}