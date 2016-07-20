package trainer_java;

import java.util.ArrayList;

public class A109_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> verduras = new ArrayList<String>();
		verduras.add("Papas");
		verduras.add("Choclos");
		verduras.add("Zapallos");
		
		System.out.println("El array tiene " + verduras.size() + " items");
		System.out.println(verduras);
		
		verduras.remove(1);
		
		System.out.println("El array tiene " + verduras.size() + " items");
		System.out.println(verduras);

	}

}
