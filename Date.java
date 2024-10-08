public class Date {
    private int date;
    private String month;
    private int year;

    public void setDate(int date) {
        if(date<0 || date>31){
            System.out.println("Invalid");
        }
        else{this.date = date;}
    }

    public int getDate() {
        return date;
    }


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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
        System.out.println(date+" "+month+" "+year);
        return date;
    }

    public String toString(){
        return date+" "+month+" "+year;
    }

    public static void main(String[] args) {
        Date dt = new Date();
        dt.setDate(22);
        dt.setMonth("August");
        dt.setYear(2002);
        System.out.println(dt);
        dt.incrementDay(2);


    }
}
