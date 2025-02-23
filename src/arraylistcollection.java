import java.util.ArrayList;
import java.util.Iterator;

public class arraylistcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Object> mylist = new <Object> ArrayList<Object>();
		
		mylist.add("Nanda");
		mylist.add(158);
		mylist.add(10.2);
		mylist.add("Krish");
		mylist.add(158);
		
		
		
		
		System.out.println(mylist);
		
		System.out.println(mylist.get(0));
		
		System.out.println(mylist.set(3, "sow"));
		
		System.out.println(mylist.size());
		
		mylist.remove(0);

          mylist.add(1, "Nandhuuu");
          
          System.out.println(mylist);
          
          for(int i=0;i<mylist.size();i++)  
          {
        	System.out.println(mylist.get(i));  
          }
		
          for(Object X: mylist)
          {
        	  System.out.println(X);
          }
          
          Iterator it = mylist.iterator();
          
          while(it.hasNext())
          {
        	  System.out.println(it.next()
        			  );
          }
	}

}
