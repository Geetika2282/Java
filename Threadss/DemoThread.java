package Threadss;

public class DemoThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); // thread will start only when you call start method.

//        If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:
        Thread t2 = new Thread(new Thread2());
        t2.start();

        for(int i=0; i<10; i++){
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
