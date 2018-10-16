import java.util.*;

class BubbSort{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i,max,temp=0,j;
		System.out.println("Enter Limit");
		max=sc.nextInt();
		System.out.println("Enter marks");
		for (i=0;i<max;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (i=0;i<max;i++)
		{
			for (j=0;j<i;j++)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("Array");
		for (i=0;i<max;i++)
		{
			System.out.println(arr[i]);
		}
	}
}