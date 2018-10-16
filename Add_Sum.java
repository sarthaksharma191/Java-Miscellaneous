import java.io.*;
class Add_Sum{
	public static void main(String arg[]) throws IOException{
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br= new BufferedReader(new FileReader("Nos.txt"));
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		System.out.println("Sum Of Nos: "+(num1+num2));
	}
}