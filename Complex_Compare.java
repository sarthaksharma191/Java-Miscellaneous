import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int wt;
	int roll;
	Student(String name,int wt,int roll){
		this.name=name;
		this.wt=wt;
		this.roll=roll;
	}


	@Override public int compareTo(Student s){
		int res_name=this.name.compareTo(s.name);
		int res_wt=this.wt.compareTo(s.wt);
		int res_roll=this.roll.compareTo(s.roll);
			return res;
		}


	/*@Override public int compareTo(Student s){
		int res=Integer.compare(this.wt, s.wt);
		return res;
	}*/
/*
	@Override public int compareTo(Student s){
		int res=Integer.compare(this.roll, s.roll);
		return res;
	}
*/
/*	
	@Override public int compareTo(Student s){
		if(this.name==s.name)
			if(this.wt==s.wt)
				if(this.roll==s.roll)
					return 0;
				else if(this.roll>s.roll)
					return 1;
				else 
					return -1;
			else if(this.wt>s.wt)
				return 1;
			else
				return -1;
		else if(this.name.compareTo(s.name)==1)
			return 1;
		else
			return -1;
	}*/
}
class Complex_Compare{
	public static void main(String arg[]) {
		ArrayList<Student> sl=new ArrayList();
		sl.add(new Student("Aman",56,105));
		sl.add(new Student("Raman",56,102));
		sl.add(new Student("Shubham",47,111));
		sl.add(new Student("Abhay",60,108));
		sl.add(new Student("Aman",54,106));
		Collections.sort(sl);
		System.out.println("Roll\tName\tWt");
		for(Student stu:sl){
			System.out.println(stu.roll+"\t"+stu.name+"\t"+stu.wt);
		}
	}
}