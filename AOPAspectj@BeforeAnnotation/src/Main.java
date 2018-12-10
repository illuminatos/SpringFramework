import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		//cannot use bean factory 

		// using applicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation e = (Operation) context.getBean("operationbean");
		System.out.println("calling msg...");
		e.msg();
		System.out.println("calling m...");
		e.k();
		System.out.println("calling k...");
		e.m();
		
		//@After is same as @Before difference is write output after calling actual method 

	}

}
