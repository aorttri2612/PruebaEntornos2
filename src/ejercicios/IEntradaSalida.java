package ejercicios;

public interface IEntradaSalida {

	void imprimir(String texto);

	void imprimirLinea(String mensaje);

	String leerTexto(String mensaje);

	int leerEntero(String mensaje);

	double leerImporte(String mensaje);

	void mostrarMenu();

	void limpiarPantalla();

	void pausa();
}
