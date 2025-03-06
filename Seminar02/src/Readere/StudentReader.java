package Readere;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public StudentReader(String file) {
        super(file);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student aplicant = new Student();
            super.readAplicantData(input, aplicant);
            int anStudii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setAnStudii(anStudii);
            aplicant.setFacultate(facultate);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }
}
