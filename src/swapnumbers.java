
public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5 , b=10;
		 
		System.out.println("A and b values before..." +a+"  "+b);
		
		/*
		int t =a;
		 a = b;
		 b= t;
		 */
		
		b=a-b+(a=b);
		
		 System.out.println("A and b values after..." +a+"  "+b);
			
	}

}
