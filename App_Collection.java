import java.util.*;

class emp{
	int id,salary;
	String name,dept,address;
	emp(){/*
		String name=new String();
		String dept=new String();
		String address=new String();
		*/
	}
	void getData(){
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		name=sc.nextLine();
		dept=sc.nextLine();
		address=sc.nextLine();
		salary=sc.nextInt();
		sc.close();
	}
};

public class App_Collection {
	public static void main() {
		emp employee=new emp();
		employee.getData();
	}
}