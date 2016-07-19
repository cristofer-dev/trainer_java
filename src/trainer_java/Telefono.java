package trainer_java;

public class Telefono {
	private int id;
	String marca;
	String modelo;
	double precio;
	
	public Telefono(){
		this.id = 0;
		this.marca = "ND";
		this.modelo = "ND";
		this.precio = 0.0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Telefono(String marca, String modelo, double precio ){
		this.id = 0;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public void mostrarDatos(){
		System.out.println("id : " + id);
		System.out.println("Marca : " + marca);
		System.out.println("Modelo : " + modelo);
		System.out.println("Precio : " + precio);
	}
}