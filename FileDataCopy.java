import java.io.*;
class FileDataCopy{
	public static void main(String f[]) throws IOException{
		String file1=f[0];
		String file2=f[1];
		int ch=0;
		FileInputStream fin = new FileInputStream(file1);
		FileOutputStream fout = new FileOutputStream(file2);
		while((ch)!=-1){
			ch=fin.read();
			fout.write((char)ch);
		}
	}
}