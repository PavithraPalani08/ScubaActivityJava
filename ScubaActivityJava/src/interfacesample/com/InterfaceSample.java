package interfacesample.com;

interface ScubaLAD
{  
void Scuba();  
}  

class InterfaceSample implements ScubaLAD
{  
public void Scuba()
	{
		System.out.println("This is the SCUBA program");
	}  
  
public static void main(String args[])
	{  
		InterfaceSample obj = new InterfaceSample();  
		obj.Scuba();  
	}  
}  