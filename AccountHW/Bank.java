package AccountHW;

import java.util.Scanner;

public class Bank{
    public static void main(String[] args) throws CallLimitException {
        InsufficientFundException inF = new InsufficientFundException();
        Account acc = new Account();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue, else to exit");
        int n = sc.nextInt();
        while (n==1) {
//            System.out.println("Enter 1 to continue, else to exit");
//            n = sc.nextInt();
            int d = acc.deposit();
            int w = acc.withdraw();
            inF.checkFund(d, w);
        }
    }
}
