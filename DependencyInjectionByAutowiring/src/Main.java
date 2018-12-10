import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// using bean factory
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee)factory.getBean("employeebean", Employee.class);

		employee.print();
		
		//Using applicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee1 = (Employee)context.getBean("employeebean");
		employee1.print();
		

		//bean names must be same!!!!!!!!!!!!!!! since using byName
		//you can change autowire="byType" or "constructor" or "no"
		//by changing see the result of address part on terminal window
	}

}
