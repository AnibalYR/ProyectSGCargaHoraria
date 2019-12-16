package softda.com.pe.jpa.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import softda.com.pe.jpa.modelo.Usuario;


public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
	@Query(value = "SELECT a FROM Usuario a WHERE a.Nombres = ?1")
	public List<Usuario> buscarUsuarioPorNombre(String nombre);
	
	@Query(value = "SELECT a FROM Usuario a WHERE a.Nombres like CONCAT(?1, '%')")
public List<Usuario> buscarUsuarioLikeNombre(String nombre);
}
