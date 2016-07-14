package trainer_java;

public class A106_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// IF else
		int a = 11;
		int b = 11;
		
		if (a < b) {
			System.out.println("A menor que B");
		}else{
			System.out.println("A mayor que B");
		}
		
		// if elseif
		if (a > b) {
			System.out.println("A MAYOR que B");
		}else if(b > a){
			System.out.println("B MAYOR que B");
		}else{
			System.out.println("A igual B");
		}
		
		// SWITCH
		int c = 3000;
		
		switch (c) {
		case 1000:
			System.out.println("c = 1000");
			break;
			
		case 2000:
			System.out.println("c = 2000");
			break;

		default:
			System.out.println("C Distinto");
			break;
		}
		

	}

}
