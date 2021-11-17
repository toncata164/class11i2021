package edu.npmg.library;

public class ReaderProfile {
	private String firstName;
	private String lastName;
	private int grade; //klass
	private char subGrade; //paralelka
	private String phoneNumber;
	private Book[] takenBooks;
	
	
	public ReaderProfile(String firstName, String lastName,
			int grade, char subGrade, String phoneNumber, Book[] takenBooks)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		setGrade(grade);
		setSubGrade(subGrade);
		setPhoneNumber(phoneNumber);
		this.takenBooks = takenBooks;
	}
	
	public ReaderProfile(String firstName, String lastName,
			int grade, char subGrade, String phoneNumber)
	{
		this(firstName, lastName, grade, subGrade, phoneNumber,
				new Book[10]);
	}
	
	public void setGrade(int grade)
	{
		if(grade >= 1 && grade <= 12)
		{
			this.grade = grade;
		}
	}
	
	public void setSubGrade(char subGrade)
	{
		if(subGrade >= 'a' && subGrade <= ('a'+9))
		{
			this.subGrade = subGrade;
		}
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		if(phoneNumber != null && 
				(phoneNumber.length() == 10 || phoneNumber.length() == 13))
		{
			this.phoneNumber = phoneNumber;
		}
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public char getSubGrade()
	{
		return subGrade;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public Book[] getTakenBooks()
	{
		return takenBooks;
	}

	
	public String toString()
	{
		String takenBooks = "";
		for(Book b : getTakenBooks())
		{
			if(b == null)
				continue;
			takenBooks += b.getTitle()+" ";
		}
		return String.format("%s %s, %d%c, %s, %s", getFirstName(),
				getLastName(), getGrade(), getSubGrade(), getPhoneNumber(),
				takenBooks);
	}
	
}
