package edu.school.calendar.test;



import edu.school.calendar.Date;
import edu.school.calendar.DayOfWeek;
import edu.school.calendar.Event;
import edu.school.calendar.Time;

public class Test 
{
    public static void main(String ards[])
    {
        /*Time time = new Time(5, 45, 59);

        time.increaseSecond();

        System.out.println(time);

        Time time2 = new Time(5, 59, 59);

        time2.increaseSecond();

        System.out.println(time2);

        Time time3 = new Time(23, 59, 59);
        
        time3.increaseSecond();

        System.out.println(time3);*/
        
        Date d1 = new Date(28, 11, 2021);
        DayOfWeek current = d1.getDayOfWeek();
        //System.out.println(current); //TUESDAY
        Time sTime = new Time(13, 30, 0);
        Time eTime = new Time(16, 30, 0);
        Event event1 = new Event(d1, sTime, eTime, "Piano Lesson");
        System.out.println(event1);
        Date d2 = new Date(15, 05, 2021);
        Event event2 = new Event(d2, "Anne's birthday");
        System.out.println(event2);
    }
}
