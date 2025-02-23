
public class oddeveninarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		int a[]= {2,4,6,7,9};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is even number");
				
		}
			else
			{
				System.out.println(a[i]+" is odd number");
			}
		
		//System.out.println(sum);
		
	}

	}

}
