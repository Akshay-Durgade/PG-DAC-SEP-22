import java.util.Scanner;
class Calculator
{
	private int real1;
	private int imaginary1;
	private int real2;
	private int imaginary2;
	Calculator()		//to initialize real and imaginary to zero 
	{
		this.real1=0;
		this.imaginary1=0;
		this.real2=0;
		this.imaginary2=0;
	}
	Calculator(int real1, int real2)	//to initiailize imaginary part to 0 but to initialize the real part to user defined value
	{
		this.real1=real1;
		this.real2=real2;
		this.imaginary1=0;
		this.imaginary2=0;
	}
	Calculator(int real1, int imaginary1, int real2, int imaginary2)	//to initialize real and imaginary values as user defined values
	{
		this.real1=real1;
		this.real2=real2;
		this.imaginary1=imaginary1;
		this.imaginary2=imaginary2;
	}
	void createFirstComplexNumber()
	{
		if(this.real1<0)
		System.out.println("First Complex Number is = "+this.real1+"+"+this.imaginary1+"i");
		else if(this.imaginary1<0)
		System.out.println("First Complex Number is = "+this.real1+""+this.imaginary1+"i");
		else if(this.real1<0 && this.imaginary1<0)
		System.out.println("First Complex Number is = "+this.real1+""+this.imaginary1+"i");
		else
		System.out.println("First Complex Number is = "+this.real1+"+"+this.imaginary1+"i");
	}
	void createSecondComplexNumber()
	{
		if(this.real2<0)
			System.out.println("Second Complex Number is = "+this.real2+"+"+this.imaginary2+"i");
		else if(this.imaginary2<0)
			System.out.println("Second Complex Number is = "+this.real2+""+this.imaginary2+"i");
		else if(this.real2<0 && this.imaginary2<0)
			System.out.println("Second Complex Number is = "+this.real2+""+this.imaginary2+"i");
		else
			System.out.println("Second Complex Number is = "+this.real2+"+"+this.imaginary2+"i");
	}
	void sum()
	{
		int sumreal=this.real1+this.real2;
		int sumimaginary=this.imaginary1+this.imaginary2;
		if(sumreal<0)
			System.out.println("Sum of Complex Number = "+sumreal+"+"+sumimaginary+"i");
		else if(sumimaginary<0)
			System.out.println("Sum of Complex Number = "+sumreal+""+sumimaginary+"i");
		else if(sumreal<0&&sumimaginary<0)
			System.out.println("Sum of Complex Number = "+sumreal+""+sumimaginary+"i");
		else
			System.out.println("Sum of Complex Number = "+sumreal+"+"+sumimaginary+"i");
	}
	void multiply()
	{
		int mul=(this.real1*this.real2 - this.imaginary1*this.imaginary2);
		int mul1=(this.real1*this.imaginary2 + this.real2*this.imaginary1);
		if(mul<0)
			System.out.println("Multiplication of Complex Number = "+ mul+"+"+ mul1+"i");
		if(mul1<0)
			System.out.println("Multiplication of Complex Number = "+ mul+""+ mul1+"i");
		if(mul<0&&mul1<0)
			System.out.println("Multiplication of Complex Number = "+ mul+""+ mul1+"i");
		else
			System.out.println("Multiplication of Complex Number = "+ mul+"+"+ mul1+"i");
	}
	
}
class AQ3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter Your choices\n0.)Exit\n1.)to initialize real and imaginary to zero\n2.)to initiailize imaginary part to 0 but to initialize the real part to user defined value\n3.)To initialize real and imaginary values as user defined values ");
			choice=sc.nextInt();
			System.out.println("-----------------------------------------------------------------------------");
			switch(choice)
			{
				case 0:
					System.out.println("You Chose to Exit Program Terminated :)");
				break;
				case 1:
					Calculator n=new Calculator();
					n.createFirstComplexNumber();
					n.createSecondComplexNumber();
					n.sum();
					n.multiply();
				
				break;
				case 2:
					System.out.println("Enter the number 1");
					System.out.println("Real Number");
					int real1=sc.nextInt();
					System.out.println("Enter the number 2");
					System.out.println("Real Number");
					int real2=sc.nextInt();
					n=new Calculator(real1,real2);
					n.createFirstComplexNumber();
					n.createSecondComplexNumber();
					n.sum();
					n.multiply();
				break;
				case 3:
					System.out.println("Enter the number 1");
					System.out.println("Real Number");
					real1=sc.nextInt();
					System.out.println("Imaginary Number");
					int imaginary1=sc.nextInt();
					System.out.println("Enter the number 2");
					System.out.println("Real Number");
					real2=sc.nextInt();
					System.out.println("Imaginary Number");
					int imaginary2=sc.nextInt();
					n=new Calculator(real1,imaginary1,real2,imaginary2);
					n.createFirstComplexNumber();
					n.createSecondComplexNumber();
					n.sum();
					n.multiply();
				break;
			}
			System.out.println("-----------------------------------------------------------------------------");
		}while(choice!=0);
	}
}