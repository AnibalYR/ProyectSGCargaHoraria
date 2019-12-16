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
@Table(name = "grupos")
public class Grupo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Basic(optional = false)
	 @Column(name = "IdGru")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 @Column(name = "Nombre")
	 private String nombre;
	 @Column(name = "Cant_Alumnos")
	 private Integer cant_alum;
	 @JoinColumn(name = "cursos", referencedColumnName = "IdCur")
	 @ManyToOne(optional = false)
	 private Curso curso;
	 @JoinColumn(name = "carreras", referencedColumnName = "IdCarrera")
	 @ManyToOne(optional = false)
	 private Carrera carrera;
	 @JoinColumn(name = "ciclos", referencedColumnName = "IdCicl")
	 @ManyToOne(optional = false)
	 private Ciclo ciclo;
	 @OneToMany(cascade = CascadeType.ALL,  mappedBy = "grupo")
	 private List<Asig_Horario> asig_HorariasList;

	 
	public Grupo() {
		// TODO Auto-generated constructor stub
	}

	
}
