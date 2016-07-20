package trainer_java;

public class SmartPhone extends Telefono implements IDevolucion {

	private String sim;
	
	public SmartPhone(String marca, String modelo, 
					  double precio, String sim) {
		super(marca, modelo, precio);
		this.sim = sim;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	@Override
	public void hacerDevolucion() {
		System.out.println("Devolucion de un SmartPhone");		
	}
}
