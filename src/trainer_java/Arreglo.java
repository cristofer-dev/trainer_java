package trainer_java;

public class Arreglo {

	public static void main(String[] args) {
		// Declarando el Array
		int[] 		MiArray = new int[5];
		int[][] 	MiArrayBi = new int[5][5];
		int[][][] 	MiArrayTri = new int[3][3][3];
		
		// Asignando Valor (SET)
		MiArray[0] = 666;
		MiArrayBi[0][0] = 34;
		MiArrayTri[1][1][1] = 78;
		
		// Accediendo al valor (GET)
		System.out.println(MiArray[0]);
		System.out.println(MiArrayBi[0][0]);
		System.out.println(MiArrayTri[1][1][1]);

	}

}
