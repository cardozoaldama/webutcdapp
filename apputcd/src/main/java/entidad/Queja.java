package entidad;

/*
 * Con esta clase permitirá la obtención de datos para el archivo quejas.jsp
 * */

public class Queja {
	private int id_reclamo;
	private String numero_reclamo;
	private int nis;
	private String telefono;
	private String nombre;
	private String apellido;
	private String direccion;
	private String referencia;
	private String numero_movil;
	private String correo;
	private String observacion;
	
	public Queja(int id_reclamo, String numero_reclamo, int nis, String telefono, String nombre, String apellido, String direccion, String referencia, String numero_movil, String correo, String observacion) {
		this.id_reclamo = id_reclamo;
		this.numero_reclamo = numero_reclamo;
		this.nis = nis;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		this.numero_movil = numero_movil;
		this.correo = correo;
		this.observacion = observacion;
	}
	
	// Getters y Setters
	public int getIdReclamo() {
		return id_reclamo;
	}
	public String getNumeroReclamo() {
		return numero_reclamo;
	}
	public int getNis() {
		return nis;
	}
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
	public String getNumeroMovil() {
		return numero_movil;
	}
	public String getCorreo() {
		return correo;
	}
	public String getObservacion() {
		return observacion;
	}
	
	// SETTERS
	public void setIdReclamo(int id_reclamo) {
		this.id_reclamo = id_reclamo;
	}
	public void setNumeroReclamo(String numero_reclamo) {
		this.numero_reclamo = numero_reclamo;
	}
	public void setNis(int nis) {
		this.nis = nis;
	}
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
	public void setNumeroMovil(String numero_movil) {
		this.numero_movil = numero_movil;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}
