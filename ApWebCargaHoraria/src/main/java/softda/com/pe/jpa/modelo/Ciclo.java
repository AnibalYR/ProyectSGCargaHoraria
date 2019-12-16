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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ciclos")
public class Ciclo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Basic(optional = false)
	 @Column(name = "IdCicl")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 @Column(name = "Nombre")
	 private String nombre;
	 @JoinColumn(name = "carreras", referencedColumnName = "IdCarrera")
	 @ManyToOne(optional = false)
	 private  Carrera carrera;
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciclo")
	 private List<Curso> cursosList;	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciclo")
	 private List<Grupo> gruposList;
	public Ciclo() {
		// TODO Auto-generated constructor stub
	}
	public Ciclo(Integer id, String nombre, Carrera carrera, List<Curso> cursosList, List<Grupo> gruposList) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
		this.cursosList = cursosList;
		this.gruposList = gruposList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public List<Curso> getCursosList() {
		return cursosList;
	}
	public void setCursosList(List<Curso> cursosList) {
		this.cursosList = cursosList;
	}
	public List<Grupo> getGruposList() {
		return gruposList;
	}
	public void setGruposList(List<Grupo> gruposList) {
		this.gruposList = gruposList;
	}
	
}
