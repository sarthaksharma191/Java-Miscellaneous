import java.util.*;
class Hash_Sets{
	public static void main(String[] args) {
		HashSet <String> hs=new HashSet<String>();
		String str=new String();
		System.out.println("Enter Collection Elements");
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			str=sc.nextLine();
			hs.add(str);
		}
		System.out.println("Displaying Collection");
		Iterator <String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		sc.close();
	}
}