package Access2.com;

import access1.com.AccessOne;

public class AccessThree extends AccessOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				AccessOne x=new AccessOne();
				
				
				//accessing public modifiers
				System.out.println("accessing public modifiers in different packages");
				System.out.println(x.c);
				System.out.println(x.d);
				//
				
				//accessing public modifiers
				System.out.println("accessing protected modifiers modifiers in different package using extends");
				AccessThree y=new AccessThree();
				System.out.println(y.o);
				System.out.println(y.p);
				//
				
				

	}

}
