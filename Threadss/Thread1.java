/*
    Threads allow the program to operate more efficiently by doing multiple things at a time.
    Threads can be used to perform complicated tasks in the background without interrupting the main program.
*/


package Threadss;

public class Thread1 extends Thread{
//    Way 1  to create threads:
//    extend Thread and override run method
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
