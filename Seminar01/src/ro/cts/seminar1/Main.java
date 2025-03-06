package ro.cts.seminar1;

import ro.cts.seminar1.clase.Curs;
import ro.cts.seminar1.clase.Persoana;
import ro.cts.seminar1.clase.Profesor;
import ro.cts.seminar1.clase.Student;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Alin", 22, 1, 10000, 0.02f);

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Student("Andrei", 20, 1));
        listaStudenti.add(new Student("Alex", 21, 10));
        listaStudenti.add(new Student("Andreea", 21, 5));

        Curs curs = new Curs("CTS", 5, profesor, listaStudenti);
        float venitProfesor = ((Persoana)curs.getProfesor()).calculareVenit();
        System.out.println("Venit profesor " + venitProfesor);

        curs.sustineExamen("10-06-2025");

        ((IPredabil)curs.getProfesor()).preda();
    }
}