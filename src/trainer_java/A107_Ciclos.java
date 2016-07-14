package trainer_java;

public class A107_Ciclos {

	public static void main(String[] args) {
		
		// WHILE
		int a = 1;
		while (a < 5) {
			System.out.println(a);
			a++;			
		}
		
		
		// FOR
		for (int i = 0; i < 10; i++) {
			System.out.println("For ->" + i);
		}
		
		
		// FOR
		int[] miArray = new int[3];
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = i*3;
		}
		
		
		// FOREACH
		for (int i : miArray) {
			System.out.println(i);
		}

	}

}
