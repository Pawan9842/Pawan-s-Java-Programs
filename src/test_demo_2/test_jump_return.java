package test_demo_2;

public class test_jump_return {
	
	
	//jump statement
	// 3) return:
	
	public int m1() {
		return 10;	
	}
	static String m2() {
		 return "Test";
	 }

	public static void main(String[] args) {
	
		test_jump_return test=new test_jump_return();
		
		System.out.println(test.m1());
		
        System.out.println(test_jump_return.m2());
	}

}
