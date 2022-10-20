import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
abstract class Publication
{
	private int noOfPages;
	private double price;
	private String publisherName;
	Publication(int noOfPages, double price,String publisherName)
	{
		this.noOfPages=noOfPages;
		this.price=price;
		this.publisherName=publisherName;
	}
	void setNoOfPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setPublisherName(String publisherName)
	{
		this.publisherName=publisherName;
	}
	int getNoOfPages()
	{
		return noOfPages;
	}
	double getPrice()
	{
		return price;
	}
	String getPublisherName()
	{
		return publisherName;
	}
	public abstract void publicationName(String name);
	public abstract void printDetails();
} 
class Book extends Publication
{
	private String bookName;
	Book(String bookName,int noOfPages, double price,String publisherName)
	{
		super(noOfPages,price,publisherName);
		//this.bookName=bookName;
		publicationName(bookName);
	}
	@Override
	public void publicationName(String bookName)
	{
		this.bookName=bookName;
	}
	@Override
	public void printDetails()
	{
		System.out.println("---------------------Book Details-------------------------");
		System.out.println("Book Name : "+bookName);
		System.out.println("No of Pages : "+this.getNoOfPages());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Publisher Name : "+this.getPublisherName());
		System.out.println("-----------------------------------------------------------");
	}
	
}
class Journal extends Publication
{
	private String journalName;
	Journal(String journalName,int noOfPages, double price,String publisherName)
	{
		super(noOfPages,price,publisherName);
		//this.bookName=bookName;
		publicationName(journalName);
	}
	@Override
	public void publicationName(String journalName)
	{
		this.journalName=journalName;
	}
	@Override
	public void printDetails()
	{
		System.out.println("---------------------Journal Details-------------------------");
		System.out.println("Book Name : "+journalName);
		System.out.println("No of Pages : "+this.getNoOfPages());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Publisher Name : "+this.getPublisherName());
		System.out.println("-----------------------------------------------------------");
		
	}
	
}
class LibraryAQ1
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Publication arr[]=new Publication[2];
		int choice=0;
		int i=0;
		for(;i<arr.length;)
		{
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Enter Your Choice \n0.)Exit		1.)Add a book 		2.)Add a Journal		3.)Print Library");
			choice=sc.nextInt();
			if(choice==0)
			break;
			switch(choice)
			{
				case 0:
					System.out.println("You chose to exit");
				break;
				case 1:
					System.out.println("Enter the details in following sequence Name,Pages, Price, Publisher Name");
					arr[i++]=new Book(sc.next(),sc.nextInt(),sc.nextDouble(), sc.next());
				break;
				case 2:
					System.out.println("Enter the details  Name,Pages, Price, Publisher Name");
					arr[i++]=new Book(sc.next(), sc.nextInt(),sc.nextDouble(), sc.next());
				break;
				case 3:
					try
					{
						for(int j=0;j<arr.length;j++)
						{
							if(arr[j]==null)
								continue;
							arr[j].printDetails();
							System.out.println("------------------------------------------------------------------------");
						}
					}
					catch(NullPointerException e)
					{
						System.out.println("Library is Empty");
					}
			}
			System.out.println("------------------------------------------------------------------------");
		}
		try
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==null)
					continue;
				arr[j].printDetails();
				System.out.println("------------------------------------------------------------------------");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Library is Empty");
		}
			
		}	
}