import java.util.*;
class A{
	int i;
	void display(){
		System.out.println("Base class constructor");
	}
}
class B extends A{
	void display(){
		System.out.println("Child class constructor");
	}
	void show(){
		//System.out.println("Base class constructor");
	}
}
class Inh_3{
	public static void main (String arg[])
	{
		A aa=new B();
		aa.display();
		/*
		B bb=new A();
		bb.display();
		This does not work. To acheive this result, we use generic object of 'Object' class
		*/
		Object obj=new A();
		((A)obj).display();
	}
}