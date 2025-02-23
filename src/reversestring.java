
public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String nan = "Nanda";
		
		System.out.println(nan);
		
		String rev = " ";
		
		int len = nan.length();
		
		for(int i=len-1;i>=0;i--)
		{
			
			
			rev=rev+nan.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}

}
