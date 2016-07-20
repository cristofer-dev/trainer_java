package trainer_java;

public class Calcetin extends Ropa implements IDevolucion {

	public Calcetin(String id, double precio, String talla, String color) {
		super(id, precio, talla, color);

	}

	@Override
	public void hacerDevolucion() {
		System.out.println("Devolucion de un Calcetin");	
	}	
}