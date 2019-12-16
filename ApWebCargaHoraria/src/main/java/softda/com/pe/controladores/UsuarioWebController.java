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

import softda.com.pe.jpa.modelo.Usuario;
import softda.com.pe.jpa.servicios.UsuarioServicios;

@Controller
@RequestMapping("/usuarios")
public class UsuarioWebController {
	
	@Autowired
	private UsuarioServicios servicio;

	@RequestMapping("/listaUsuario")
	public String listarUsuarios(Model model) {
		List<Usuario> listaUsuarios = servicio.buscarTodo();
		model.addAttribute("listaUsuarios", listaUsuarios);
		return "/moduloUsuarios/listaUsuario";
	}

	
	@RequestMapping("/nuevo")
	public String nuevoUsuario(Model model) {
		Usuario usuarios = new Usuario();
		model.addAttribute("usuarios", usuarios);
		return "/moduloUsuarios/nuevoUsuario";
	}
	

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearUsuario(@ModelAttribute("usuarios") Usuario usuario) {
		servicio.crear(usuario);
	    return "redirect:/usuarios/listaUsuario";
	}
	
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarUsuario(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloUsuarios/editarUsuario");
	    Usuario usuario = servicio.buscarPorID(id);
	    mav.addObject("usuarios", usuario);
	     
	    return mav;
	}
	
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarUsuario(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/usuarios/listaUsuario";       
	}

}

	

