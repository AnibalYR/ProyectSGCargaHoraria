package softda.com.pe.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asig_horarios")
public class Asig_Horario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Basic(optional = false)
	 @Column(name = "IdDisp")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 @JoinColumn(name = "docentes", referencedColumnName = "IdDocente")
	 @ManyToOne(optional = false)
	 private Docente docente;
	 @JoinColumn(name = "carreras", referencedColumnName = "IdCarrera")
	 @ManyToOne(optional = false)
	 private Carrera carrera;
	 @JoinColumn(name = "aulas", referencedColumnName = "IdAula")
	 @ManyToOne(optional = false)
	 private Aula aula;
	 @JoinColumn(name = "grupos", referencedColumnName = "IdGru")
	 @ManyToOne(optional = false)
	 private Grupo grupo;
	 @JoinColumn(name = "dias", referencedColumnName = "IdDia")
	 @ManyToOne(optional = false)
	 private Dia dia;
	 @Column(name = "Hora_inicio")
	 private String hora_inicio;
	 @Column(name = "Hora_final")
	 private String hora_final;
	 
	

	public Asig_Horario() {
		// TODO Auto-generated constructor stub
	}



	public Asig_Horario(Integer id, Docente docente, Carrera carrera, Aula aula, Grupo grupo, Dia dia,
			String hora_inicio, String hora_final) {
		super();
		this.id = id;
		this.docente = docente;
		this.carrera = carrera;
		this.aula = aula;
		this.grupo = grupo;
		this.dia = dia;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Docente getDocente() {
		return docente;
	}



	public void setDocente(Docente docente) {
		this.docente = docente;
	}



	public Carrera getCarrera() {
		return carrera;
	}



	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}



	public Aula getAula() {
		return aula;
	}



	public void setAula(Aula aula) {
		this.aula = aula;
	}



	public Grupo getGrupo() {
		return grupo;
	}



	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}



	public Dia getDia() {
		return dia;
	}



	public void setDia(Dia dia) {
		this.dia = dia;
	}



	public String getHora_inicio() {
		return hora_inicio;
	}



	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}



	public String getHora_final() {
		return hora_final;
	}



	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}

}
