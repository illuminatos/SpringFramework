
public class Operation {
	
	public void vote(int age) throws Exception{
		
		if(age<18) {
			throw new ArithmeticException("Not valid age");
		}else {
			System.out.println("Thank for vote");
		}
	}

}
