import java.util.*;
abstract class operation{
   abstract void calculate(int num);
}

class square extends operation{
	void calculate(int num){
		System.out.println(num*num);
	}
}
class cube extends operation{
	void calculate(int num){
		System.out.println(num*num*num);
	}
}
/*class root extends operation{
	void calculate(int num){
		float ans=sqrt(num);
		System.out.println(ans);
	}
}*/
class Abstract{
	public static void main(String arg[]) {
		square sq=new square();
		sq.calculate(3);
		cube cb=new cube();
		cb.calculate(3);
	}
}