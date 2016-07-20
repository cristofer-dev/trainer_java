package trainer_java;

public class TelefonoHogar extends Telefono {

	private boolean alambrico;
	
	public TelefonoHogar(String marca, String modelo, 
						double precio, boolean alambrico) {
		super(marca, modelo, precio);
		this.alambrico = alambrico;

	}

	public boolean isAlambrico() {
		return alambrico;
	}

	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}
	
	

}
