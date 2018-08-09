package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Escale;
import model.EscalePk;

public interface EscaleRepository extends JpaRepository <Escale, EscalePk>{

}
