import java.util.*;


class Person
{
	private int age;
	private double weight;
	private double height;
	private String dateOfBirth;
	private String address;
	
	Person()
	{
		
	}

	Person(int age, double weight, double height, String dateOfBirth, String address)
	{
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	String getDateOfBirth() {
		return dateOfBirth;
	}

	void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", weight=" + weight + ", height=" + height + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + "]";
	}	
}


class Students extends Person
{
	Scanner sc=new Scanner(System.in);
	int roll;
	int totalMarks=0;
	
	Map<String,Integer> courseMarks=new HashMap<String,Integer>();
	Students() 
	{
		super();
	}

	Students(int age, double weight, double height, String dateOfBirth, String address,int roll) 
	{
		super(age, weight, height, dateOfBirth, address);
		this.roll=roll;
	}
	void addcourseMarks()
	{
		System.out.println("Enter the subject");
		String subject=sc.next();
		System.out.println("Enter the marks out of 100");
		int marks=sc.nextInt();
		totalMarks=totalMarks+100;
		courseMarks.put(subject,marks);
	}
	void removeCourseMarks()
	{
		display();
		System.out.println("Enter the subject");
		String subject=sc.next();
		System.out.println("Enter the marks out of 100");
		int marks=sc.nextInt();
		courseMarks.remove(subject,marks);
	}
	
	void getGrade()
	{
		int sum = 0;
		for(Map.Entry<String,Integer> itr : courseMarks.entrySet())
		{
			sum=sum+(int)(itr.getValue());
		}
		System.out.println("Total Marks are = "+totalMarks);
		System.out.println("Obtained Marks are = "+sum);
		double percent=(sum*100)/totalMarks;
		System.out.println("Your Percentage are"+percent);
		if(percent>=90)
			System.out.println("Your grade is A+");
		else if(percent>=80 && percent<90)
			System.out.println("Your grade is B+");
		else if(percent>=70 && percent<80)
			System.out.println("Your grade is C+");
		else
			System.out.println("Your grade is D+");
	}
	void display()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Subject\t\t"+"Marks");
		for(Map.Entry<String,Integer> itr : courseMarks.entrySet())
		{
			System.out.println(itr.getKey()+"\t\t\t"+itr.getValue());
		}
		System.out.println("----------------------------------------------------------------------------");
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", courseMarks=" + courseMarks + ",Age=" + getAge() +
				",Weight=" + getWeight() + ",Height=" + getHeight()
		+ ",DateOfBirth=" + getDateOfBirth() + ",Address=" + getAddress() + "]";
	}
	
	
	
}





class Employee extends Person
{
	private double salary;
	private String dateOfJoining;
	private int experience;
	
	Employee() {
		super();
	}
	Employee(int age, double weight, double height,
			String dateOfBirth, String address,
			double salary, String dateOfJoining, int experience) 
	{
		super(age, weight, height, dateOfBirth, address);
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getDateOfJoining() {
		return dateOfJoining;
	}
	void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	int getExperience() {
		return experience;
	}
	void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [Salary=" + salary + ", DateOfJoining=" + dateOfJoining + ", Experience=" + experience
				+ ",Age=" + getAge() + ",Weight=" + getWeight() + ",Height=" + getHeight()
				+ ",DateOfBirth=" + getDateOfBirth() + ",Address=" + getAddress() + "]";
	}
}



class Technician extends Employee
{

	
	Technician() {
		super();
		
	}

	Technician(int age, double weight, double height, String dateOfBirth, String address, double salary,
			String dateOfJoining, int experience) {
		super(age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
		
	}

	@Override
	public String toString() {
		return "Technician [Salary=" + getSalary() + ",DateOfJoining=" + getDateOfJoining()
				+ ",Experience=" + getExperience() + ",Age=" + getAge() + ",Weight=" + getWeight() + ",Height=" + getHeight()
				+ ",DateOfBirth=" + getDateOfBirth() + ",Address=" + getAddress() + "]";
	}
	
}
 


class Professor extends Employee
{
	private String courses;
	private String listOfAdvisee;
	
	
	Scanner sc=new Scanner(System.in);
	Professor() {
		super();
		
	}

