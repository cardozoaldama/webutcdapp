package modelo;

import java.util.concurrent.atomic.AtomicLong;

public class ModeloQuejas {
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
	private static final AtomicLong contador = new AtomicLong(100);
	
	public ModeloQuejas(int id_reclamo, String numero_reclamo, int nis, String telefono, String nombre, String apellido, String direccion, String referencia, String numero_movil, String correo, String observacion ){
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
	public ModeloQuejas(String numero_reclamo, int nis, String telefono, String nombre, String apellido, String direccion, String referencia, String numero_movil, String correo, String observacion) {
		this.id_reclamo = (int) contador.incrementAndGet();
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
	
	// GETTERS
	
	// SETTERS
}
