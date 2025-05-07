package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VehiculoTest {

    @Test
public void VerificarQueNoExistan2ChoferesConElMismoIDAlAutobus() {
Vehiculo autobus = new Autobus();
Chofer chofer = new Chofer(2);
boolean seAgrego = autobus.agregarChofer(chofer);
assertTrue(seAgrego);
Chofer chofer2 = new Chofer(2);
boolean seAgregoSegundo = autobus.agregarChofer(chofer2);
assertFalse(seAgregoSegundo);	
	}
	
	@Test
public void verificarQueNoSePuedanAsignar2ChoferAlAutobus() {
	Vehiculo autobus = new Autobus();
	Chofer chofer = new Chofer(2);
    autobus.agregarChofer(chofer);
	boolean seAsigno = autobus.asignarChofer(chofer);
	assertTrue(seAsigno);
	Chofer chofer2 = new Chofer(1);
	autobus.agregarChofer(chofer);
	boolean seAsignoSegundo = autobus.asignarChofer(chofer2);
	assertFalse(seAsignoSegundo);	
}

	@Test
public void verificarQueSePuedaCambiarElChoferAsignadoAlAutobus() {
		Vehiculo autobus = new Autobus();
		Chofer chofer = new Chofer(2);
	    autobus.agregarChofer(chofer);
		boolean seAsigno = autobus.asignarChofer(chofer);
		assertTrue(seAsigno);
		Chofer chofer2 = new Chofer(1);
		autobus.agregarChofer(chofer);
		boolean seAsignoSegundo = autobus.cambiarChofer(chofer2);
		assertTrue(seAsignoSegundo);	
}
	@Test
public void verificarQueSeAgreguenPasajerosHAsta5() {
		Vehiculo autobus = new Autobus();
		Pasajero pasajero = new Pasajero(20);
	    boolean seagregoPasajero1 = autobus.asignarPasajeros(pasajero);
	    Pasajero pasajero2 = new Pasajero(40);
	    boolean seagregoPasajero2 = autobus.asignarPasajeros(pasajero2);
	    Pasajero pasajero3 = new Pasajero(60);
	    boolean seagregoPasajero3 = autobus.asignarPasajeros(pasajero3);
	    Pasajero pasajero4 = new Pasajero(10);
	    boolean seagregoPasajero4 = autobus.asignarPasajeros(pasajero4);
	    Pasajero pasajero5 = new Pasajero(7);
	    boolean seagregoPasajero5 = autobus.asignarPasajeros(pasajero5);
	    Pasajero pasajero6 = new Pasajero(26);
	    boolean seagregoPasajero6 = autobus.asignarPasajeros(pasajero6);
	    assertTrue(seagregoPasajero1);	
	    assertTrue(seagregoPasajero2);	
	    assertTrue(seagregoPasajero3);	
	    assertTrue(seagregoPasajero4);	
	    assertTrue(seagregoPasajero5);	
	    assertFalse(seagregoPasajero6);	
}
	@Test
public void verificarQueSePuedaCambiarChoferCuandoNoHayPasajeros() {
	Autobus autobus = new Autobus();
	Chofer choferAsignado = new Chofer(4);
	autobus.agregarChofer(choferAsignado);
	autobus.asignarChofer(choferAsignado);
	Chofer choferACambiar = new Chofer(8);
	autobus.agregarChofer(choferACambiar);
	boolean seCambioChofer = autobus.cambiarChofer(choferACambiar);
	assertTrue(seCambioChofer);
}
	@Test
	public void verificarQueNoSePuedaCambiarChoferCuandoHayPasajeros() {
		Autobus autobus = new Autobus();
		Chofer choferAsignado = new Chofer(4);
		autobus.agregarChofer(choferAsignado);
		autobus.asignarChofer(choferAsignado);
		Chofer choferACambiar = new Chofer(8);
		autobus.agregarChofer(choferACambiar);
		Pasajero pasajero = new Pasajero(8);
	    boolean seagregoPasajero1 = autobus.asignarPasajeros(pasajero);
		boolean seCambioChofer = autobus.cambiarChofer(choferACambiar);
		assertFalse(seCambioChofer);
	}
	
	@Test
	public void verificarQueSeEliminoPasajero() {
	Autobus autobus = new Autobus();
	Chofer choferAsignado = new Chofer(4);
	autobus.agregarChofer(choferAsignado);
	autobus.asignarChofer(choferAsignado);
	Chofer choferACambiar = new Chofer(8);
	autobus.agregarChofer(choferACambiar);
	Pasajero pasajero = new Pasajero(8);
    boolean seagregoPasajero1 = autobus.asignarPasajeros(pasajero);
	boolean seElimino = autobus.EliminarPasajeros();
    boolean seCambioChofer = autobus.cambiarChofer(choferACambiar);	
    assertTrue(seCambioChofer);
	}


	@Test
	public void verificarQueNoSeAgregen2ChoferesConElMismoIdAMoto() {
		Motocicleta moto = new Motocicleta();
		Chofer chofer = new Chofer(1);
		boolean seAgrego = moto.agregarChofer(chofer);
		Chofer chofer2 = new Chofer(1);
		boolean seAgrego2 = moto.agregarChofer(chofer2);
		assertTrue(seAgrego);
		assertFalse(seAgrego2);
	}

	
	@Test
public void verificarQueNoSePuedanAsignar2ChoferALaMoto() {
		Motocicleta moto = new Motocicleta();
		Chofer chofer = new Chofer(1);
		boolean seAgrego = moto.agregarChofer(chofer);
		boolean seAsigno = moto.asignarChofer(chofer);
		Chofer chofer2 = new Chofer(2);
		boolean seAgrego2 = moto.agregarChofer(chofer2);
		boolean seAsigno2 = moto.asignarChofer(chofer2);
		assertTrue(seAsigno);
		assertFalse(seAsigno2);
	}

	@Test
	public void verificarQueSePuedaCambiarChoferCuandoNoHayAcompañante() {
		Motocicleta moto = new Motocicleta();
		Chofer choferAsignado = new Chofer(4);
		moto.agregarChofer(choferAsignado);
		moto.asignarChofer(choferAsignado);
		Chofer choferACambiar = new Chofer(8);
		moto.agregarChofer(choferACambiar);
		Acompañante acompañante = new Acompañante();
		moto.agregarAcompañante(acompañante);
		moto.eliminarAcompañante();
		boolean seCambioChofer = moto.cambiarChofer(choferACambiar);
		assertTrue(seCambioChofer);
	}

}