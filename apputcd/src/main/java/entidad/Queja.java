package entidad;

/*
 * Con esta clase permitirá la obtención de datos para el archivo quejas.jsp
 * */

// Esta clase Queja también conecta con ServletQueja.java

public class Queja {
	private int id_reclamo;
	// private String numero_reclamo;
	// private Integer nis;
	private String telefono;
	private String nombre;
	private String apellido;
	private String direccion;
	private String referencia;
	// private String numero_movil;
	private String correo;
	// private String observacion;
	// Nuevas cosas
	private String departamento;
	private String ciudad;
	private String barrio;
	
	// public Queja(int id_reclamo, String numero_reclamo, int nis, String telefono, String nombre, String apellido, String direccion, String referencia, String numero_movil, String correo, String observacion, String departamento, String ciudad, String barrio)
	// public Queja(int id_reclamo, Integer nis, String telefono, String nombre, String apellido, String direccion, String referencia, String correo, String departamento, String ciudad, String barrio) {
	public Queja(int id_reclamo, String telefono, String nombre, String apellido, String direccion, String referencia, String correo, String departamento, String ciudad, String barrio) {
		this.id_reclamo = id_reclamo;
		// this.numero_reclamo = numero_reclamo;
		// this.nis = nis;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		// this.numero_movil = numero_movil;
		this.correo = correo;
		// this.observacion = observacion;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.barrio = barrio;
	}
	
	// No sabemos en dónde lo llaman.
	// public void QuejaReg(String numero_reclamo, Integer nis, String telefono, String nombre, String apellido, String direccion, String referencia, String numero_movil, String correo, String observacion, String departamento, String ciudad, String barrio) {
	public void QuejaReg(String numero_reclamo, String telefono, String nombre, String apellido, String direccion, String referencia, String numero_movil, String correo, String observacion, String departamento, String ciudad, String barrio) {
		// this.numero_reclamo = numero_reclamo;
		// this.nis = nis;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		// this.numero_movil = numero_movil;
		this.correo = correo;
		// this.observacion = observacion;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.barrio = barrio;
	}

	// GETTERS
	public int getIdReclamo() {
		return id_reclamo;
	}
	/*
	public String getNumeroReclamo() {
		return numero_reclamo;
	}
	*/
	/*
	public int getNis() {
		return nis;
	}
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
	public String getNumeroMovil() {
		return numero_movil;
	}
	*/
	public String getReferencia() {
		return referencia;
	}
	public String getCorreo() {
		return correo;
	}
	/*
	public String getObservacion() {
		return observacion;
	}
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
	
	// SETTERS
	public void setIdReclamo(int id_reclamo) {
		this.id_reclamo = id_reclamo;
	}
	/*
	public void setNumeroReclamo(String numero_reclamo) {
		this.numero_reclamo = numero_reclamo;
	}
	*/
	/*
	public void setNis(Integer nis) {
		this.nis = nis;
	}
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
	public void setNumeroMovil(String numero_movil) {
		this.numero_movil = numero_movil;
	}
	*/
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/*
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
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
}
