package edu.school.calendar.test;

import edu.school.calendar.Time;

public class Test 
{
    public static void main(String ards[])
    {
        Time time = new Time(5, 45, 59);

        time.increaseSecond();

        System.out.println(time);

        Time time2 = new Time(5, 59, 59);

        time2.increaseSecond();

        System.out.println(time2);

        Time time3 = new Time(23, 59, 59);
        
        time3.increaseSecond();

        System.out.println(time3);
    }
}
