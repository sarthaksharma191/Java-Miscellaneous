import java.io.*;
class FileProp{
	public static void main(String arg[]) {
		String fname=arg[0];
		File f=new File(fname);
		System.out.println("File name="+f.getName());
		System.out.println("Path="+f.getPath());
		System.out.println("Absolute Path="+f.getAbsolutePath());
		System.out.println("Parent="+f.getParent());
		System.out.println("Exists="+f.exists());
		if(f.exists()){
			System.out.println("Writable="+f.canWrite());
			System.out.println("Readable="+f.canRead());
			System.out.println("Is a Directory="+f.isDirectory());
			System.out.println("Size in Bytes="+f.length());
		}
		String fname2=arg[1];
		File f1 = new File(fname2);
		try {
			f1.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		File f2=null;
		f2= new File("hello.txt");
		System.out.println(f1.renameTo(f2));
		f2.delete();
	}
}