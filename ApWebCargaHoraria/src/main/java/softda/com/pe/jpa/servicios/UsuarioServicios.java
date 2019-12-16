package softda.com.pe.jpa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import softda.com.pe.jpa.modelo.Usuario;
import softda.com.pe.jpa.repositorios.UsuarioRepositorio;

@Service
@Transactional
public class UsuarioServicios {
	@Autowired
	private UsuarioRepositorio repositorio;

	public UsuarioServicios() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Usuario> buscarTodo()
	{
	return (List<Usuario>) repositorio.findAll();	
	}
	
	public Usuario crear(Usuario usuario)
	{
		return repositorio.save(usuario);
	}
	
	
	public Usuario actualizar(Usuario usuarioActualizar)
	
	{
		Usuario usuarioActual = repositorio.findById(usuarioActualizar.getIdUsuario()).get();
		usuarioActual.setNombres(usuarioActualizar.getNombres());
		usuarioActual.setUser(usuarioActualizar.getUser());
		usuarioActual.setPass(usuarioActualizar.getPass());
		usuarioActual.setTipo(usuarioActualizar.getTipo());
		Usuario usuarioActualizado = repositorio.save(usuarioActual);
		return usuarioActualizado;
	}
	public Usuario buscarPorID(Integer id)
	{
		return repositorio.findById(id).get();
	}
	
	public void borrarPorID(Integer id)
	{
		repositorio.deleteById(id);
	}


}
