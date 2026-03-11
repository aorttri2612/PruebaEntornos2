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
		this.ventas = ventas;

	}

	@Override
	public double getsueldo(double sueldoBase) {
		sueldoBase = (sueldoBase + (ventas * 0.1));
		return sueldoBase;
	}

}
