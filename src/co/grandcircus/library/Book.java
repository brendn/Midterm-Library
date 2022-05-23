package co.grandcircus.library;

import java.util.Date;

public class Book {
	
	private final String title;
	private final String author;
	private Status status;
	private int condition = 10;
	private Date dueDate = null;
	
	public Book(String title, String author, Status status, int condition) {
		this.title = title;
		this.author = author;
		this.status = status;
		this.condition = condition;
	}
	
	public Book(String title, String author, Status status) {
		this(title, author, status, 10);
	}
	
	public enum Status {
		ON_SHELF, CHECKED_OUT;
	}
	
	public void checkIn() {
		if (condition <= 0) {
			condition = 10;
			System.out.println("RECYCLED");
		}
	}
	
	public void checkOut() {
		condition--;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public int getCondition() {
		return condition;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	

}
