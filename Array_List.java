import java.util.*;

class Array_List{
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		ListIterator li=al.listIterator();
		while(!al.contains(0)){
			al.add(sc.next());
		}
		al.remove(0);
		System.out.print("Which Element do you want to remove?:");
		int rem=sc.nextInt();
		if(al.contains(rem))
			al.remove(rem);
		else
			System.out.println("Element does not exist");
		
		li=al.listIterator();
		while(li.hasPrevious()){
			System.out.print(li.previous()+" ");
		}
		System.out.print("Enter Index to be removed:");
		int k=sc.nextInt();//////  index to remove
		for(int i=0;i<al.size();i++){
			if(i==k){
				System.out.println(al.remove(i));
			}
		}
		System.out.println("Printing Array List...");
		li=al.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		sc.close();
	}
}