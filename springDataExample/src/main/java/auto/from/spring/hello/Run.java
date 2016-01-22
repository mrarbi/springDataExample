package auto.from.spring.hello;


import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Run {

	public static void main(String[] args) throws BeansException, FileNotFoundException {
		
		
		BeanFactory factory =
				new XmlBeanFactory((Resource) new ClassPathResource("hello.xml"));
		
		HelloService helloService =
				(HelloService) factory.getBean("helloService");
				
		helloService.sayHello();
		
	}
}
