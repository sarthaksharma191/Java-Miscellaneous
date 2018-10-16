import java.util.*;
class A{
	int i;
	A(int i){
		this.i=i;
		//System.out.println("Base class constructor");
	}
}
class B extends A{
	int i;
	B(int a,int b){
		super(a);
		i=b;
	}
	void show(){
		System.out.println("Derived class constructor "+i);
		System.out.println("Base class constructor "+super.i);
	}
}
class Inh_2{
	public static void main (String arg[])
	{
		B b=new B(12,13);
		b.show();
	}
}