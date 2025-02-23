import java.awt.print.Printable;

public class Methodsconstructordemo {

	
	
	void Print()
		{
			System.out.println("hi....");
		}
	 
	int m1(int a,int b)
	{
		return a=100;
		return b=200;
		a+b;
	}
	
	void m2()
	{
		System.out.println("helllo");
	}
	
	Methodsconstructordemo()
	{
		int i =5;
		int j =10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Methodsconstructordemo ms = new Methodsconstructordemo();
		
		ms.Print();
		
		int nan = ms.m1(10, 20);
		
		System.out.println(nan);
		
	     
		ms.Print();
		
	}

}
