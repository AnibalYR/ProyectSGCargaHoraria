package softda.com.pe.jpa.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "docentes")
public class Docente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name= "IdDocente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdDocente;
	@Column(name= "nombre")
	private String nombre;
	@Column(name= "apellidos")
	private String apellidos;
	@Column(name= "dni")
	private Integer dni;
	@Column(name= "sexo")
	private String sexo;
	@Column(name= "Fecha_nac")
	private String Fecha_nac;
	@Column(name= "telefono")
	private Integer telefono;
	@Column(name= "especialidad")
	private String especialidad;
	@Column(name= "correo")
	private String correo;
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "docente")
	//private List<Disponibilidad_Doc> disponibilidad_DocsList;
	//@OneToMany(cascade = CascadeType.ALL,  mappedBy = "docente")
   // private List<Asig_Horario> asig_HorariasList;
	
    public Docente() {
		// TODO Auto-generated constructor stub
	}



	public Docente(Integer idDocente, String nombre, String apellidos, Integer dni, String sexo, String fecha_nac,
			Integer telefono, String especialidad, String correo) {
		this.IdDocente = idDocente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sexo = sexo;
		this.Fecha_nac = fecha_nac;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.correo = correo;
	}






	public Integer getIdDocente() {
		return IdDocente;
	}






	public void setIdDocente(Integer idDocente) {
		this.IdDocente = idDocente;
	}






	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public String getApellidos() {
		return apellidos;
	}






	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}






	public Integer getDni() {
		return dni;
	}






	public void setDni(Integer dni) {
		this.dni = dni;
	}






	public String getSexo() {
		return sexo;
	}






	public void setSexo(String sexo) {
		this.sexo = sexo;
	}






	public String getFecha_nac() {
		return Fecha_nac;
	}






	public void setFecha_nac(String fecha_nac) {
		this.Fecha_nac = fecha_nac;
	}






	public Integer getTelefono() {
		return telefono;
	}






	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}






	public String getEspecialidad() {
		return especialidad;
	}






	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}






	public String getCorreo() {
		return correo;
	}






	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (IdDocente != null ? IdDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.IdDocente == null && other.IdDocente != null) || (this.IdDocente != null && !this.IdDocente.equals(other.IdDocente))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "softda.com.pe.jpa.modelo.Docente[ IdDocente=" + IdDocente + " ]";
    }
    
	public Docente buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
