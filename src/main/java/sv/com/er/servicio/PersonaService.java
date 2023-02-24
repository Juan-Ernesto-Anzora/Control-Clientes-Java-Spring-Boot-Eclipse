
package sv.com.er.servicio;

import java.util.List;
import sv.com.er.domain.Persona;

/**
 *
 * @author Juan Anzora
 */
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
}
