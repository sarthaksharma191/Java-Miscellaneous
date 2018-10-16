import java.util.*;
import java.lang.*;

class Marks{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i,max,total=0;
		System.out.println("Enter Limit");
		max=sc.parseInt();
		System.out.println("Enter marks");
		for (i=0;i<max;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (i=0;i<max;i++)
		{
			total=arr[i]+total;
		}
		float perc=total/max;
		System.out.println("Total= "+total);
		System.out.println("Percentage= "+perc+"%");
	}
}