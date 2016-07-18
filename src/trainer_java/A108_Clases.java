package trainer_java;

public class A108_Clases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono miTelefono = new Telefono();
		miTelefono.marca = "Motorola";
		miTelefono.modelo = "K1";
		miTelefono.precio = 678.98;
		miTelefono.mostrarDatos();
		
		System.out.println("Creando un Nuevo Objeto telefono");
		Telefono Telefono2 = new Telefono();
		Telefono2.mostrarDatos();
	}

}
