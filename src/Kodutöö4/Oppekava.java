package Kodutöö4;

import java.util.Arrays;

public class Oppekava {

    private String oppekavaKood;
    private Aine[] ained;

    public Oppekava(String oppekavaKood, Aine[] ained) {
        this.oppekavaKood = oppekavaKood;
        this.ained = ained;
    }

    @Override
    public String toString() {
        return "Oppekava{" +
                "oppekavaKood='" + oppekavaKood + '\'' +
                ", ained=" + Arrays.toString(ained) +
                '}';
    }

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public Aine[] getAined() {
        return ained;
    }

    public void setAined(Aine[] ained) {
        this.ained = ained;
    }
}
