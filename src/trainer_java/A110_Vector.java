package trainer_java;

import java.util.Vector;

public class A110_Vector {

	public static void main(String[] args) {
		Vector<String> Asignaturas = new Vector<String>();
		
		Asignaturas.addElement("Len");
		Asignaturas.addElement("Mat");
		Asignaturas.addElement("Ing");
		Asignaturas.addElement("His");

		System.out.println("Tama�o del vector : " + Asignaturas.size());
		System.out.println(Asignaturas);
		
		Asignaturas.remove(2);
		
		System.out.println("Tama�o del vector : " + Asignaturas.size());
		System.out.println(Asignaturas);
		
	}

}
