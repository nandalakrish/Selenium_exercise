import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number...");
		
		int num = sc.nextInt();
		
		/*
		
		int rev= 0;
		
		
		while(num!=0)
		{
			
			rev= rev*10 + num%10;
			num=num/10;
			
		}
		
		
		System.out.println("Revered number: "+rev);
		*/
		
		StringBuffer nan = new StringBuffer(String.valueOf(num));
		StringBuffer rev= nan.reverse();
		
		System.out.println(rev);
		
	}

}



