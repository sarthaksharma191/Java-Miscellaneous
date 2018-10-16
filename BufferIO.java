import java.io.*;
class BufferIO{
	public static void main(String f[]) throws IOException{
		//String file1=f[0];
//		String file2=f[1];
		int ch=0;
		FileInputStream fin = new FileInputStream("IP.txt");
		FileOutputStream fout = new FileOutputStream("OP.txt",true);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		while((ch=fin.read())!=-1){
			fout.write((char)ch);
		}
		fout.close();
	}
}