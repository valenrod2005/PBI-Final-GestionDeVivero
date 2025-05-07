package ar.edu.unlam.dominio;
import java.util.Collections;
import java.util.Comparator;

public class Autobus extends Vehiculo {
	
	private final static Integer CANTIDAD_MAXIMA_PASAJEROS = 5;
	public Autobus() {
	}
@Override	
public boolean cambiarChofer(Chofer choferACambiar) {
	boolean seCambio = false;
	if(choferAsignado != null && pasajeros.isEmpty()) {
		choferAsignado = choferACambiar;
		seCambio = true;
		}
	    return seCambio;
	    }
@Override
public boolean asignarPasajeros(Pasajero pasajero) {
	boolean seAsigno = false;
	if (pasajeros.size() < this.CANTIDAD_MAXIMA_PASAJEROS) {
		pasajeros.add(pasajero);
	    ordenarPasajerosPorEdad();
	    seAsigno = true;
	}
	return seAsigno;
	}
private void ordenarPasajerosPorEdad() {
	(pasajeros).sort(Comparator.comparingInt(Pasajero::getEdad).reversed());
}
}