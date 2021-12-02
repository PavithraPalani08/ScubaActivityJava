package inheritance.com;

//concept of single inheritance

class one 
{
 public void Hello()
 {
     System.out.println("This is Hello method");
 }
}

class two extends one
{
 public void Hai()
 { 
	 System.out.println("This is Hai method"); 
 }
}

public class SingleInheritance
{
 public static void main(String[] args)
 {
     two g = new two();
     g.Hello();
     g.Hai();
     g.Hello();
 }
}