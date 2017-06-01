package bookApplication;

public class Book {
	
	private String bookTitile;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	
	public Book(){}

	public Book(String bookTitile, String author, String description, double price, boolean b) {
		super();
		this.bookTitile = bookTitile;
		this.author = author;
		this.description = description;
		this.price = price;
		this.isInStock = b;
	}
	
	public double pricing(int numberOfOrder){
		if(isInStock){
			return price * numberOfOrder;
		}else
		
		return 0.00;
	}
	public String getDisplaytext(){
		return "Author: "+author +" \n"+"Book Titile: "+ bookTitile+" \n"+"Description: "+description;
	}

	public String getBookTitile() {
		return bookTitile;
	}

	public void setBookTitile(String bookTitile) {
		this.bookTitile = bookTitile;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsInStock() {
		return isInStock;
	}

	public void setIsInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	
	
}
