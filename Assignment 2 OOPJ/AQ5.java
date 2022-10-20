import java.util.ArrayList;
import java.util.Iterator;

interface Shape
{
	double area();
	void draw();
	void rotate();
	void move();
}
class Circle implements Shape
{
	private double radius;
	private final double PI = 3.14;
	private double area;
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	public double area()
	{
		area= PI*radius*radius;
		return area;
	}
	@Override
	public void draw()
	{
		System.out.println("We are drawing Circle");
	}
	@Override
	public void rotate()
	{
		System.out.println("We are rotating Circle");
	}
	@Override
	public void move()
	{
		print();
		System.out.println("We are moving Circle");
		System.out.println("-----------------------------------------");
	}
	void print()
	{
		System.out.println("Radius = "+this.radius+
				"\tArea = "+this.area());
	}
	
}
class Rectangle implements Shape
{
	private double length;
	private double breadth;
	private double area;
	
	Rectangle()
	{
		
	}
	Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double area() {
		area=length*breadth;
		return area;
	}

	@Override
	public void draw() 
	{
		System.out.println("Drawing Rectangle");
	}

	@Override
	public void rotate() 
	{
		System.out.println("Rotate Rectangle");
		
	}

	@Override
	public void move() 
	{
		print();
		System.out.println("Moving Rectangle");
		System.out.println("-----------------------------------------");
		
	}
	void print()
	{
		System.out.println("Length = "+this.length+
				"\tBreadth = "+this.breadth+"\tArea = "
				+this.area());
	}
	
}
class AQ5 {

	public static void main(String[] args) 
	{
		ArrayList<Shape> a=new ArrayList<Shape>();
		a.add(new Circle(45.0));
		a.add(new Circle(10.63));
		a.add(new Rectangle(10,20));
		a.add(new Rectangle(12.6,22.5));
		a.add(new Rectangle(16,06));
		
		Iterator<Shape> itr= a.iterator();
		while(itr.hasNext())
		{
			itr.next().move();
		}
		

	}

}
