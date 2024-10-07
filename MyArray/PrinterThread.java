package MyArray;

public class PrinterThread
{
    public static void main(String[] args) {
        char[] greeting = {'G', 'o', 'o', 'd', ' ', 'M', 'o', 'r', 'n', 'i', 'n', 'g'};
        PrintArray array = new PrintArray(greeting);

        new Thread(new Runnable() {
            @Override
            public void run() {
//                either make the method synchronized or call the method in synchronized way.
                synchronized (array){
                array.printCharArray();}
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (array){
                array.printCharArray();}
            }
        }).start();
    }
}
