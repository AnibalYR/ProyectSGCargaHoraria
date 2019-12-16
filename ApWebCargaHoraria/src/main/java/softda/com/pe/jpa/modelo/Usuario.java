package softda.com.pe.jpa.modelo;



import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;







@Entity
@Table(name = "usuarios")
//@XmlRootElement
//@NamedQueries({
//@NamedQuery(name = "Usuarios.findAll", query ="SELECT u FROM Usuarios u"),
//@NamedQuery(name = "Usuarios.findByIdUsuario", query ="SELECT u FROM Usuarios u WHERE u.IdUsuario = :IdUsuario"),
//@NamedQuery(name = "Usuarios.findByIdNombres", query ="SELECT u FROM Usuarios u WHERE u.Nombres = :Nombres"),
//@NamedQuery(name = "Usuarios.findByUser", query ="SELECT u FROM Usuarios u WHERE u.User = :User"),
//@NamedQuery(name = "Usuarios.findByPass", query ="SELECT u FROM Usuarios u WHERE u.Pass = :Pass"),
//@NamedQuery(name = "Usuarios.findByTipo", query ="SELECT u FROM Usuarios u WHERE u.Tipo = :Tipo"),
//})
public class Usuario implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name= "IdUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdUsuario;
	@Column(name= "Nombres")
	private String Nombres;
	@Column(name = "User")
	 private String User;
	@Column(name = "Pass")
	 private String Pass;
	@Column(name = "Tipo")
	 private String Tipo;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	
	 public Usuario(Integer idUsuario) {
		this.IdUsuario = idUsuario;
	}
	 


	public Usuario(Integer idUsuario, String nombres, String user, String pass, String tipo) {
		this.IdUsuario = idUsuario;
		this.Nombres = nombres;
		this.User = user;
		this.Pass = pass;
		this.Tipo = tipo;
	}


	public Integer getIdUsuario() {
		return IdUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.IdUsuario = idUsuario;
	}


	public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}


	public String getUser() {
		return User;
	}


	public void setUser(String user) {
		this.User = user;
	}


	public String getPass() {
		return Pass;
	}


	public void setPass(String pass) {
		this.Pass = pass;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}


	@Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (IdUsuario != null ? IdUsuario.hashCode() : 0);
	        return hash;
	    }
	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Usuario)) {
	            return false;
	        }
	        Usuario other = (Usuario) object;
	        if ((this.IdUsuario == null && other.IdUsuario != null) || (this.IdUsuario != null && !this.IdUsuario.equals(other.IdUsuario))) {
	            return false;
	        }
	        return true;
	    }
	    @Override
	    public String toString() {
	        return "softda.com.pe.jpa.modelo.Usuario[ IdUsuario=" + IdUsuario + " ]";
	    }
	    
		public Usuario buscarPorID(int i) {
			// TODO Auto-generated method stub
			return null;
		}
	     

}
