import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("number to check..");
		int num= sc.nextInt();
		
		int org_num = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		if(org_num==rev)
		{
		System.out.println("It is palindrom number");
		}
		else
		{
			System.out.println("it is not a palindrome number");
		}
	}

}
