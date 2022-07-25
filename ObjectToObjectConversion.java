
public class ObjectToObjectConversion {
	public static void main(String... g)
	{
		String a="1234";
		String b="3456";
		//convert String into Integer format
		int z = Integer.parseInt(a);
		int x = Integer.parseInt(b);
		
		System.out.println("Sum int:"+(z+x));
		
		float q = Float.parseFloat(a);
		float d = Float.parseFloat(b);
		 System.out.println("Sum float:"+(q+d));
		 
	
	}
	
}
