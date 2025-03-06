package Clase;

import Readere.AngajatReader;
import Readere.AplicantReader;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new AngajatReader("angajati.txt");
		try {
			listaAplicanti = aplicantReader.readAplicanti();
			for(Aplicant angajat : listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
