package ejercicios;

public abstract class Empleado {

	String dni;
	String nombre;
	String apellidos;
	double sueldoBase;

	public Empleado(String nombre, String apellidos, double SueldoBase) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sueldoBase = SueldoBase;

	}

	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public abstract void getsueldo(double sueldoBase) {
		return this.sueldoBase;
	}

}
