import java.util.*;
class Exception1{
	public static void main(String arg[]) {
		int n=arg.length;
		try {
			float res=45/n;
			System.out.println(res);
		} 
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Please enter Valid Arguments");
		}
	}
}