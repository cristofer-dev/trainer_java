package trainer_java;

public class A111_Exception {

	public static void main(String[] args) {
		
		try {
			int[] numeros = {5,2,8};
			System.out.println(numeros[0]);
			System.out.println(numeros[3]);
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error!");
			//e.printStackTrace();
		}

	}

}
