class Complex{
	double re,im;
	Complex(double re,double im){
		this.re=re;
		this.im=im;
	}
	public String toString(){
		return String.format(re+"+i"+im);
	}
}

class Comp{
	public static void main(String arg[]){
		Complex c=new Complex(3,2);
		System.out.println(c);
	}
}