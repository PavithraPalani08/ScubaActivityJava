package array.list.com;

import java.util.*;  
class ArrayListSample
{  
   public static void main(String args[])
   {  
      ArrayList<String> KP=new ArrayList<String>();  
      KP.add("one");
      KP.add("two");
      KP.add("three");
      KP.add("four");
      KP.add("five");
      KP.add("six");
  
      //displaying elements
      System.out.println(KP);
  
      //Adding "ten" at the fourth position
      KP.add(3, "ten");
  
      //displaying elements
      System.out.println(KP);
      
      //change an element in ArrayList
      KP.set(0, "zero");
      System.out.println(KP);
      
      //Removing 3rd element
      KP.remove(2);
      System.out.println(KP);

   }  
}