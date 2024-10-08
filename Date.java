enum MONTH{
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
public class Date {
    private int date;
    MONTH month;
    private int year;

    public void setMonth(MONTH month) {
        this.month = month;
    }

    public void setDate(int date) {
        if(date<0 || date>31){
            System.out.println("Invalid");
        }
        else{this.date = date;}
    }

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int  incrementDay(int incrementVal){
        date += incrementVal;
        if(date>31){
            System.out.println("Increment month");
        }
        System.out.println(date+" "+this.month+" "+year);
        return date;
    }

    public String toString(){
        return date+" "+month+" "+year;
    }

    public static void main(String[] args) {
        Date dt = new Date();
        dt.setDate(22);
        dt.setMonth(MONTH.AUGUST);
        dt.setYear(2002);
        System.out.println(dt);
        dt.incrementDay(2);


    }
}
