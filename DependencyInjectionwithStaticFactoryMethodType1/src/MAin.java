import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MAin {

	public static void main(String[] args) {
		// using bean factory
		System.out.println("using bean factory");
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee manager = (Employee)factory.getBean("managerbean");
		manager.print();
		
		Employee director = (Employee)factory.getBean("directorbean");
		director.print();
		
		System.out.println("using applicationcontext");
		
		//using applicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee manager1 = (Employee)context.getBean("managerbean");
		manager1.print();
		Employee manager2 = (Employee)context.getBean("directorbean");
		manager2.print();
		
		

	}

}
