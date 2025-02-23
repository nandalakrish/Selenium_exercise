class s1{
	private String name = "Sow";
	private int age =28;
	
	public String getname(String name) {
		return name;
	}
	
	public int getage(int age)
	{
		return age;
		//System.out.println(age);
	}
	
	public String setname(String newname)
	{
		name=newname;
		//System.out.println(age);
	}
	
	public void setage(int newage)
	{
		age=newage;
		//System.out.println(age);
	}
}







public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		s1 s = new s1();
	s.getname("Nansow");
	s.getage(31);
	
	String nn = s.setname("Nandu");
	
	System.out.println();
		
		
	}

}
