package edu.school.calendar;

public class Time 
{
    private int hour;
    private int second;
    private int minute;

    public void setHour(int hourValue)
    {
        if(hourValue >= 0 && hourValue < 24)
        {
            hour = hourValue;
        }
    }

    public void setMinnute(int minuteValue)
    {
        if(minuteValue >= 0 && minuteValue < 60)
        {
            minute = minuteValue;
        }
    }

    public void setSecond(int secondValue)
    {
        if(secondValue >= 0 && secondValue < 60)
        {
            second = secondValue;
        }
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public Time(int hour, int minute, int second)
    {
        setHour(hour);
        setMinnute(minute);
        setSecond(second);
    }

    public Time()
    {
        setHour(0);
        setMinnute(0);
        setSecond(0);
    }

    String toString()
    {
        String res = "";

        if(getHour() < 10)
        {
            res += "0" + getHour() + ":";
        }
        if(getMinute() < 10)
        {
            res += "0" + getMinute() + ":";
        }
        if(getSecond() < 10)
        {
            res += "0" + getSecond();
        }

        return res;
    }

    public void increaseSecond()
    {
        second ++;

        if(second > 60)
        {
            second = 0;
            minute ++;
        }

        if(minute > 60)
        {
            minute = 0;
            hour ++;
        }

        if(hour > 24)
        {
            hour = 0;
        }
    }
}
