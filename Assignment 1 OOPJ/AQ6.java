import java.util.Scanner;
class Box
{
	double height;
	double width;
	double breadth;
	Box()
	{
	
	}
	Box(double height, double width, double breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double getVolume()
	{
		return height*width*breadth;
	}
	double getArea()
	{
		return (2*(breadth*width))+(2*(breadth*height))+(2*(height*width));
	}
	
}
class AQ6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height");
		double height=sc.nextDouble();
		System.out.println("Enter Width");
		double width=sc.nextDouble();
		System.out.println("Enter Breadth");
		double breadth=sc.nextDouble();
		Box a1=new Box(height,width,breadth);
		a1.getVolume();
		System.out.println("Volume = "+a1.getVolume());
		System.out.println("Surface Area = "+a1.getArea());
	}
}	