package Kodutöö6;

public class Banaan {
    private double kaal;
    private Integer kypsus;
    private String sort;
    private double priceKG;

    public Banaan(double kaal, Integer kypsus, String sort, double priceKG) {
        this.kaal = kaal;
        this.kypsus = kypsus;
        this.sort = sort;
        this.priceKG = priceKG;
    }

    public int getSäilivus(){
        return 10-kypsus;
    }

    public double getPrice(){
        if (Double.compare(kaal, 0.2) > 0){
            return kaal * priceKG * 0.95;
        }
        return kaal * priceKG;
    }

    @Override
    public String toString() {
        return "Banaan{" +
                "kaal=" + kaal +
                ", kypsus=" + kypsus +
                ", sort='" + sort + '\'' +
                ", priceKG=" + priceKG +
                ", säilivus=" + getSäilivus() +
                ", price=" + getPrice() +
                '}';
    }

    public double getKaal() {
        return kaal;
    }

    public Integer getKypsus() {
        return kypsus;
    }

    public String getSort() {
        return sort;
    }

    public double getPriceKG() {
        return priceKG;
    }
}
