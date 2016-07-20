package trainer_java;

public class PlayeraPersonalizada extends Ropa {
	
	private String twitter;

	public PlayeraPersonalizada(String id, double precio, 
								String talla, String color,
								String twitter) {
		super(id, precio, talla, color);
		this.twitter = twitter;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Override
	public void mostrarDatos(String nombreClase) {		
		super.mostrarDatos(nombreClase);
		System.out.println("Twitter : " + twitter);
	}
	
	

	
}
