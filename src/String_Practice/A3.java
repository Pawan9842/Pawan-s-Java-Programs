package String_Practice;

public class A3 {

	public static void main(String[] args) {
		//replace ("old", "new");
		
		String s="this is Rachel";
		System.out.println(s.replace("is", "was"));  //thwas was Rachel wherever is will be replaced by was
		System.out.println(s.replaceFirst("is", "was"));  //thwas is Rachel on;y first is replaced by was
		System.out.println(s.replaceAll("is", "was"));  //thwas was Rachel all is replaced by was
		System.out.println(s.replaceAll("is(.)", "was"));  //thwaswasRachel  
		System.out.println(s.replaceAll("is(.*)", "was"));  //thwas  after is getting replaced by was it will not print further
		System.out.println(s.replaceAll("th(.)", "za"));
		
		String s1="Nitisha";
		System.out.println(s1.replace('i', 'e'));
	}

}
