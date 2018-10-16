import java.util.*;

class Fibo_Thread{
	public public static void main(String arg[]) {
		Assign obj1 = new Assign();
		Thread t1 = new Thread(obj1);
		t1.run();
	}
}