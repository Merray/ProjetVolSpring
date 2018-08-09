package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Adresse;
import model.Passager;
import model.Reservation;

public interface PassagerRepository extends JpaRepository<Passager, Integer>{

	List<Passager> findByprenomPassager(String prenomPassager);
	
	List<Passager> findByprenomPassagerContaining(String prenomPassager);
	
	List<Passager> findBynomPassager(String nomPassager);
	
	List<Passager> findBynomPassagerContaining(String nomPassager);
	
//	List<Passager> findByprenomPassagerAndnomPassager(String prenomPassager,String nomPassager);
//	
//	List<Passager> findByReservation(Reservation Reservation);
//	
	List<Passager> findByadressePassager(Adresse adressePassager);
}
