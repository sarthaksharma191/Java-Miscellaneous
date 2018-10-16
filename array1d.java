import java.util.Scanner;
class ArrayId
{	int arr[],n;
    ArrayId(int a)
	{
		n=a;
		arr=new int[n];
	}
	public int[] getvalues()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	
	public int findsum(int[] br)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+br[i];
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		ArrayId a1=new ArrayId(6);
		int x[]=a1.getvalues();
		int sum=a1.findsum(x);
		System.out.print("Sum= "+sum);
	}
}
	