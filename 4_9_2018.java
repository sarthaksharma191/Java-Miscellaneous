import java.io.*;
class student
{
	int rno;
	String name;
	student(String name,int rno)
	{
		this.rno=rno;
		this.name=name;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rno);
	}
}
class main{
	public static void main(String arr[]) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		student[] s=new student[5];
		int i;
		for(i=0;i<5;i++){
			String name=bf.readLine();
			int rno=Integer.parseInt(bf.readLine());
			s[i]=new student(name,rno);
			s[i].display();
		}
	}
}