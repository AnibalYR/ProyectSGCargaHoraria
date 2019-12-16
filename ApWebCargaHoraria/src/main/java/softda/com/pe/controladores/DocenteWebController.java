package softda.com.pe.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import softda.com.pe.jpa.modelo.Docente;
import softda.com.pe.jpa.servicios.DocenteServicios;

@Controller
@RequestMapping("/docentes")
public class DocenteWebController {
	
	@Autowired
	private DocenteServicios servicio;
	
	@RequestMapping("/listaDocente")
	public String listaDocente(Model model) {
		List<Docente> listaDocentes = servicio.buscarTodo();
		model.addAttribute("listaDocentes",  listaDocentes);
		return "/moduloDocente/listaDocente";
	}
	
	@RequestMapping("/nuevo")
	public String nuevoDocente(Model model) {
		Docente docente = new Docente();
		model.addAttribute("docentes", docente);
		return "/moduloDocente/nuevoDocente";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearDocente(@ModelAttribute("docentes") Docente docente) {
		servicio.crear(docente);
	    return "redirect:/docentes/listaDocente";
	}
	
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarDocente(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloDocente/editarDocente");
	    Docente docente = servicio.buscarPorID(id);
	    mav.addObject("docentes", docente);
	     
	    return mav;
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarDocente(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/docentes/listaDocente";       
	}
	
	
	
}
