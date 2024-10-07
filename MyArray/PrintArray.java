package MyArray;

public class PrintArray {
    private char[] greeting;

    public PrintArray(char[] greeting)
    {
        this.greeting=greeting;
    }


    public void printCharArray(){
        for(char c : greeting)
            System.out.println(c);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
