import java.io.*;
class Add_Sum{
	public static void main(String arg[]) throws IOException{
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("Sum: "+(num1+num2));
	}
}
