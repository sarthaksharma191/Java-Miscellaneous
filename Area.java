import java.util.*;

class Area{
	int side,a,b;
	Area(int side){
		System.out.println(side*side);
	}
	Area(int l,int b){
		System.out.println(l*b);
	}
	public static void main(String arg[]){
		int a=12,l=5,b=9;
		Area sq=new Area(a);
		Area rect=new Area(l,b);
	}
}