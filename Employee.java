import java.util.*;

class empclass{

	String name;
	int id,age;
	double sal;
	empclass(){
		name="Sam";
		id=16;
		sal=15000;
		age=20;
	}
	
	public static void main(String arg[]){
		empclass E=new empclass();
		System.out.println(E.name+"\nAge="+E.age+"\nID="+E.id+"\nSal="+E.sal);
	}
}