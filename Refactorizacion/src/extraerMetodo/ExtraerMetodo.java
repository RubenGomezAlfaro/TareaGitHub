package extraerMetodo;



public class ExtraerMetodo {

	public void Imprimir() {
		imprimirCabezera();
		
		imprimirDetalles();
	}
	private void imprimirDetalles() {
		//Imprimir detalles
		System.out.println("Nombre");
		System.out.println("Apellidos");
		System.out.println("Nombre");
	}
	private void imprimirCabezera() {
		//Imprimir cabecera
		System.out.println("---CABECERA---");
	}

}
