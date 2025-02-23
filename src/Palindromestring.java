import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string..");
		String num = sc.next();
		String org = num;
		String rev="";
		
		int len = num.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
		}
		
		if(org.equals(rev))
		{
		System.out.println("it is palindrome..");
		}
		else
		{
			System.out.println("it is not a  palindrome..");
		}
			
		
		
	}

}
