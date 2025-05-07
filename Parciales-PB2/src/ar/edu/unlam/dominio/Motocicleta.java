package ar.edu.unlam.dominio;

public class Motocicleta extends Vehiculo{

	
	private Acompañante acompañanteAsignado;
	
	public Motocicleta() {
		this.acompañanteAsignado = null;
	}
	
public boolean agregarAcompañante(Acompañante acompañanteAAsignar) {
	boolean seAgrego = false;
	if(acompañanteAsignado==null) {
		acompañanteAsignado=acompañanteAAsignar;
		seAgrego = true;
	}
	return seAgrego;
}

public boolean eliminarAcompañante() {
	boolean seElimino = false;
	if(this.acompañanteAsignado!=null) {
		acompañanteAsignado=null;
		seElimino = true;
	}
	return seElimino;
}
	
	
@Override
public boolean cambiarChofer(Chofer choferACambiar) {
	boolean seCambio = false;
	if(choferAsignado != null && acompañanteAsignado==null) {
		choferAsignado = choferACambiar;
		seCambio = true;
		}
	    return seCambio;
}
}
