package Kodutöö6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BananaTester {
    public static void main(String[] args) {
        BanaanideKollektsioon banaanid = new BanaanideKollektsioon();
        Banaan banaan1 = new Banaan(0.1, 4, "Tavaline", 4.9);
        Banaan banaan2 = new Banaan(0.13, 5, "Jõgeva kollane", 1.4);
        Banaan banaan3 = new Banaan(0.45, 7, "Tartu Kesklinn", 10.2);
        BanaanFromIndia banaanfromindia1 = new BanaanFromIndia(0.4, 1, "HinduMix", 1, 2);
        BanaanFromIndia banaanfromindia2 = new BanaanFromIndia(6.9, 3, "Pruun", 23, 23);
        BanaanFromIndia banaanfromindia3 = new BanaanFromIndia(0.02, 9, "BrwonMan", 5, 7);
        BanaanFromIndia banaanfromindia4 = new BanaanFromIndia(0.12, 10, "WildAngry", 0.1, 17);
        BanaanFromIndia banaanfromindia5 = new BanaanFromIndia(0.21, 8, "AverageMale", 4.7, 34);
        BanaanFromIndia banaanfromindia6 = new BanaanFromIndia(0.2, 6, "Piisknakkus", 1.3, 39);
        BanaanFromIndia banaanfromindia7 = new BanaanFromIndia(0.46, 5, "Kõverik", 7.2, 44);

        List<Banaan> bananas = new ArrayList<>(Arrays.asList(banaan1, banaan2, banaan3));
        List<BanaanFromIndia> bananasfromindia = new ArrayList<>(Arrays.asList(banaanfromindia1, banaanfromindia2, banaanfromindia3, banaanfromindia4, banaanfromindia5, banaanfromindia6, banaanfromindia7));

        banaanid.setBananas(bananas);
        banaanid.setBanananasIndia(bananasfromindia);

        for (Banaan ban : banaanid.getBananas()){
            System.out.println(ban.toString());
        }

        for (BanaanFromIndia banHindu : banaanid.getBanananasIndia()){
            System.out.println(banHindu.toString());
        }

    }
}
