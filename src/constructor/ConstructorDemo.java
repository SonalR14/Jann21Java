package constructor;

import java.util.concurrent.Callable;

/*constructor is a method which is automatically invoked whwn object of a class is created
//types-1.default 2.parameter
//rule1. constructor name and class name same
      2.
*/
public class ConstructorDemo {
    public ConstructorDemo(){       //default constructor
        System.out.println("in constructor");

    }
    public ConstructorDemo(int i){  //parameter constructor
        System.out.println("in  parameter constructor");

    }
    public ConstructorDemo(int i,int j){       //parameter  constructor
        System.out.println("in 2 paramter constructor");

    }
    public void show() {
        System.out.println("in show");
    }

    public static void main(String[] args) {
        ConstructorDemo obj=new ConstructorDemo(5,7);
        obj.show();


            }
        }


