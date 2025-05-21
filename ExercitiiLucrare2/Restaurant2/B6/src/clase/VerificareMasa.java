package clase;

public class VerificareMasa {
    MasaLibera masaLibera;
    MasaDebarasata masaDebarasata;
    Servetele servetele;

    public VerificareMasa(MasaLibera masaLibera, MasaDebarasata masaDebarasata, Servetele servetele) {
        this.masaLibera = masaLibera;
        this.masaDebarasata = masaDebarasata;
        this.servetele = servetele;
    }

    public void verificaStatusMasa(int nrMasa) {
        masaLibera.verificaMasaLibera(nrMasa);
        masaDebarasata.vefificaMasaDebarasata(nrMasa);
        servetele.verificaServetele(nrMasa);
    }
}
