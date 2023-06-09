package modelo;

import java.util.concurrent.atomic.AtomicLong;

public class ModeloQuejas {
	private int idreclamo;
	private String numero_reclamo;
	// private int nis;
	private String telefono;
	private String nombre;
	private String apellido;
	private String direccion;
	private String referencia;
	private String numero_movil;
	private String correo;
	private String observacion;
	private static final AtomicLong contador = new AtomicLong(100);

	public ModeloQuejas(int idreclamo, String numero_reclamo, String telefono, String nombre, String apellido,
			String direccion, String referencia, String numero_movil, String correo, String observacion) {
		this.idreclamo = idreclamo;
		this.numero_reclamo = numero_reclamo;
		// this.nis = nis;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		this.numero_movil = numero_movil;
		this.correo = correo;
		this.observacion = observacion;
	}

	public ModeloQuejas(String numero_reclamo, String telefono, String nombre, String apellido, String direccion,
			String referencia, String numero_movil, String correo, String observacion) {
		this.idreclamo = (int) contador.incrementAndGet();
		this.numero_reclamo = numero_reclamo;
		// this.nis = nis;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.referencia = referencia;
		this.numero_movil = numero_movil;
		this.correo = correo;
		this.observacion = observacion;
	}

	// GETTERS

	public int getIdReclamo() {
		return idreclamo;
	}

	public String getNumeroReclamo() {
		return numero_reclamo;
	}

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

	public String getNumeroMovil() {
		return numero_movil;
	}

	public String getReferencia() {
		return referencia;
	}

	public String getCorreo() {
		return correo;
	}

	public String getObservacion() {
		return observacion;
	}

	// SETTERS

	public void setIdReclamo(int idreclamo) {
		this.idreclamo = idreclamo;
	}

	public void setNumeroReclamo(String numero_reclamo) {
		this.numero_reclamo = numero_reclamo;
	}

	/*
	 * public void setNis(int nis) { this.nis = nis; }
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
