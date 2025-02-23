  interface shape
 {
	 
	 int a = 10;
	 int b = 20;
	 
	 default void n1()
	 {
		 System.out.println("I am in n1()");
	 }
	 
	 
	 static void n2()
	 {
		 System.out.println("I am in n2()");
	 }
	 
	 public abstract void n4();
	 
	 
 }



public class Interfacedemo implements shape {
	
	public void n3()
	{
		System.out.println("I am in n3()");
	}
	
	public void n4()
	{
		System.out.println("I am in n4()");
	}

	public static void main(String[] args) {
		
		Interfacedemo i1 = new Interfacedemo();
		
		i1.n1();
		i1.n3();
		
		shape.n2();
		
		
		System.out.println(a*b);
		i1.n4();

	}

}
