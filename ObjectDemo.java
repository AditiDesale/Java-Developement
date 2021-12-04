
class ObjectDemo 
{
	public static void main(String arg[]) throws Exception
	{
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1.equals(s2))
		{
			System.out.println("Strings are equals");
		}
		
		Demo obj1 = new Demo("Rahul","PPA");
		Demo obj2 = new Demo("Amit","Python");
		
		System.out.println("Hashcode of obj1 : "+obj1.hashCode());
		System.out.println("Hashcode of obj2 : "+obj2.hashCode());
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

		Class cobj = obj1.getClass();
		System.out.println("Name of class : "+cobj.getName());
		
		Demo objX = (Demo)obj1.clone();
		System.out.println(objX.toString());
		System.out.println("Hashcode of objX : "+objX.hashCode());

		
		obj1 = null;
		obj2 = null;
		
		System.gc();    //request not a command
		
	}
}

class Demo implements Cloneable
{
	public String Name;
	public String Batch;
	
	public Demo(String x, String y)
	{
		this.Name = x;
		this.Batch = y;
	}
	
	public String toString()
	{
		return this.Name+" "+this.Batch;
	}
	
	protected void finalize()
	{
		System.out.println("Inside finalize method");
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}