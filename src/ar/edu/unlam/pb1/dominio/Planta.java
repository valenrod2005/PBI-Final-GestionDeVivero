package ar.edu.unlam.pb1.dominio;

public class Planta {

	private final double GANANCIA_HIERBA_MATA = 1.2;
	private final double GANANCIA_ARBUSTO = 1.6;
	private final double GANANCIA_ARBOL = 2.3;

	public Planta(int codigo, TipoDePlanta tipoDePlanta, String nombre, double precio, int stock) {
		// TODO: Completar el constructor
		return null;
	}

	

	public double obtenerPrecioFinal() {
		// TODO: Calcular y devolver el precio final de la planta. Para ello, se debera
		// revisar el TipoDePlanta considerando:
		// Hierba o Mata: se incrementa un 20% el precio base.
		// Arbusto: se incrementa un 60% el precio base.
		// Arbol: se incrementa un 130% el precio base.
		// Usar las constantes
		return 0;
	}

	@Override
	public String toString() {
		// TODO: Mostrar la informacion actual de la planta incluyendo el precio final.
		// Considerar el metodo: obtenerPrecioFinal()
	}
}
