package composition;

import java.util.Arrays;

public class Book {

	private String name;
	private Author[] author;
	private double price;
	private int quanity = 0;
	
	public Book(String name, Author[] author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author[] author, double price, int quantity){
		this.name = name;
		this.author = author;
		this.price = price;
		this.quanity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + Arrays.toString(author)	+ ", price=" + price + ", quanity=" + quanity + "]";
	}

	
	
}
