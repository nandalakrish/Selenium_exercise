import java.util.Scanner;

public class findlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a value:");
		int a=sc.nextInt();
		
		System.out.println("enter b value:");
		int b=sc.nextInt();
		
		System.out.println("enter c value:");
		int c=sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println(a+ " is greater");
		}
		
		else if(b>a && b>c)
		{
			System.out.println(b+ " is greater");
		}
		
		else
			
		{
			System.out.println(c+ " is greater");
		}
	}

}
