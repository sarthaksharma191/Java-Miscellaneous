import java.util.*;

class Demo extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon())
			System.out.println("Printing something Daemonic");
		else
			System.out.println("Printing something Funny");
	}
}

class Daemon_Thread{
	public static void main(String arg[]) {
		Demo d1=new Demo();
		Demo d2 = new Demo();
		d1.setDaemon(true);
		d1.start();
		d2.start();
	}
}