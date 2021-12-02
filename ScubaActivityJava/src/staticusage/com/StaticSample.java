package staticusage.com;

//use of static variable  
class Student
{  
   int rollno;  
   String name;  
   static String college ="Sacred Heart College"; //static variable   
   
   //constructor  
   Student(int r, String n)
   {  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display ()
   {
	   System.out.println(rollno+" "+name+" "+college);
   }  
}  



public class StaticSample
{  	
 public static void main(String args[])
 {  
 Student s1 = new Student(111,"Pavithra");  
 Student s2 = new Student(222,"Kalaiarasi");  
  
 s1.display();  
 s2.display();  
 }  
}  
