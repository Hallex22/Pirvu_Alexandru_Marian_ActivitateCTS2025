package Readere;

import Clase.Angajat;
import Clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public AngajatReader(String file) {
        super(file);
    }
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat aplicant = new Angajat();
            super.readAplicantData(input2, aplicant);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            aplicant.setSalariu(salariu);
            aplicant.setOcupatie(ocupatie);
            angajati.add(aplicant);
        }
        input2.close();
        return angajati;
    }
}
