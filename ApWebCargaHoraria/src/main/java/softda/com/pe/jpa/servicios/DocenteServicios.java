package softda.com.pe.jpa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import softda.com.pe.jpa.modelo.Docente;
import softda.com.pe.jpa.repositorios.DocenteRepositorio;

@Service
@Transactional
public class DocenteServicios {
    
	@Autowired
	private DocenteRepositorio repositorio;
	
	public DocenteServicios() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Docente> buscarTodo()
	{
		return (List<Docente>) repositorio.findAll();
	}
	
	public Docente crear(Docente docente)
	{
		return repositorio.save(docente);
	}
	
	public Docente actualizar(Docente docenteActualizar)
	{
		Docente docenteActual = repositorio.findById(docenteActualizar.getIdDocente()).get();
		docenteActual.setNombre(docenteActualizar.getNombre());
		docenteActual.setApellidos(docenteActualizar.getApellidos());
		docenteActual.setDni(docenteActualizar.getDni());
		docenteActual.setSexo(docenteActualizar.getSexo());
		docenteActual.setFecha_nac(docenteActualizar.getFecha_nac());
		docenteActual.setTelefono(docenteActualizar.getTelefono());
		docenteActual.setEspecialidad(docenteActualizar.getEspecialidad());
		docenteActual.setCorreo(docenteActualizar.getCorreo());
		return docenteActualizar;
		
	}
	public Docente buscarPorID(Integer id)
	{
		return repositorio.findById(id).get();
		}
		
		public void borrarPorID(Integer id)
		{
			repositorio.deleteById(id);
		}

	

}
