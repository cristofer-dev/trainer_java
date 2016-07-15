package trainer_java;

public class Telefono {
	int id;
	String marca;
	String modelo;
	double precio;
	
	public void mostrarDatos(){
		System.out.println("id : " + id);
		System.out.println("Marca : " + marca);
		System.out.println("Modelo : " + modelo);
		System.out.println("Precio : " + precio);
	}
}