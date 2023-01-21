package superdemo;
//immediate parent
public class SuperDemo {
    int i=1;

        public void show(){
            System.out.println("I parent show method ");
        }
    }
    class Child1 extends SuperDemo{
        int i=2;
        public void show(){
            System.out.println(super.i);

            System.out.println("In child1 show method");
        }
    }
    class Child2 extends Child1 {
        int i = 3;

        public void show() {
            super.show();
            System.out.println(super.i);

            System.out.println("In child2 show method");
        }


        public static void main(String[] args) {
            Child2 obj = new Child2();
            obj.show();


        }
    }




