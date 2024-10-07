import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalcAge {
    public static void main(String[] args) {
        //        Calculate your age in no of days, months, years:
        LocalDate bdayGeet = LocalDate.of(2002,8,22);
        System.out.println(bdayGeet);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        Period age = bdayGeet.until(today);
        System.out.println(age);
        System.out.println(age.getYears() +"year(s)"+age.getMonths()+"month(s)"+age.getDays()+"day(s)");
        long totalDays = bdayGeet.until(today, ChronoUnit.DAYS);
        System.out.println(totalDays+" days");

        System.out.println("-----------------Programmer's day----------");
        // Compute programmer's day without using plusDays
        int CurrentYr = LocalDate.now().getYear();
        LocalDate progrmmersDay = LocalDate.of(CurrentYr, 1, 1).withDayOfYear(256);
        System.out.println("Programmers day: "+CurrentYr+" : "+progrmmersDay);

        LocalDate newYr = LocalDate.of(2024, 1, 1);
        int year = newYr.getYear();
        boolean isLeapYear = newYr.isLeapYear();

        LocalDate programmersDay = LocalDate.of(year, Month.SEPTEMBER, 13);
        System.out.println("Programmer's day: "+newYr.plusDays(256));
        long untilProgrammersDay = newYr.until(programmersDay, ChronoUnit.DAYS);
        System.out.println("Today is: "+newYr+ "\nDays until programmer's day: "+untilProgrammersDay);

        if(today.isAfter(programmersDay)){
            year += 1;
            programmersDay = LocalDate.of(year, Month.SEPTEMBER, 12);
        }
        else if(isLeapYear){
            programmersDay = LocalDate.of(year, Month.SEPTEMBER, 12);
        }
        long daysUntilProgrammersDay = ChronoUnit.DAYS.between(today, programmersDay);
        System.out.println(daysUntilProgrammersDay);
        System.out.println(today.until(programmersDay));

//  months starting with Sunday in 2024
        System.out.println(bdayGeet.getDayOfWeek());
        int month = today.getMonthValue();
        for(int currentMonth = 1; currentMonth<=12; currentMonth++){
            today = today.withMonth(currentMonth);

            LocalDate firstday = today.withDayOfMonth(1);
            if(firstday.getDayOfWeek() == DayOfWeek.SUNDAY){
                System.out.println(firstday.getMonth()+" "+firstday.getDayOfWeek());
            }
        }
        //            NYC and India time
        LocalDateTime indian = LocalDateTime.of(LocalDate.now(), LocalTime.of(02, 05));
        ZonedDateTime ist = indian.atZone(ZoneId.of("Asia/Calcutta"));
        Instant instant = ist.toInstant();
        ZonedDateTime nyc = instant.atZone(ZoneId.of("America/ New_York"));
        LocalDateTime departure = nyc.toLocalDateTime();
        LocalDateTime arrival = LocalDateTime.of(LocalDate.now(),LocalTime.of(4,40));
        Duration interval = Duration.between(departure,arrival);
        System.out.println(interval);


    }
}
