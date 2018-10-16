import java.util.*;

class BbbleSort{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i,maximum,temp=0,j;
		System.out.println("Limit");
		max=sc.nextInt();
		System.out.println("Marks");
		for (i=0;i<maximum;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (i=0;i<maximum;i++)
		{
			for (j=0;j<i;j++)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("Array");
		for (i=0;i<maximum;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Sorted");
	}
}
