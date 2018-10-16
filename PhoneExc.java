import java.util.*;

class PExc extends Exception{
	String msg;
	public PExc(String msg) {
		this.msg=msg;
	}
	public String toString(){
		return msg;
	}
}
class PhoneExc{
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		String phno=sc.nextLine();
		try{
			if (phno.length()!=10) {
				throw new PExc("Not a valid 10-digit Number");
			}
			System.out.println(phno+" Verified!");
		}
		catch(PExc pe){
			System.out.println(pe);
		}
	}
}