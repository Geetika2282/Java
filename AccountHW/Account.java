package AccountHW;

import java.io.IOException;
import java.util.Scanner;

public class Account {
    private static int callCount = 0;
    Scanner sc = new Scanner(System.in);


    public int deposit() throws CallLimitException{
        callCount++;
        System.out.println("Enter deposit: ");
        int dep = sc.nextInt();
        if (callCount > 3) {
            throw new CallLimitException("Method has been called three times!");
        }
        return dep;
    }

    public int withdraw(){
        System.out.println("Enter withdraw: ");
        int withd = sc.nextInt();
        return withd;
    }






    public static void main(String[] args) {
        Account a = new Account();
//        a.deposit();
    }
}
