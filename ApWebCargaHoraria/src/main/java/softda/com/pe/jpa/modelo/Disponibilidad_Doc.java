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
@Table(name = "disponibilidad_doc")
public class Disponibilidad_Doc implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Basic(optional = false)
	 @Column(name = "IdDisp")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 @JoinColumn(name = "docentes", referencedColumnName = "IdDocente")
	 @ManyToOne(optional = false)
	 private Docente docente;
	 @Column(name = "Fecha")
	 private String fecha;
	 @Column(name = "Estado")
	 private String estado;
	 @Column(name = "HoraInicio")
	 private String horainicio;
	 @Column(name = "HoraFinal")
	 private String horafinal;
	 @Column(name = "Dias")
	 private String dias;
	 

	public Disponibilidad_Doc() {
		// TODO Auto-generated constructor stub
	}


	public Disponibilidad_Doc(Integer id, Docente docente, String fecha, String estado, String horainicio,
			String horafinal, String dias) {
		super();
		this.id = id;
		this.docente = docente;
		this.fecha = fecha;
		this.estado = estado;
		this.horainicio = horainicio;
		this.horafinal = horafinal;
		this.dias = dias;
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getHorainicio() {
		return horainicio;
	}


	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}


	public String getHorafinal() {
		return horafinal;
	}


	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}


	public String getDias() {
		return dias;
	}


	public void setDias(String dias) {
		this.dias = dias;
	}

}
