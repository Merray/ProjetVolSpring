package mesTests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Adresse;
import model.Aeroport;
import model.ClientEI;
import model.ClientMoral;
import model.ClientPhysique;
import model.CompagnieAerienne;
import model.Login;
import model.Passager;
import model.Reservation;
import repositories.AeroportRepository;
import repositories.ClientRepository;
import repositories.LoginRepository;
import repositories.PassagerRepository;
import repositories.ReservationRepository;

public class Test {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ClientRepository clientR= ctx.getBean(ClientRepository.class);
	LoginRepository loginR=ctx.getBean(LoginRepository.class);
	ReservationRepository reservationR=ctx.getBean(ReservationRepository.class);
	PassagerRepository passagerR=ctx.getBean(PassagerRepository.class);
	AeroportRepository aeroportR=ctx.getBean(AeroportRepository.class);
	
	Adresse a1 = new Adresse("40 rue des lilas", "94140", "Alfortville", "France");
	Login l1 = new Login("Toto", "password", false);
	Adresse a2 = new Adresse("22 rue des oliviers", "44115", "Basse-Goulaine", "France");
	Login l2 = new Login("Titi", "password2", false);
	Adresse a3 = new Adresse("94 rue Paul Vaillant Couturier", "94140", "Alfortville", "France");
	Login l3 = new Login("Tata", "Tamerge", false);
	
	ClientEI cei= new ClientEI("Marceau", "06.42.42.42.42", "01.42.42.42.42", "blabla@hotmail.fr", a1);
	cei.setPrenom("Gavroche");
	cei.setTitre("M");
	cei.setLogin(l1);
	
	ClientMoral cm = new ClientMoral("Johnson&Jonhson", "02.00.00.00.00", "00.00.00.00.00", "bliblou@gmail.fr", a2, "EJ", "01554645BN");
	cm.setLogin(l2);
	
	ClientPhysique cp = new ClientPhysique("Dufeu", "c'est secret", "aucun", "Thibault.Dufeu@Sopra.fr", a3, "Mlle", "Thibault");
	
	cei=clientR.save(cei);
	clientR.save(cm);
	cp=clientR.save(cp);
	cp.setLogin(l3);
	cp=clientR.save(cp);
	cp.setNom("Monom");
	cp=clientR.save(cp);
	l3=cp.getLogin();
	l3.setLogin("monLogin");
	l3=loginR.save(l3);
	
	Passager passager = new Passager("Dufeu", "Thibault", cp.getAdresse());
	passagerR.save(passager);
	
	Reservation reserv= new Reservation();
	reserv.setClient(cp);
	reserv.setPassager(passager);
	reservationR.save(reserv);
	
	Aeroport aeroport = new Aeroport();
	aeroport.setNom("Charles de Gaules");
	aeroportR.save(aeroport);
	
	CompagnieAerienne comp= new CompagnieAerienne();
	comp.setNom("LowCost");
	
	
	
	
	
	
	
	
	
	ctx.close();
	
	}
	
}
