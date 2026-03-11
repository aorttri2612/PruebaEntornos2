package ejercicios;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Consola implements IEntradaSalida {

	public Scanner sc;

	public Consola() {
		this.sc = new Scanner(System.in);

	}

	public void imprimir(String texto) {

	}

	public void imprimirLinea(String mensaje) {

	}

	public String leerTexto(String mensaje) {
		return mensaje;

	}

	public int leerEntero(String mensaje) {
		return 0;

	}

	public double leerImporte(String mensaje) {
		return 0;

	}

	public void mostrarMenu() {

	}

	public void limpiarPantalla() {

	}

	public void pausa() {

	}
}
