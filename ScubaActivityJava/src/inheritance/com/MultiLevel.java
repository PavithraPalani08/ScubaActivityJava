package inheritance.com;


//concept of single inheritance

class one1 
{
public void Hello()
{
   System.out.println("This is Hello method");
}
}

class two2 extends one1
{
public void Hai()
{ 
	 System.out.println("This is Hai method"); 
}
}

class three extends two2 {
	public void Hello()
	{
	   System.out.println("This is Hello method");
	}
}

public class MultiLevel
{
public static void main(String[] args)
{
   two2 g = new two2();
   g.Hello();
   g.Hai();
   g.Hello();
}
}