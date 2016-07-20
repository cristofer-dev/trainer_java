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
		
		System.out.println("Creando un Nuevo Objeto telefono");
		System.out.println("Pasando parametros al constructor");
		Telefono Telefono3 = new Telefono("Apple", "5s",562.36);
		Telefono3.setId(5555);
		Telefono3.mostrarDatos();
		
		Playera MiPlayera = new Playera("A562",562.36,"M", "Blue", "Recto");
		MiPlayera.mostrarDatos("---Playera");
		
		Jeans MiJeans = new Jeans("F562",800.99,"XL","Orange","RECTO",'F');
		MiJeans.mostrarDatos("---Jeans");
	}

}
