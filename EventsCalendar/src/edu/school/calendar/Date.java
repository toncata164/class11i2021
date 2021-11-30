package edu.school.calendar;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public void setDay(int dayValue) {
		if(dayValue > 0 && dayValue < 32) {
			day = dayValue;
		}
	}
	
	public void setMonth(int monthValue) {
		if(monthValue > 0 && monthValue < 13) {
			month = monthValue;
		}
	}
	
	public void setYear(int yearValue) {
		if(yearValue > 0) {
			year = yearValue;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public Date(int dayValue, int monthValue, int yearValue) {
		setDay(dayValue);
		setMonth(monthValue);
		setYear(yearValue);
	}
	
	public String toString() {
		String res = "";
		
		res += "0" + getDay();
		
		if(getMonth() < 10) {
			res+= "0" + getMonth();
		}else {
			res+= getMonth();
		}
		
		if(getYear() < 10) {
			res+= "000" + getYear();
		}else if(getYear() < 100 &&  getYear() > 9) {
			res+= "00" + getYear();
		}else if(getYear() < 1000 && getYear() > 99) {
			res+= "0" + getYear();
		}else {
			res+= getYear();
		}
		
		return res;
	}
	
	public Date nextDate() {
		setDay(getDay() + 1);
		
		if(getMonth() == 1 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 ||getMonth() == 8 || getMonth() == 10 || getMonth() == 12) {
				if(getDay() > 31) {
					setDay(1);
					setMonth(getMonth() + 1);
			}
		}else if(getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11) {
			if(getDay() > 30) {
				setDay(1);
				setYear(getYear() + 1);
			}
		}else if(getMonth() == 2 && getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0) {
			if(getDay() > 29) {
				setDay(1);
				setYear(getYear() + 1);
			}
		}else if(getMonth() == 2) {
			if(getDay() > 28) {
				setDay(1);
				setYear(getYear() + 1);
			}
		}
		
		return ;
		
	}
}
