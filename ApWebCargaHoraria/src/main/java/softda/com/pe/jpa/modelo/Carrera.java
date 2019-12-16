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
@Table(name = "carreras")
public class Carrera implements Serializable {

	 private static final long serialVersionUID = 1L;
	    @Id
	    @Basic(optional = false)
	    @Column(name = "IdCarrera")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    @Column(name="Nombre")
	    private String nombre;
	    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "carrera")
	    private List<Ciclo> ciclosList;
	    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "carrera")
	    private List<Curso> cursosList;	    
	    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "carrera")
	    private List<Grupo> gruposList;
	    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "carrera")
	    private List<Asig_Horario> asig_HorariasList;
	   
	   
	    
	public Carrera() {
		// TODO Auto-generated constructor stub
	}



	public Carrera(Integer id, String nombre, List<Ciclo> ciclosList, List<Curso> cursosList, List<Grupo> gruposList,
			List<Asig_Horario> asig_HorariasList) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciclosList = ciclosList;
		this.cursosList = cursosList;
		this.gruposList = gruposList;
		this.asig_HorariasList = asig_HorariasList;
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



	public List<Ciclo> getCiclosList() {
		return ciclosList;
	}



	public void setCiclosList(List<Ciclo> ciclosList) {
		this.ciclosList = ciclosList;
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



	public List<Asig_Horario> getAsig_HorariasList() {
		return asig_HorariasList;
	}



	public void setAsig_HorariasList(List<Asig_Horario> asig_HorariasList) {
		this.asig_HorariasList = asig_HorariasList;
	}

	
}
