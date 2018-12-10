import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// using applicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation operation = (Operation)context.getBean("operationbean");
		operation.msg();
		operation.print();

	}

}
