import java.util.*;
class NegaExcep extends Exception
{
		String msg;
		public NegaExcep(String msg){
			this.msg=msg;
		}
		public String toString(){
			return msg;
		}
}
		class UDE{
			public static void main(String arg[]) {
				int amt=20000;
				
				try{
					if (amt<0) {
						throw new NegaExcep("Invalid Amount");
					}
					System.out.println("Amount: "+amt);
				}
				catch(NegaExcep ne){
					System.out.println(ne);
				}
			}
		}
