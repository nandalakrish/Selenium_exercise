import java.util.HashMap;

public class hasmapcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		
		hm.put("id", 101);
		hm.put("name", "nanda");
		hm.put("emp", "IT");
		hm.put("id", 101);
		hm.put("class", 12);
		
		System.out.println(hm.values());
		
		System.out.println(hm.get("name"));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.size());
		
		System.out.println(hm.entrySet());
		
		for(Object X: hm)
		{
			System.out.println(X);
		}
		
		
	}

}
