import java.util.Arrays;
import java.util.Scanner;

class Book
{
	String book;
	String authors []=new String[3];
	int pages;
	float price;
	String publisher;
	Book()
	{
		
	}
	Book(String book, String authors1, String authors2,String authors3,int pages, float price, String publisher)
	{
	
		this.book = book;
		this.authors[0]= authors1;
		this.authors[1]= authors2;
		this.authors[2]= authors3;
		this.pages = pages;
		this.price = price;
		this.publisher = publisher;
	}
	String getBook() {
		return book;
	}
	void setBook(String book) {
		this.book = book;
	}
	String[] getAuthors() {
		return authors;
	}
	void setAuthors(String[] authors) {
		this.authors = authors;
	}
	int getPages() {
		return pages;
	}
	void setPages(int pages) {
		this.pages = pages;
	}
	float getPrice() {
		return price;
	}
	void setPrice(float price) {
		this.price = price;
	}
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book \nbook=" + book + ",\nauthors=" + Arrays.toString(authors) + ",\npages=" + pages + ",\nprice=" + price
				+ ",\npublisher=" + publisher;
	}
	
	
	
	
}
class Library1
{
	Scanner sc=new Scanner(System.in);
	Book arr[]=new Book[5];
	Book b=new Book();
	void addBook(int i,String book, String authors1, 
			String authors2,String authors3,int pages, float price, String publisher)
	{
		arr[i]=new Book(book,authors1,authors2,authors3,pages,price,publisher);
		
	}
	void removeBook()
	{
		display();
		System.out.println("Enter where you want to remove book");
		int i=sc.nextInt();
		arr[i]=null;
	}
	void display()
	{
		int i=0;
			for(Book x : arr)
			{
				if(x==null)
				{
					System.out.println(i++ +".)Shelf is Empty");
				}
				else
				{
				System.out.println(i++ +".)"+(x.book));
				}
			}
			System.out.println("----------------------------------------------------------");
	}
	void displayBookDetails()
	{
		display();
		System.out.println("Enter Number to display details");
		int i=sc.nextInt();
		if(arr[i]==null)
		{
			System.out.println("No Book on shelf No. "+i);
		}
		else
			System.out.println(arr[i].toString());
		System.out.println("----------------------------------------------------------");
	}
}
class LibraryAQ1{

	public static void main(String[] args) 
	{
		Library1 l=new Library1();
		int choice=0;
		Scanner sr=new Scanner(System.in).useDelimiter("\n");
		Scanner sr1=new Scanner(System.in);
		do
		{
			System.out.println("Enter Choice\n1.)Add\n2.)Display Shelf\n3.)Remove\n4.)Display Book Details"
					+ "\n0.)Exit");
			choice=sr1.nextInt();
			switch(choice)
			{
				case 0 :
				System.out.println("You Exited the program");
				break;
				case 1:
					System.out.println("Your Library is ");
					l.display();
					System.out.println("Enter the index where you want to enter book"
							+ "\nIndex from 0 to 4");
					int j=sr1.nextInt();
					System.out.println("Enter the Book Name");
					String book=sr.next();
					System.out.println("Enter the Author Name");
					String Author1=sr.next();
					System.out.println("Enter the Author Name");
					String Author2=sr.next();
					System.out.println("Enter the Author Name");
					String Author3=sr.next();
					System.out.println("Enter the Pages");
					int pages1=sr1.nextInt();
					System.out.println("Enter the Price");
					float price1=sr1.nextFloat();
					System.out.println("Enter the Publisher Name");
					String publisher1=sr.next();
					l.addBook(j,book,Author1,Author2,Author3,pages1,
							price1,publisher1);
					l.display();
					break;
				case 2:
					System.out.println("Shelf Display is");
					l.display();
					break;
				case 3:
					l.removeBook();
					break;
				case 4:
					l.displayBookDetails();
			}
		}while(choice!=0);
		sr.close();
	}
}





//System.out.println("Enter the author name,"
//		+ "if available or enter null");
//for(int i=0;i<author.length;i++)
//{
//	author[i]=sr.next();
//}
