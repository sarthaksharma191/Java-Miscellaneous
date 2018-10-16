import java.util.*;
class List_Iter{
	public static void main(String[] args) {
		Vector <String> st=new Vector<String>();
		String str=new String();
		System.out.println("Enter Collection Elements");
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			str=sc.nextLine();
			st.add(str);
		}
		System.out.println("Printing Forward");
		ListIterator <String> itr=null;
		itr=st.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Printing Backward");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			itr.remove();
		}
		st.clear();
		sc.close();
	}
}