package softda.com.pe.jpa.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import softda.com.pe.jpa.modelo.Docente;




public interface DocenteRepositorio extends CrudRepository<Docente, Integer> {
	@Query(value = "SELECT a FROM Docente a WHERE a.nombre = ?1")
	public List<Docente> buscarUsuarioPorNombre(String nombre);
	
	@Query(value = "SELECT a FROM Docente a WHERE a.nombre like CONCAT(?1, '%')")
public List<Docente> buscarUsuarioLikeNombre(String nombre);

}
