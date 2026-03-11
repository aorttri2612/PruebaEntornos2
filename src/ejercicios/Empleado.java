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

	public abstract void getsueldo(double sueldoBase);

}
