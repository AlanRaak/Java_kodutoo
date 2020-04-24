package Kodutöö6;

public class BanaanFromIndia extends Banaan {

    private double curvature;

    public BanaanFromIndia(double kaal, Integer kypsus, String sort, double priceKG, double curvature) {
        super(kaal, kypsus, sort, priceKG);
        this.curvature = curvature;
    }

    @Override
    public int getSäilivus(){
        return super.getSäilivus() / 2;
    }

    @Override
    public String toString() {
        return "BanaanFromIndia{" +
                "kaal=" + getKaal() +
                ", kypsus=" + getKypsus() +
                ", sort='" + getSort() + '\'' +
                ", priceKG=" + getPriceKG() +
                ", säilivus=" + getSäilivus() +
                ", price=" + getPrice() +
                ", curvature=" + curvature +
                '}';
    }
}
