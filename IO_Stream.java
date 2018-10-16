import java.io.*;
class IO_Stream{
	public static void main(String arg[])throws IOException {
		
		DataInputStream fin = new DataInputStream(System.in);
		//int gabbar=fin.read();
		//System.out.println(gabbar);
		FileOutputStream fout = new FileOutputStream("MyFileOP.txt",true);
		char ch=(char)fin.read();
		while(ch!='@'){
			fout.write(ch);
			ch=(char)fin.read();
		}
	}
}