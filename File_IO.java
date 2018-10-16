import java.io.*;
class File_IO{
	public static void main(String arg[]) throws IOException{
		try{
			int ch=0;
			FileInputStream fin = new FileInputStream("MyFileOP.txt");
			System.out.println("FileContents");
			while((ch)!=-1){
				ch=fin.read();
				System.out.print((char)ch);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
		//fin.close();
	}	
}
		