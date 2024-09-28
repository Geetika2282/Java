package AccountHW;

import java.io.IOException;
import java.util.Scanner;

class CallLimitException extends Exception {
    public CallLimitException(String message) {
        super(message);
    }
}