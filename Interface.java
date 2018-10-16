import java.util.*;

interface father{
	double ht=170;
	void cal();
}
interface mother{
	double ht=155;
	void cal();
}
class child implements father,mother{
	public void cal() {
		double ht=father.ht+mother.ht;
		System.out.println(ht+" cm");
	}
}
class Interface{
	public static void main(String arg[]) {
		child c=new child();
		c.cal();
	}
}