package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;
public class Vehiculo {

	//km
	//asignar y cambiar chofer
	// " y eliminar pasajeros
	
	protected HashSet<Chofer> choferes;
	protected ArrayList<Pasajero> pasajeros;
	private Double KM_Recorridos;
    protected Chofer choferAsignado;
    private boolean seAgregoChofer; 

	public Vehiculo() {
		this.pasajeros = new ArrayList<>();
		this.choferes = new HashSet<>();
		this.choferAsignado = null;
		this.KM_Recorridos = 0d;
	    this.seAgregoChofer = false;
	}
	public boolean agregarChofer(Chofer chofer) {
	    this.seAgregoChofer =  choferes.add(chofer);
	    return seAgregoChofer;
	}
	public boolean asignarChofer(Chofer chofer) {
	    boolean seAsigno = false;
		if(choferAsignado == null && seAgregoChofer == true) {
		choferAsignado = chofer;
		seAsigno = true;
		}
		return seAsigno;
	}
	public boolean cambiarChofer(Chofer choferACambiar) {
	    return false;	
 }
	public boolean asignarPasajeros(Pasajero pasajero) {
		return false;
	}
	public boolean EliminarPasajeros() {
		boolean seElimino_A_LosPasajeros = false;
		if (!pasajeros.isEmpty()) {
			pasajeros.clear();
		    seElimino_A_LosPasajeros = true;
		}
		return seElimino_A_LosPasajeros;
	}
}