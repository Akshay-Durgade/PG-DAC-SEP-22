class Automobile
{
	private String make;
	private String type;
	private int maxSpeed;
	private double price;
	private double milage;
	private String registrationNumber;
	
	
	Automobile()
	{
		
	}
	Automobile(String make, String type, int maxSpeed, double price, double milage, String registrationNumber) {
		super();
		this.make = make;
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.milage = milage;
		this.registrationNumber = registrationNumber;
	}
	
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getMaxSpeed() 
	{
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getMilage() 
	{
		return milage;
	}
	public void setMilage(double milage)
	{
		this.milage = milage;
	}
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) 
	{
		this.registrationNumber = registrationNumber;
	}
}
class Track extends Automobile
{
	private int capacity;
	private String hoodType;
	private int noOfWheels;
	
	Track()
	{
		super();
	}
	
	Track(String make, String type, int maxSpeed, double price, double milage, String registrationNumber,
			int capacity, String hoodType, int noOfWheels) 
	{
		super(make, type, maxSpeed, price, milage, registrationNumber);
		this.capacity = capacity;
		this.hoodType = hoodType;
		this.noOfWheels = noOfWheels;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}
	public String getHoodType()
	{
		return hoodType;
	}
	public void setHoodType(String hoodType)
	{
		this.hoodType = hoodType;
	}
	public int getNoOfWheels()
	{
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels)
	{
		this.noOfWheels = noOfWheels;
	}
	@Override
	public String toString() {
		return "Track \ncapacity=" + capacity + "\nhoodType=" + hoodType + "\nnoOfWheels=" + noOfWheels + "\nMake="
				+ getMake() + "\nType=" + getType() + "\nMax Speed=" + getMaxSpeed() + "\nPrice="
				+ getPrice() + "\nMilage=" + getMilage() + "\nRegistration Number=" + getRegistrationNumber()
				+ "\n";
	}
}
class Car extends Automobile
{
	private int noOfDoors;
	private int seatingCapacity;
	
	Car()
	{
		super();
	}
	
	Car(String make, String type, int maxSpeed, double price, double milage, String registrationNumber,
			int noOfDoors, int seatingCapacity) 
	{
		super(make, type, maxSpeed, price, milage, registrationNumber);
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	}
	
	public int getNoOfDoors() 
	{
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors)
	{
		this.noOfDoors = noOfDoors;
	}
	public int getSeatingCapacity() 
	{
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity)
	{
		this.seatingCapacity = seatingCapacity;
	}
	
	@Override
	public String toString() {
		return "Car \nnoOfDoors=" + noOfDoors + "\nseating Capacity=" + seatingCapacity + "\nMake=" + getMake()
				+ "\nType=" + getType() + "\nMax Speed =" + getMaxSpeed() + "\nPrice=" + getPrice()
				+ "\nMilage=" + getMilage() + "\nRegistration Number =" + getRegistrationNumber()
				+  "";
	}
	
}

class AQ4
{
	public static void main(String args[])
	{
		Track t=new Track("TATA", "Freight",140,4500000,16,"ANDJGID215423620",24000,"Open",12);
		System.out.println(t.toString());
		
		Car c=new Car("ROLLS ROYCE","PHANTOM GHOST",240,100000000,8,"MH1234RR5432",4,4);
		System.out.println(c.toString());
	}
}