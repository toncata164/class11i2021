package edu.npmg.enums;

public enum DayOfWeek {
	MONDAY(1, "Понеделник"),
	TUESDAY(2, "Вторник"),
	WEDNESDAY(3, "Сряда"),
	THURSDAY(4, "Четвъртък"),
	FRIDAY(5, "Петък"),
	SATURDAY(6, "Събота"),
	SUNDAY(7, "Неделя");
	
	private int dayNumber;
	private String bgName;
	
	private DayOfWeek(int dayNumber, String bgName)
	{
		this.dayNumber = dayNumber;
		this.bgName = bgName;
	}
	
	public String toString()
	{
		return String.format("%s", bgName);
	}
}
