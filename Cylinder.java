import java.util.*;
class domestic{
	int cost;
	void setDetail(int num){
		cost=num*800;
	}
	void display(){
		System.out.println("Cost of Domestic is "+cost);
	}
}
class commercial{
	int cost;
	void setDetail(int num){
		cost=num*2000;
	}
	void display(){
		System.out.println("Cost of Commercial is "+cost);
	}
}

class Cylinder{
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		domestic d=new domestic();
		int num=sc.nextInt();
		d.setDetail(num);
		d.display();
		commercial c=new commercial();
		num=sc.nextInt();
		c.setDetail(num);		
		c.display();
	}
}