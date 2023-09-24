package MyWork;

 class bank {
public int getBalance() {

	return 0;
	
}
}
	class bankA extends bank{
		public int getBalance() {
			
			return 1000;
		}
	
}
class bankB extends bank{
	public int getBalance() {
		
		return 1500;
}}
class bankc extends bank{
	public int getBalance() {
		
		return 2000;
}}
public class bharat{
	public static void main(String[] args) {
		bankA d= new bankA();
		bankB e= new bankB();
		bankc f= new bankc();
		System.out.println(d.getBalance());
		System.out.println(e.getBalance());
		System.out.println(f.getBalance());
		
		
		
	}
}
