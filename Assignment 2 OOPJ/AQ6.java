import java.util.*;

class Book
{
	private String author;
	private String title;
	private String publisher;
	private double cost;
	private int stockPosition;
	Scanner sr=new Scanner(System.in);
	
	ArrayList<Book> list = new ArrayList<Book>();
	Book()
	{
	}

	public Book(String author, String title, String publisher, double cost, int stockPosition) 
	{
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.cost = cost;
		this.stockPosition = stockPosition;
	}
	
	
	public String toString()
	{
		return "Book [Book Name = "+this.title+" Book Author = "+this.author+" Publisher = "+this.publisher+" Cost = "+this.cost+
		" Stock = "+this.stockPosition+ "]";
	}
	
	public String findBookInList(String title1, String author1)
	{
		for(Book x : list)
		{
			if(((x.title.equals(title1)) && (x.author.equals(author1))) == true)
			{
				System.out.println(x);
				System.out.println("Book Available Enter the quantity");
				int quantity=sr.nextInt();
				if(x.stockPosition >= quantity)
				{
					double cost1= x.cost * quantity;
					return " Desired Quantity Available\nCost of "+quantity+" books is Rs "+cost1
							+"\nThank You for purchasing from us!!!";
				}
				else
				{
					return" Desired Quantity Not Available";
				}
			}
		}
		return "Book Not Available";
	}
	
	
}
public class AQ6 {

	public static void main(String[] args) 
	{
		Book b=new Book();
		b.list.add(new Book("Author1","Title1","Publisher1",100,10));
		b.list.add(new Book("Author2","Title2","Publisher2",200,20));
		b.list.add(new Book("Author3","Title3","Publisher3",300,30));
		b.list.add(new Book("Author4","Title4","Publisher4",400,40));
		b.list.add(new Book("Author5","Title5","Publisher5",500,50));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title name");
		String title=sc.next();
		System.out.println("Enter the author name");
		String author=sc.next();
		String b1=b.findBookInList(title,author);
		System.out.println(b1);
		sc.close();

	}

	

}

