package archivos_basicos_parcial_xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"idEmpleado", "nombre", "apellido", "telefono", "direccion", "observaciones", "sueldo"})
public class Empleado {
	private int idEmpleado;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String observaciones;
	private double sueldo;
	
	public Empleado() {
		this.idEmpleado = 101;
		this.nombre = "Miguel";
		this.apellido = "Perez";
		this.telefono = "3814945";
		this.direccion = "Lima";
		this.observaciones = "Lima";
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	@XmlElement(name="empleado")
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
