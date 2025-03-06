package Readere;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    public ElevReader(String file) {
        super(file);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev aplicant = new Elev();
            super.readAplicantData(input2, aplicant);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            aplicant.setClasa(clasa);
            aplicant.setTutore(tutore);
            elevi.add(aplicant);
        }

        input2.close();
        return elevi;
    }
}
