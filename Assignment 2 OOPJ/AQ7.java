class Author
{
	private String name;
	private String email;
	private char gender;
	Author()
	{
		
	}
	Author(String name, String email, char gender) 
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author \nName=" + name + ",\nemail=" + email + ",\ngender=" + gender + "";
	}
	
}
class Book
{
	private String name;
	private String author;
	private double price;
	private int qtyInStock;
	Book(String name, String author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	int getQtyInStock() {
		return qtyInStock;
	}
	void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	String getName() {
		return name;
	}
	String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book \nBook name=" + name + ", \nAuthor=" + author + ",\nPrice=" + price + ",\nStock=" + qtyInStock + "";
	}
	
	
	
}
public class AQ7 {

	public static void main(String[] args) {
		Author b=new Author("Robert T Kiyosaki","Robertkiyosaki@gmail.com",'m');
		
		Book a=new Book("Rich Dad Poor Dad","Robert T Kiyosaki",350,50000);
		System.out.println("Book Name = "+a.getName());
		System.out.println("Price = "+a.getPrice());
		System.out.println("Stock = "+a.getQtyInStock());
		System.out.println("----------------------------------------------------");
		System.out.println(b);
		System.out.println("----------------------------------------------------");

	}

}
