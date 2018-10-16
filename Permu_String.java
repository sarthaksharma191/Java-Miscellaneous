import java.util.*;
class Permu_String{
	public static void main(String arg[]){
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char[] sChar=str.toCharArray();
		char temp;
		int i,j;
		int len=sChar.length;
		System.out.println("All possible permutations:");
		for (i=0;i<len;i++){
			for (j=0;j<i;j++){
				if(sChar[i]>sChar[j]){
					temp=sChar[i];
					sChar[i]=sChar[j];
					sChar[j]=temp;
					System.out.println(sChar);
				}
			}
		}
		//System.out.println("Bubb_Sort");
		for (i=0;i<len;i++){
			for (j=0;j<i;j++){
				if(sChar[i]<sChar[j]){
					temp=sChar[i];
					sChar[i]=sChar[j];
					sChar[j]=temp;
					System.out.println(sChar);
				}
			}
		}
	}
}