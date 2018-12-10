import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// using applicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation operation = (Operation)context.getBean("operationbean");
		System.out.println("calling msg");
		operation.msg();
		System.out.println("calling k");
		operation.k();
		System.out.println(operation.k());
		System.out.println("calling m");
		operation.m();
		System.out.println(operation.m());

	}

}
