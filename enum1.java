// used to define collection of constants
enum Status
{
            Running, Failed, Pending, Success;
}

public class enum1
{
    public static void main(String[] args) {
        int i=5;
//        Status.values() is a method that returns an array of all constants defined in the Status enum. This array will contain: Status.Running, Status.Failed, Status.Pending, and Status.Success.
        Status[] ss = Status.values();

        for(Status s: ss)
        {
            System.out.println(s + " : " +s.ordinal());
        }
    }
}


