package ejercicios;

public class Comercial extends Empleado {

	double ventas;

	public Comercial(String nombre, String apellidos, double SueldoBase) {
		super(nombre, apellidos, SueldoBase);
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sueldoBase = SueldoBase;
	}

	public void setVentas(double ventas) {

	}

	@Override
	public void getsueldo(double sueldoBase) {
	}

}
