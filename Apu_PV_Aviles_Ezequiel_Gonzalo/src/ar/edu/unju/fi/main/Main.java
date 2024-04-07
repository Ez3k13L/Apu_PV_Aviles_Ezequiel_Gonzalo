package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
		int numMaterias = 1;
		//
		while (numMaterias <= 4){
			
			System.out.println("Ingrese el codigo de la materia ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia (codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registronota = new RegistroNota(codigoMateria, codigoNota, nombreMateria, nota);
			
			System.out.println(registronota.toString());
			numMaterias++;
		}
		
		
		
		

	}

}
