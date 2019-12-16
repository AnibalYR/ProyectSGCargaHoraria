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
@Table(name = "cursos")
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Basic(optional = false)
	 @Column(name = "IdCur")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 @Column(name = "Nombre")
	 private String nombre;
	 @Column(name = "Horas_clase")
	 private String horas_cls;
	 @JoinColumn(name = "carreras", referencedColumnName = "IdCarrera")
	 @ManyToOne(optional = false)
	 private Carrera carrera;
	 @JoinColumn(name = "ciclos", referencedColumnName = "IdCicl")
	 @ManyToOne(optional = false)
	 private Ciclo ciclo;	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	 private List<Grupo> gruposList;

	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(Integer id, String nombre, String horas_cls, Carrera carrera, Ciclo ciclo, List<Grupo> gruposList) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas_cls = horas_cls;
		this.carrera = carrera;
		this.ciclo = ciclo;
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

	public String getHoras_cls() {
		return horas_cls;
	}

	public void setHoras_cls(String horas_cls) {
		this.horas_cls = horas_cls;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public List<Grupo> getGruposList() {
		return gruposList;
	}

	public void setGruposList(List<Grupo> gruposList) {
		this.gruposList = gruposList;
	}

	
	

	
}
