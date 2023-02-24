
package sv.com.er.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.er.domain.Persona;

/**
 *
 * @author Juan Anzora
 */
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
