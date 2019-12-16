package softda.com.pe.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import softda.com.pe.jpa.repositorios.CursoRepositorio;



@Service
@Transactional
public class CursoServicios {

	@Autowired
	private CursoRepositorio repositorio;
	
	public CursoServicios() {
		// TODO Auto-generated constructor stub
	}

}
