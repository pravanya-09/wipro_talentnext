package oops;

class Author {
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		}
	public String getName() {
		return name;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public char getGender() {
		        return gender;
		    }
		    
		    public String toString() {
		        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
		    }
		}

		class Book {
		    private String name;
		    private Author author; 
		    private double price;
		    private int qtyInStock;
		    public Book(String name, Author author, double price, int qtyInStock) {
		        this.name = name;
		        this.author = author;
		        this.price = price;
		        this.qtyInStock = qtyInStock;
		    }
		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public Author getAuthor() {
		        return author;
		    }

		    public void setAuthor(Author author) {
		        this.author = author;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public void setPrice(double price) {
		        this.price = price;
		    }

		    public int getQtyInStock() {
		        return qtyInStock;
		    }

		    public void setQtyInStock(int qtyInStock) {
		        this.qtyInStock = qtyInStock;
		    }
		    public String toString() {
		        return "Book Name: " + name + "\nPrice: " + price + "\nQuantity in Stock: " + qtyInStock +
		               "\nAuthor Details: " + author;
		    }
		

		
			public class Ques_2{
		    public static void main(String[] args) {
		        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
		        Book book = new Book("Harry Potter", author, 499.00, 50);
		        System.out.println(book);
		    }
		


	}

}
		
