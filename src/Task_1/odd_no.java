package Task_1;

public class odd_no {

	public static void main(String[] args) {
		//print odd no. from 267 to 188
		
		for(int i=133; i>=94; i--) {
			//i=133 since the formula used is 2*i+1, the initial value should be 133
			//condition i>=94 also as per formula or the last odd value i.e. 189
			//and we are decrementing the value of i here
			System.out.println(2*i+1);
		}

	}

}
