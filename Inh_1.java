import java.util.*;
class A{
	A(){
		System.out.println("Base class constructor");
	}
}
class B extends A{
	B(){
		System.out.println("Derived class constructor");
	}
}
class SuperClass{
	public static void main (String arg[])
	{
		B b=new B();
		//b.show();
	}
}