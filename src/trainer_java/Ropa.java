package trainer_java;

public class Ropa {
	private String id;
	private double precio;
	private String talla;
	private String color;
	
	public Ropa(String id, double precio, String talla, String color){
		this.id = id;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void mostrarDatos(String nombreClase){
		System.out.println(nombreClase);
		System.out.println("ID : " + id);
		System.out.println("Precio : " + precio);
		System.out.println("Talla : " + talla);
		System.out.println("Color : " + color);		
	}
	
	
}
