package Kodutöö4;

public class Aine {

    private String kood;
    private String nimetus;
    private int ainepunktide_arv;

    public Aine(String kood, String nimetus, int ainepunktide_arv) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.ainepunktide_arv = ainepunktide_arv;
    }

    @Override
    public String toString() {
        return String.format("\nAine: \"%s\"\nKood: %s\nAinepunktide arv: %d", nimetus, kood, ainepunktide_arv);
    }

    public int akadeemilisi_tunde() {
        return ainepunktide_arv * 8;
    }

    public String getKood() {
        return kood;
    }

    public void setKood(String kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public int getAinepunktide_arv() {
        return ainepunktide_arv;
    }

    public void setAinepunktide_arv(int ainepunktide_arv) {
        this.ainepunktide_arv = ainepunktide_arv;
    }
}
