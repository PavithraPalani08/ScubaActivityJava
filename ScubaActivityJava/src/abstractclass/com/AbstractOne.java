package abstractclass.com;

abstract class Maveric
{  
	 abstract void LAD();  
}  
	
class AbstractOne extends Maveric
{  
	void LAD()
	{
		System.out.println("LAD providing trainings to Maveric employees");
	}  
	public static void main(String args[])
	{  
	 Maveric obj = new AbstractOne();  
	 obj.LAD();  
	} 
	
}  