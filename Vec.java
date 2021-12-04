import java.util.*;

class HT
{
	public static void main(String arg[])
	{
		Vector <Integer> vobj1 = new Vector <Integer>();
		System.out.println("Size of vobj1 : " + vobj1.size());
		System.out.println("Capacity of vobj1 : " + vobj1.capacity());
		
		Vector <Integer> vobj2 = new Vector <Integer>(20);
		System.out.println("Size of vobj2 : " + vobj2.size());
		System.out.println("Capacity of vobj2 : " + vobj2.capacity());
		
		Vector <Integer> vobj3 = new Vector <Integer>(40,30);
		System.out.println("Size of vobj3 : " + vobj3.size());
		System.out.println("Capacity of vobj3 : " + vobj3.capacity());
		
		vobj1.add(11); 
		vobj1.add(21);
		vobj1.add(51);
		vobj1.add(101);
		
		System.out.println("Size of vobj1 : " + vobj1.size());
		vobj1.remove(2);   //index 2
		vobj1.set(0,12);   //0th index updated with 12

		Iterator <Integer> iobj = vobj1.iterator();
		
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}
		
		vobj1.clear();
	}
}