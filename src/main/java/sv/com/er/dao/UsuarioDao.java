package sv.com.er.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.er.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
	Usuario findByUsername(String username);
}
