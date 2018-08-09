package mesTests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Adresse;
import model.ClientEI;
import model.ClientMoral;
import model.ClientPhysique;
import model.Login;
import repositories.ClientRepository;
import repositories.LoginRepository;

public class Test {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ClientRepository clientR= ctx.getBean(ClientRepository.class);
	LoginRepository loginR=ctx.getBean(LoginRepository.class);
	Adresse a1 = new Adresse("40 rue des lilas", "94140", "Alfortville", "France");
	Login l1 = new Login("Toto", "password", false);
	Adresse a2 = new Adresse("22 rue des oliviers", "44115", "Basse-Goulaine", "France");
	Login l2 = new Login("Titi", "password2", false);
	Adresse a3 = new Adresse("94 rue Paul Vaillant Couturier", "94140", "Alfortville", "France");
	Login l3 = new Login("Toto", "password", false);
	
	
	ClientEI cei= new ClientEI("Marceau", "06.42.42.42.42", "01.42.42.42.42", "blabla@hotmail.fr", a1, l1);
	cei.setPrenom("Gavroche");
	cei.setTitre("M");
	
	ClientMoral cm = new ClientMoral("Johnson&Jonhson", "02.00.00.00.00", "00.00.00.00.00", "bliblou@gmail.fr", a2, "EJ", "01554645BN");
	cm.setLogin(l3);
	
	ClientPhysique cp = new ClientPhysique("Dufeu", "c'est secret", "aucun", "Thibault.Dufeu@Sopra.fr", a3, "Mlle", "Thibault");
	cp.setLogin(l3);
	
	loginR.save(l1);
	clientR.save(cei);
	clientR.save(cm);
	clientR.save(cp);
	
	ctx.close();
	
	}
	
}
