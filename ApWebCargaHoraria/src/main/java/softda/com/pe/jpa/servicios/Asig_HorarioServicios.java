package softda.com.pe.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import softda.com.pe.jpa.repositorios.Asig_HorariaRepositorio;



@Service
@Transactional
public class Asig_HorarioServicios {
	
	@Autowired
	private Asig_HorariaRepositorio repositorio;

	public Asig_HorarioServicios() {
		// TODO Auto-generated constructor stub
	}

}
