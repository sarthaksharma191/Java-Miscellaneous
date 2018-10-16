class factorial{
	static int fact;
	static int fact(int num){
		if(num>1){
			//fact=num*num-1;
			return num*fact(num-1);
		}
		else return 1;
	}
	
	public static void main(String arg[]){
		int num=5;
		int ans=fact(5);
		System.out.println(ans);
	}
}