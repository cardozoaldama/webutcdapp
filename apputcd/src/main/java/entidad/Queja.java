package entidad;

/*
 * Con esta clase permitirá la obtención de datos para el archivo quejas.jsp
 * */

// Esta clase Queja también conecta con ServletQueja.java

public class Queja {
	private int idreclamo;
	private String telefono;
	private String nombre;
	private String apellido;
	private String direccion;
	private String referencia;
	private String correo;
	private String departamento;
	private String ciudad;
	private String barrio;

	public Queja(int idreclamo, String nombre, String apellido, String telefono, String departamento, String ciudad,
			String barrio, String direccion, String correo, String referencia) {
		this.idreclamo = idreclamo;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		this.correo = correo;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.barrio = barrio;
	}

	public void QuejaReg(String numero_reclamo, String telefono, String nombre, String apellido, String direccion,
			String referencia, String numero_movil, String correo, String observacion, String departamento,
			String ciudad, String barrio) {
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		this.correo = correo;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.barrio = barrio;
	}

	/*
	 * public String getNumeroReclamo() { return numero_reclamo; }
	 */
	/*
	 * public int getNis() { return nis; }
	 */
	public String getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	/*
	 * public String getNumeroMovil() { return numero_movil; }
	 */
	public String getReferencia() {
		return referencia;
	}

	public String getCorreo() {
		return correo;
	}
	/*
	 * public String getObservacion() { return observacion; }
	 */

	// Nuevos Getters
	public String getDepartamento() {
		return departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getBarrio() {
		return barrio;
	}

	

	/*
	 * public void setNumeroReclamo(String numero_reclamo) { this.numero_reclamo =
	 * numero_reclamo; }
	 */
	/*
	 * public void setNis(Integer nis) { this.nis = nis; }
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	/*
	 * public void setNumeroMovil(String numero_movil) { this.numero_movil =
	 * numero_movil; }
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/*
	 * public void setObservacion(String observacion) { this.observacion =
	 * observacion; }
	 */
	// Nuevos Setters
	public String setDepartamento(String departamento) {
		return this.departamento;
	}

	public String setCiudad(String ciudad) {
		return this.ciudad;
	}

	public String setBarrio(String barrio) {
		return this.barrio;
	}

	public int getIdreclamo() {
		return idreclamo;
	}

	public void setIdreclamo(int idreclamo) {
		this.idreclamo = idreclamo;
	}
}
