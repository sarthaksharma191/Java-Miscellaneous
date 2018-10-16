import java.util.*;
class Cal_Greet{
	public static void main(String args[]){
		Calendar C1= Calendar.getInstance();
		int am_pm=C1.get(Calendar.AM_PM);
		if(am_pm==0)
			System.out.println("Good Morning");
		else
			System.out.println("Good Evening");
	}
}