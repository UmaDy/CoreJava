
public class DataTypeExample {
	public static void main(String... g)
	{
	
int a=90;
char b='A';
float c=67.98F;
double d=67.98D;
boolean e=true;
byte f=65;
long m=78;
short s=34;


System.out.println(a+ " IntegerSize:" +Integer.SIZE/8);
System.out.println(b+ "F"+Character.SIZE);

System.out.println(c+"F"+Float.SIZE);
System.out.println(d+"Float"+Double.SIZE);
System.out.println(e);
System.out.println(f+"L"+Byte.SIZE);
System.out.println(m+"S"+Long.SIZE);
System.out.println(s+"S"+Short.SIZE);

	}

}
