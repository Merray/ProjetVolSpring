package mesTests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Adresse;
import model.ClientEl;
import repositories.ClientRepository;

public class Test {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ClientRepository clientR= ctx.getBean(ClientRepository.class);
//	Adresse a1 = new Adresse("40 rue des lilas", "94140", "Alfortville", "France");
//	
//	ClientEi cei= new ClientEl(nom, numeroTel, numeroFax, email, adresse, login);
	}
	
}
