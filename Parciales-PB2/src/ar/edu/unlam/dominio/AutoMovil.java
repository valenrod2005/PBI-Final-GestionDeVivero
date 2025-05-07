package ar.edu.unlam.dominio;

public class AutoMovil extends Vehiculo{

	
	
	private static final int CANTIDAD_MAXIMA_PASAJEROS = 3;
	public AutoMovil() {
		
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
		    seAsigno = true;
		}
		return seAsigno;
}
}
