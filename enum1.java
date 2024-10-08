// used to define collection of constants
enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
class Test{
    Day day;
    public Test(Day day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case MONDAY -> System.out.println("Week begins!");
            case FRIDAY -> System.out.println("Weekend's eve!!");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
            default -> System.out.println("midweek");
        }

    }
}
public class enum1
{

    //  Enum is a class type, we don't need to instantiate it using new, it has same capabilities as other classes. This fact makes Java enumeration a very powerful tool. Just like classes, you can give them constructors, add instance variables and methods, and even implement interfaces. unlike classes, enumerations neither inherit other classes nor can get extended(i.e become superclass).  We can also add variables, methods, and constructors to it. The main objective of an enum is to define our own data types(Enumerated Data Types)




    public static void main(String[] args) {

        Day d1 = Day.MONDAY;
        System.out.println(d1);
        Test t = new Test(Day.SATURDAY);
        t.dayIsLike();

    }
}


