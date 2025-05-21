package program;

import clase.MasaDebarasata;
import clase.MasaLibera;
import clase.Servetele;
import clase.VerificareMasa;

public class Main {
    public static void main(String[] args) {
        MasaDebarasata masaDebarasata = new MasaDebarasata();
        MasaLibera masaLibera = new MasaLibera();
        Servetele servetele = new Servetele();

        VerificareMasa verificareMasa = new VerificareMasa(masaLibera, masaDebarasata, servetele);
        verificareMasa.verificaStatusMasa(10);
    }
}