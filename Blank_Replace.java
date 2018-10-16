import java.util.*;
class Blank_Replace{
	public static void main(String arg[]){
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String str1=str.replaceAll(" ","%20");
		System.out.println(str1);
	}
}