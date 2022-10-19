import java.util.Scanner;
class Room
{
	private double height;
	private	double width;
	private double breadth;
	private double volume;
	
	Room(double height, double width, double breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double volume()
	{
		volume=(this.height*this.width*this.breadth);
		return volume;
	}
}
class AQ4RoomDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("0.)Exit     1.)Calculate Volume");
			choice=sc.nextInt();
			if(choice==0)
				break;
			System.out.println("Enter Room Height, Width and Breadth in mentioned sequence only");
			Room r1=new Room(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			System.out.println("Volume of Room is = "+r1.volume());
			System.out.println("____________________________________________________________________");
		}while(choice!=0);
	}
}