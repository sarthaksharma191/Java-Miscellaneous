/*
Check if two strings are an anagram or not
*/
import java.util.*;

class Anagram{
	public static void main(String arg[]){
		int ts1=0,i,j;
		char temp;
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		char[] s1Char=s1.toCharArray();
		
		for (i=0;i<s1Char.length;i++)
		{
			for (j=0;j<i && i<4;j++)
			{
				temp=s1Char[i];
				s1Char[i]=s1Char[i+1];
				s1Char[i+1]=temp;
			}
		}

		char[] s2Char=s2.toCharArray();
		for (i=0;i<s2Char.length;i++)
		{
			for (j=0;j<i && i<4;j++)
			{
				temp=s2Char[i];
				s2Char[i]=s2Char[i+1];
				s2Char[i+1]=temp;
			}
		}

		System.out.println("Checking...");

		/*for(i=0;i<5;i++){
			System.out.print(s1Char[i]);
		}*/
		if (s1Char==s2Char)
			System.out.println("Strings are anagrams");
		else{
			System.out.println("Strings are not anagrams");
		}
	}
}