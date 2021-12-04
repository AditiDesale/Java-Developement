import java.util.*;

class LL
{
	public static void main(String arg[])
	{
		LinkedList <Integer> obj = new LinkedList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		System.out.println("Data from linked list : ");
		System.out.println(obj);
		
		//obj.remove(2);    //index number
		//obj.add(1,55);
		//obj.add(10);    //duplicates 
		
		Iterator <Integer> iobj = obj.iterator();
		System.out.println("Data from linked list using iterator : ");
		
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}
		
		obj = null;
	}
}