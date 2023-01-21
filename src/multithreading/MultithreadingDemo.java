package multithreading;



class myThread1 extends Thread{
    public void run(){
        System.out.println("i am in thread1");
    }
}
class myThread2 extends Thread{
    public void run(){
        System.out.println("i am in thread2");
    }

}
public class MultithreadingDemo {
    public static void main(String[] args) {


        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.run();
        t2.run();
    }
}
