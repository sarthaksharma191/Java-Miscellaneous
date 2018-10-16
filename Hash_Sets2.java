import java.util.*;

class Hash_Sets2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashSet <Integer> hs=new HashSet<Integer>();
		System.out.println("Enter Elements:");
		while (!hs.contains(0)) {
			hs.add(sc.nextInt());
		}
		hs.remove(0);
		System.out.println("Size= "+hs.size());
		System.out.print("Enter element to be searched: ");
		int i=0;
		Iterator <Integer> itr=hs.iterator();
		int ele=sc.nextInt();
		boolean flag=false;
		while(itr.hasNext()) {
			if (itr.next()==ele) {
				System.out.println("Element "+ele+" found at index "+i);
				flag=true;
				continue;
			}
			else{
				flag=false;
			}
			i++;
		}
		if(!flag){
			System.out.println("Element not found");		
		}
		System.out.println("Copying HashSet into Object...");
		//Copy operation
		i=0;
		itr=hs.iterator();
		Integer[] objectArray = new Integer[hs.size()];
		while (itr.hasNext()) {
			//System.out.println("test"+i);
			objectArray[i]=itr.next();
			i++;
		}
		System.out.println("Object Array:");
		for(i=0;i<hs.size();i++) {
			//System.out.println("test "+i);
			System.out.print(objectArray[i]+" ");
		}
		sc.close();
	}
}