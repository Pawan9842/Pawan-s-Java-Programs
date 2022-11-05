package daily_practice;

	interface I1 {
	public abstract void Country (); 
		default void people () {
			System.out.println("People of India are very generous with some exceptions");
		}
}

	interface I2 {
	void States ();
	int a=140;
	String s="India";	
}

	public class practice_interface implements I1,I2  {
		public void Country () {
			System.out.println("India is the most beautiful Country");
}
		public void States () {
			System.out.println("Madhya Pradesh can never become as good as Maharashtra");
	
}
	public static void main(String[] args) {
		practice_interface q=new practice_interface();
		System.out.println(s);
		q.Country();
		System.out.println("India's population is "+a+" crores");
		q.people();
		q.States();
		
	}

}
