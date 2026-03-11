package ejercicios;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Consola implements IEntradaSalida {

	public Scanner sc;

	public Consola() {
		this.sc = new Scanner(System.in);

	}

	public void imprimir(String texto) {
		System.out.println(texto);

	}

	public void imprimirLinea(String mensaje) {
		System.out.println(mensaje);

	}

	public String leerTexto(String mensaje) {
		System.out.println(mensaje);
		String texto = sc.nextLine();
		return texto.trim();

	}

	public int leerEntero(String mensaje) {
		int numero = 0;
		boolean ok = false;

		while (!ok) {
			System.out.print(mensaje);
			String texto = sc.nextLine();
			texto = texto.trim();

			try {
				numero = Integer.parseInt(texto);
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR - Introduce un número entero válido.");
			}
		}
		return numero;
	}

	public double leerImporte(String mensaje) {
		return 0;

	}

	public void mostrarMenu() {
		private Consola consola;
		consola.imprimirLinea("1. Contratar empleado");
		consola.imprimirLinea("2. Listar todos los empleados");
		consola.imprimirLinea("3. Listar empleados con filtro");
		consola.imprimirLinea("4. Salir");

	}

	public void limpiarPantalla() {

	}

	public void pausa() {

	}
}
