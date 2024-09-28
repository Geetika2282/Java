package AccountHW;

import java.io.IOException;

public class InsufficientFundException extends Exception{

    public void checkFund(int deposit, int withdraw){
        try{
            if(deposit < withdraw){
                throw new IOException("Withdrawal more than Deposit ");
            }
        }
        catch (Exception e)
        {System.out.println(e.getMessage());}

    }
}
