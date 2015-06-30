

public class testequals
{
	public static void main(String args[]){	
		String a = "hello";
		String b = a;
		String c = "hello";
		System.out.println("A==B? " + (a==b));
		System.out.println("A==C? " + (a==c));
		System.out.println("B==C? " + (b==c));
		a += " world!";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("a==b? " + (a==b));
		System.out.println("a==c? " + (a==c));
		System.out.println("b==c? " + (b==c));
	}
}
