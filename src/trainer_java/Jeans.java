package trainer_java;

public class Jeans {
	private	String id;
	private double precio;
	private String talla;
	private String color;
	private String corte;
	private char genero;
	
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
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void mostrarDatos(){
		System.out.println("Jeans");
		System.out.println("ID : " + id);
		System.out.println("Precio : " + precio);
		System.out.println("Talla : " + talla);
		System.out.println("Color : " + color);
		System.out.println("Corte : " + corte);
		System.out.println("Genero : " + genero);
	}
	

}
