
class nanda
{
	int a = 100;
	
	void n1(int a)
	{
		System.out.println("I am in nanda");
	}
}

class sow extends nanda
{
	
	
int a = 100;
	
	void n1(int a)
	{
		System.out.println("I am in sow");
	}
	
	
}

class laks extends nanda
{
	
	
int a = 100;
int b = 700;
	
	void n1(int a,int b)
	{
		System.out.println("I am in laks");
		System.out.println(a*b);
	}
	
	void n1(int a,int b,int c)
	{
		System.out.println("I am in laks2");
		System.out.println(a*b*c);
	}
}




public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sow s1 = new sow();
		
		s1.a=200;
		
		System.out.println(s1.a);
		
		s1.n1(300);
		
        nanda n2 = new nanda();
       System.out.println( n2.a=400);
        n2.n1(55);
        
        laks l1 = new laks();
        l1.n1(5);
        l1.n1(5, 5);
        l1.n1(10, 10, 10);
        
        
	}

}
