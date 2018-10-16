import java.util.*;
class DigiCheck{
	public static void main(String args[]){
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int flag=0,i,val;
		char[] sChar=str.toCharArray();
		for(i=0;i<sChar.length;i++){
			val=sChar[i];
			if(val>=48 && val<57){
				flag=1;
				break;
			}
		}
		if (flag==1)
			System.out.print("There are digits present");
		else
			System.out.print("There are no digits present");
	}
}