package Date;
public class newDate {
    private int day;
    private String month;
    private int year;

    public void setDay(int day){
        this.day = day;
        if (day<0)
            System.out.println("Invalid");
        else
            this.day = day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(String month){
        this.month = month;
    }
    public String getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public int incrementDay(int day){
//        int d = d.setDate();
        return 0;
    }

    public static void main(String[] args) {
        newDate d = new newDate();
        d.setDay(22);
        d.setMonth("August");
        d.setYear(2002);

        System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.getYear());
    }

}
