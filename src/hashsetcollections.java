import java.util.HashSet;
import java.util.Iterator;

public class hashsetcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		hs.add(101);
		hs.add(101);
		hs.add("NAnda");
		hs.add("java");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println(hs.remove("java"));
		
		for(Object X: hs)
		{
			System.out.println(X);
		}
		
		Iterator it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		hs.clear();
		
		System.out.println(hs);
		
	}

}
