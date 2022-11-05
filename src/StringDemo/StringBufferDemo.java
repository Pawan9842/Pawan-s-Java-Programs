package StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String s1="Pawan";
		String s2="Rachel";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("Pawan");
		StringBuffer sb2=sb.append("Gupta");
		sb.append("123");	
		System.out.println(sb.equals(sb2));   //
		//	System.out.println(sb.append("Gupta"));
		System.out.println(sb2);   
		
		StringBuffer sb3=new StringBuffer(1000);
		
		sb3.append("Nitisha");
		System.out.println(sb3.capacity());   //16+8
		System.out.println(sb3.append("Monkey"));
		System.out.println(sb3.capacity());  //(old capacity*2)+2=70-----
		sb3.trimToSize();
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());  //
		
	//	System.out.println(sb3.delete(3, 8));
		System.out.println(sb3.deleteCharAt(0));
		System.out.println(sb3.indexOf("i"));
		System.out.println(sb3.lastIndexOf("i"));
		System.out.println(sb3.insert(0, "N"));
		
		System.out.println(sb3.insert(7, "ZZZ"));
		System.out.println(sb3.replace(7, 10, "yyyy"));
		
		System.out.println(sb3.reverse());
		System.out.println(sb3);
		System.out.println(sb3.subSequence(2, 7));
		System.out.println(sb3);
		System.out.println(sb3.substring(5));
		sb3.setCharAt(5, 'z');
		System.out.println(sb3);
		
		StringBuilder S=new StringBuilder("jjj");
		String s="G-";
		String s4="string";
		System.out.println(s.concat(s4));
		System.out.println(S.capacity());
		
	}

}
