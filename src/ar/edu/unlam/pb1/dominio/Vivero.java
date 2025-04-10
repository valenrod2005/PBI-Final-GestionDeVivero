package ar.edu.unlam.pb1.dominio;

public class Vivero {

	public Vivero(String nombre, int cupoMacetas) {
		// TODO: Completar el constructor. La contrasenia debe generarse y asignarse al
		// vivero en este constructor
	}

	public static double obtenerSaldo() {
		return saldo;
	}

	public boolean iniciarSesion(String contrasenia) {
		return false;
	}

	public boolean agregarPlanta(Planta planta) {
		// TODO: Agregar la planta al array solo si no existe otra con el mismo codigo
		// en el array de plantas. Considerar usar el metodo
		// buscarPlantaPorCodigo(codigo)
		return false;
	}

	public boolean venderPlanta(int codigo, int cantidadAVender) {
		// TODO: Para vender una planta, primero debemos revisar que exista (buscando
		// por codigo por ejemplo) y luego verificar que tenga stock para satisfacer la
		// cantidad a vender. Si es viable la venta, se debera modificar el stock de la
		// planta en el array de plantas (considerar el metodo
		// modificarStockDePlantaPorCodigo()) para
		// disminuir el mismo, y se deberá
		// acumular el precio final de la venta al saldo del vivero. Ejemplo: Precio
		// final de planta $10, cantidad de plantas en la venta 10 unidades, entonces se
		// acumulan $100 al saldo del vivero
		return false;
	}

	public Planta buscarPlantaPorCodigo(int codigo) {
		// TODO: Buscar la planta en el array de plantas utilizando el codigo de la
		// planta. En caso de no existir, devolver null.
	
		return null;
	}

	public Planta[] buscarPlantasQueContienen(String texto) {
		// TODO: Generar un nuevo array con las plantas que en su nombre, contengan el
		// texto suministrado. El array no debe poseer espacios, es decir, las plantas
		// deben ingresar ordenadamente (no permitir posiciones en null entre las
		// plantas ingresadas).

		return null;
	}

	public boolean modificarStockDePlantaPorCodigo(int codigo, int stock) {
		// TODO: Iterar el array de plantas y en caso de existir alguna y que coincida
		// con el codigo suministrado, actualizar el stock de la misma

		return false;
	}

	public Planta[] obtenerPlantasDeTipoOrdenadasPorNombreAscendende(TipoDePlanta tipoDePlanta) {
		// TODO: Generar un nuevo array de plantas que coincidan con el tipo de planta
		// suministrado. Antes de devolverlo, se debera ordenar por nombre ascendente.
		// Considerar el metodo ordenarPlantasPorNombreAscendente(array)


		return null;
	}


	private String generarContrasenia() {
		// TODO: Generar un contrasenia aleatoria y devolverla. La misma debe poseer:
		// 4 caracteres (en el orden que desee) los cuales deben ser:
		// 1 numero.
		// 1 letra mayuscula.
		// 2 letras minusculas.
		// Considerar el metodo obtenerCaracterAleatorio(1,10).

		

		return "";
	}

	private char obtenerCaracterAleatorio(int posicionInicial, int posicionFinal) {
		// TODO: Generar un caracter aleatorio considerando las posiciones de los
		// caracteres en la tabla ASCII


		return '';
	}

	private Planta[] ordenarPlantasPorNombreAscendente(Planta[] plantas) {
		// TODO: Ordenar las plantas en el array suministrado por nombre de manera
		// ascendente y devolver el array

		return null;
	}

}
