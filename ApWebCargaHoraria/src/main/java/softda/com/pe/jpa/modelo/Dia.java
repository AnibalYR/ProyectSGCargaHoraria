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
@Table(name = "dias")
public class Dia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name= "IdDia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="Nombre")
	private String nombre;
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "dia")
	private List<Asig_Horario> asig_HorariasList;
	
	public Dia() {
		// TODO Auto-generated constructor stub
	}

	public Dia(Integer id, String nombre, List<Asig_Horario> asig_HorariasList) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public List<Asig_Horario> getAsig_HorariasList() {
		return asig_HorariasList;
	}

	public void setAsig_HorariasList(List<Asig_Horario> asig_HorariasList) {
		this.asig_HorariasList = asig_HorariasList;
	}

	
}
