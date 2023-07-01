package entidad;

public class Departamento {
	private Integer iddepartamento;
	private String nombre;
	private String observacion;

	public Departamento(int iddepartamento, String nombre, String observacion) {
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
		this.observacion = observacion;
	}
	// getters y setters

	public Departamento(Integer id) {
		this.iddepartamento = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iddepartamento == null) ? 0 : iddepartamento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Departamento other = (Departamento) obj;
		if (iddepartamento == null) {
			if (other.iddepartamento != null)
				return false;
		} else if (!iddepartamento.equals(other.iddepartamento))
			return false;
		return true;
	}

	public Integer getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(Integer iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}