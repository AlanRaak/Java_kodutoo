package Kodutöö4;

public class Test_class {
    public static void main(String[] args) {
        Aine oppeaine = new Aine("RT-016", "OOP", 5);
        Aine oppeaine2 = new Aine("RT-0246", "Hadam", 12);

        Aine[] ained = {oppeaine, oppeaine2};

        Oppekava kava = new Oppekava("420", ained);
        System.out.println(kava.toString());
    }
}
