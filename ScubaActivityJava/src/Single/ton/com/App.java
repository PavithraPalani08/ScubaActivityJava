package Single.ton.com;

public class App 
{
	private static App app;
	
	private App()
	{
		//hinder other classes to create object of this class
		
	}
	
	public static App getInstance()
	{
		if(app == null)
		{
				app= new App();
		}
		
		return app;
	}
}
	  
	