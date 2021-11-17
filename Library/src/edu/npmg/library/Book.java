package edu.npmg.library;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	
	public Book(String title, String author, String publisher, String isbn)
	{
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setIsbn(isbn);
	}
	
	public Book()
	{
		this("Untitled", "Anonymous", "No publisher", "0000000000000");
	}
	
	private void setTitle(String title)
	{
		if(title != null && !title.isEmpty())
		{
			this.title = title;
		}
	}
	
	public String getTitle()
	{
		return title;
	}
	
	private void setAuthor(String author)
	{
		if(author != null && !author.isEmpty())
		{
			this.author = author;
		}
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	private void setPublisher(String publisher)
	{
		if(publisher != null && !publisher.isEmpty())
		{
			this.publisher = publisher;
		}
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	private void setIsbn(String isbn)
	{
		if(isbn != null && isbn.length() >= 10 && isbn.length() <= 13)
		{
			this.isbn = isbn;
		}
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public String toString()
	{
		return String.format("%s - %s, %s, %s", 
				getTitle(), getAuthor(),
				getPublisher(),
				getIsbn());
	}

}
