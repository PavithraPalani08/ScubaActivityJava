package exception.handling.com;

public class ExceptionSample
{  
	  public static void main(String args[])
	  {  
		//ArithmeticException  
	   try
	   {  
	      //code that may raise exception  
	      int data=100/0;  
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e);
	   }  
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	   
	   //NullPointerException  
	   String s=null;  
	   System.out.println(s.length());
	   
	   //NumberFormatException 
	   String x="abc";  
	   int i=Integer.parseInt(x); 
	   
	   //ArrayIndexOutOfBoundsException 
	   int a[]=new int[5];  
	   a[10]=50;  
	   
	   
	   
	   
	  }  
	}  