	Professor(int age, double weight, double height, 
			String dateOfBirth, String address,
			double salary,
			String dateOfJoining, int experience
			,String courses, String listOfAdvisee)
	{
		super(age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
		this.courses=courses;
		this.listOfAdvisee=listOfAdvisee;
	}
	ArrayList<String> courses1=new ArrayList<String>();
	ArrayList<String> listOfAdvisee1=new ArrayList<String>();

	void addCourses()
	{
		displayList();
		System.out.println("Enter the course");
		String input=sc.next();
		courses1.add(input);
	}
	
	void removeCourses()
	{
		displayList();
		System.out.println("Enter the index of Course you want to remove");
		int input=sc.nextInt();
		courses1.remove(input);
		
	}
	
	void addListOfAdvisee()
	{
		displayList();
		System.out.println("Enter the Advisee");
		String input=sc.next();
		listOfAdvisee1.add(input);
		
	}
	
	void removeListOfAdvisee()
	{
		displayList();
		System.out.println("Enter the index of Advisee you want to remove");
		int input=sc.nextInt();
		listOfAdvisee1.remove(input);
		
	}
	void displayList()
	{
		System.out.println("--------------------------------------------------------------------------");
		int i=0; int j=0;
		if(courses1.isEmpty())
		{
			System.out.println("Courses List is Empty");
		}
		else 
		{
			System.out.println("Courses List is :");
			for(String x : courses1)
			{
				System.out.println(i++ +".)"+x);
			}
		}
		System.out.println("--------------------------------------------------------------------------");
		if(listOfAdvisee1.isEmpty())
		{
			System.out.println("Courses List is Empty");
		}
		else
		{
			System.out.println("List  Of Advisee are :");
			for(String x : listOfAdvisee1)
			{
				System.out.println(j++ +".)"+x);
			}
		}
		System.out.println("--------------------------------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Professor [courses=" + courses + ", listOfAdvisee=" + listOfAdvisee + ", courses1=" + courses1
				+ ", listOfAdvisee1=" + listOfAdvisee1 + "Salary=" + getSalary() + ",DateOfJoining=" + getDateOfJoining()
						+ ",Experience=" + getExperience() + ",Age=" + getAge() + ",Weight=" + getWeight() + ",Height=" + getHeight()
						+ ",DateOfBirth=" + getDateOfBirth() + ",Address=" + getAddress() + "]";
	}
	
	
	
}






class AQ3 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("Enter your choice \n0.)Exit\n1.)Person\n2.)Student\n3.)Technician\n4.)Professor");
			choice=sc.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("You chose to exit");
				break;
				case 1:
					System.out.println("Enter age");
					int age=sc.nextInt();
					System.out.println("Enter weight");
					double weight=sc.nextDouble();
					System.out.println("Enter height");
					double height=sc.nextDouble();
					System.out.println("Enter dateOfBirth");
					String dateOfBirth=sc.next();
					System.out.println("Enter address");
					String address=sc.next();
					Person p=new Person(age,weight,height,dateOfBirth,address);
					System.out.println(p);
				break;
				case 2:
					System.out.println("Enter age");
					age=sc.nextInt();
					System.out.println("Enter weight");
					weight=sc.nextDouble();
					System.out.println("Enter height");
					height=sc.nextDouble();
					System.out.println("Enter dateOfBirth");
					dateOfBirth=sc.next();
					System.out.println("Enter address");
					address=sc.next();
					System.out.println("Enter the roll Number");
					int roll=sc.nextInt();
					Students s=new Students(age,weight,height,dateOfBirth,address,roll);
					System.out.println(s);
					int choice2=0;
					do
					{
						System.out.println("Enter Your choice \n0.)Exit\n1.)Display All Details\n2.)Add Subjects and Marks"
								+ "\n3.)Remove Subjects and Marks\n4.)Get Grade Obtained"
								+ "\n5.)Display Subjects Marks List");
						choice2=sc.nextInt();
						switch(choice2)
						{
							case 0:
								System.out.println("You chose to exit from  Student");
							break;
							case 1:
								s.toString();
								s.display();
							break;	
							case 2:
								s.addcourseMarks();
							break;
							case 3:
								s.removeCourseMarks();
							break;
							case 4:
								s.getGrade();
							break;	
							case 5:
								s.display();
							break;	
							
						}
					}while(choice2!=0);
				break;
				case 3:
					System.out.println("Enter age");
					age=sc.nextInt();
					System.out.println("Enter weight");
					weight=sc.nextDouble();
					System.out.println("Enter height");
					height=sc.nextDouble();
					System.out.println("Enter dateOfBirth");
					dateOfBirth=sc.next();
					System.out.println("Enter address");
					address=sc.next();
					System.out.println("Enter Salary");
					double salary=sc.nextDouble();
					System.out.println("Enter Date of Joining");
					String dateOfJoining=sc.next();
					System.out.println("Enter Experience");
					int experience=sc.nextInt();
					Technician t=new Technician(age,weight,height,dateOfBirth,address,salary,
							dateOfJoining,experience);
					System.out.println(t);
				break;
				case 4:
					System.out.println("Enter age");
					age=sc.nextInt();
					System.out.println("Enter weight");
					weight=sc.nextDouble();
					System.out.println("Enter height");
					height=sc.nextDouble();
					System.out.println("Enter dateOfBirth");
					dateOfBirth=sc.next();
					System.out.println("Enter address");
					address=sc.next();
					System.out.println("Enter Salary");
					salary=sc.nextDouble();
					System.out.println("Enter Date of Joining");
					dateOfJoining=sc.next();
					System.out.println("Enter Experience");
					experience=sc.nextInt();
					System.out.println("Enter Courses");
					String courses=sc.next();
					System.out.println("Enter List Of Advisee");
					String listOfAdvisee=sc.next();
					Professor p1=new Professor(age,weight,height,dateOfBirth,address,salary,
							dateOfJoining,experience,courses,listOfAdvisee);
					System.out.println(p1);
					int choice1=0;
					do
					{
						System.out.println("Enter Your choice \n0.)Exit\n1.)Display All Details\n2.)Add Courses"
								+ "\n3.)Remove Courses\n4.)Add List Of Advisee\n5.)Remove List Of Advisee");
						choice1=sc.nextInt();
						switch(choice1)
						{
							case 0:
								System.out.println("You chose to exit from  Professor");
							break;
							case 1:
								System.out.println(p1);
								p1.displayList();
							break;	
							case 2:
								p1.addCourses();
							break;
							case 3:
								p1.removeCourses();
							break;
							case 4:
								p1.addListOfAdvisee();
							break;	
							case 5:
								p1.removeListOfAdvisee();
							break;	
							
						}
					}while(choice1!=0);
				break;
			}
					
				
				
		
		}while(choice!=0);

	}

}
