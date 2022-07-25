
public class AutoBoxing_AutoUnBoxing {
	
	//AutoBoxing-> converting primitive Data type into Object
	//AutoUnBoxing -> converting Object to primitive Data type
	public static void main(String... g)
	{
		int a;
		a=90;
		
		//primitive data type is converted into object - AutoBoxing
		Integer z = a;
		System.out.println("A:"+z);
		
		
		//Object is converted to Primitive data type -AutoUnBoxing
		Integer M=67;
		int s=M;
		System.out.println("S:"+s);
		
		
		
	}
}
