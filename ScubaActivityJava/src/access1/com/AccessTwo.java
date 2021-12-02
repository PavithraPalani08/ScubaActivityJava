package access1.com;

public class AccessTwo {
	public static void main(String[] args)
	{
		//accessing default modifiers
		System.out.println("accessing default modifiers");
		AccessOne x=new AccessOne();
		System.out.println(x.a);
		System.out.println(x.b);
		//
		
		//accessing public modifiers
		System.out.println("accessing public modifiers");
		System.out.println(x.c);
		System.out.println(x.d);
		//
		
		//accessing public modifiers
		System.out.println("accessing protected modifiers modifiers");
		System.out.println(x.o);
		System.out.println(x.p);
		//
		
		
		
		
		
	}

}
