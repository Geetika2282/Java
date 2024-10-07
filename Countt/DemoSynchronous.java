package Countt;


public class DemoSynchronous {
    Counter c = new Counter();

    public DemoSynchronous() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    for (int i = 0; i < 50; i++) {
                        c.increment();
                        System.out.println(Thread.currentThread().getName() + ": " + c.getCount());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new DemoSynchronous(); // Start the thread by creating an instance
    }
}
