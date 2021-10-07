import java.util.*;
public class arraylistexample {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("ajay");
		list.add("vijay");
		list.add("ajay");
		list.add("ravi");
		list.add("sanjay");
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
