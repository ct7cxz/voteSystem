package com.Bean;

public class bookformBean {
	private String bookISBN;
	private String bookName;
	private String bookAuthor;
	private String bookPrice;
	private String bookPublish;
	private String bookAbstract;
	
	
	public bookformBean() {
		super();
	}
	
	
	public bookformBean(String bookISBN, String bookName, String bookAuthor, String bookPrice, String bookPublish,
			String bookAbstract) {
		super();
		this.bookISBN = bookISBN;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublish = bookPublish;
		this.bookAbstract = bookAbstract;
	}


	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public String getBookAbstract() {
		return bookAbstract;
	}
	public void setBookAbstract(String bookAbstract) {
		this.bookAbstract = bookAbstract;
	}
	
	
	
}
