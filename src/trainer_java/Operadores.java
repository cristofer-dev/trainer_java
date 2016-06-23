package trainer_java;

public class Operadores {

	public static void main(String[] args) {
		// Operadores
		int a = 2;
		int b = 5;
		int c = 0;
		
		// SUMA
		c = a + b;
		System.out.println("La Suma es : " + c);
		
		// RESTA
		c = a - b ;
		System.out.println("La Resta es :" + c);
		
		// MULTIPLICACION
		c = a * b ;
		System.out.println("La Multiplicacion es :" + c);
		
		// DIVISION
		c = b / a ;
		System.out.println("La Divición es :" + c);
		
		// MODULO
		c = b % a;
		System.out.println("El Modulo es :" + c);
		
		// Asignacion
		c = 2;
		a = 4;
		
		c += a;
		System.out.println("C vale = " + c);
		
		c -= a;
		System.out.println("C vale = " + c);
		
		c *= a;
		System.out.println("C vale = " + c);
		
		c /= a;
		System.out.println("C vale = " + c);
		
		c %= a;
		System.out.println("C vale = " + c);		

	}

}
