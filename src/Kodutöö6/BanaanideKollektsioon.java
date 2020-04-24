package Kodutöö6;

import java.util.List;

public class BanaanideKollektsioon {
    List<Banaan> bananas;
    List<BanaanFromIndia> banananasIndia;

    public BanaanideKollektsioon(List<Banaan> bananas, List<BanaanFromIndia> banananasIndia) {
        this.bananas = bananas;
        this.banananasIndia = banananasIndia;
    }

    public BanaanideKollektsioon(){
    }

    public void addBananas(List<Banaan> bananas) {
        this.bananas.addAll(bananas);
    }

    public void addBanananasIndia(List<BanaanFromIndia> bananas) {
        this.banananasIndia.addAll(bananas);
    }

    public void addBanana(Banaan banana) {
        this.bananas.add(banana);
    }

    public void addBanananaIndia(BanaanFromIndia banana) {
        this.banananasIndia.add(banana);
    }

    public void setBananas(List<Banaan> bananas) {
        this.bananas = bananas;
    }

    public void setBanananasIndia(List<BanaanFromIndia> banananasIndia) {
        this.banananasIndia = banananasIndia;
    }

    public List<Banaan> getBananas() {
        return bananas;
    }

    public List<BanaanFromIndia> getBanananasIndia() {
        return banananasIndia;
    }
}
