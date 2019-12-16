package softda.com.pe.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import softda.com.pe.jpa.repositorios.AulaRepositorio;



@Service
@Transactional
public class AulaServicios {

	@Autowired
	private AulaRepositorio repositorio;
	
	public AulaServicios() {
		// TODO Auto-generated constructor stub
	}

}
