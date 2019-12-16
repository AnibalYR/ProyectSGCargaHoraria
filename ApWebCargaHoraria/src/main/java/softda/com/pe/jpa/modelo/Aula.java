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
@Table(name = "aulas")
public class Aula implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	    @Id
	    @Basic(optional = false)
	    @Column(name = "IdAula")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    @Column(name = "Piso")
	    private Integer piso;
	    @Column (name = "Nombre")
	    private String nombre;
	    @Column (name = "Cantidad")
	    private Integer cantidad;
	    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "aula")
	    private List<Asig_Horario> asig_HorariasList;

	public Aula() {
		// TODO Auto-generated constructor stub
	}

	public Aula(Integer id, Integer piso, String nombre, Integer cantidad, List<Asig_Horario> asig_HorariasList) {
		super();
		this.id = id;
		this.piso = piso;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.asig_HorariasList = asig_HorariasList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public List<Asig_Horario> getAsig_HorariasList() {
		return asig_HorariasList;
	}

	public void setAsig_HorariasList(List<Asig_Horario> asig_HorariasList) {
		this.asig_HorariasList = asig_HorariasList;
	}

	
}
