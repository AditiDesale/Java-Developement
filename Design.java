
class Design
{
	public static void main(String arg[])
	{
		//Singleton sobj = new Singleton();   //error
		
		Singleton sobj = Singleton.GetObject();
		//Singleton sobj = Singleton.GetObject();
	}
}

final class Singleton
{
	public int x,y;
	private static Singleton obj = new Singleton();

	private Singleton()
	{
		System.out.println("Inside constructor");
	}
	
	public static Singleton GetObject()
	{
		return obj;
	}
}