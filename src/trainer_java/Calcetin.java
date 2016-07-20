package trainer_java;

public class Calcetin {
	private String id;
	private double precio;
	private String talla;
	private String color;
	
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
	
	public void mostrarDatos(){
		System.out.println("Calcetin");
		System.out.println("ID : " + id);
		System.out.println("Precio : " + precio);
		System.out.println("Talla : " + talla);
		System.out.println("Color : " + color);
	}	
}