import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// using applicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation operation = (Operation)context.getBean("operationbean");
		
		try {
			operation.vote(19);			
		}catch (Exception e){
			System.out.println("calling vote again");
		}
		
		try {
			operation.vote(11);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
