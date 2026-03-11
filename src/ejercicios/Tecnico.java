package ejercicios;

public class Tecnico extends Empleado {
	int categoria;

	public Tecnico(String nombre, String apellidos, double SueldoBase, int categoria) {
		super(nombre, apellidos, SueldoBase);
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.sueldoBase = SueldoBase;

	}

	@Override
	public void getsueldo(double sueldoBase) {
	}

}
