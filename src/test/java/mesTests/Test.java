package mesTests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import repositories.ClientRepository;

public class Test {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ClientRepository clientR= ctx.getBean(ClientRepository.class);
	
	}
	
}
