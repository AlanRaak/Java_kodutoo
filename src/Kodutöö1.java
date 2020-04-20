import java.util.Scanner;

public class Kodutöö1 {
    static void ringjoon() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Raadiuse mõõt: ");
        int raadius = reader.nextInt(); // loen kasutaja inputti
        System.out.println("Ruut_S: " + raadius * raadius ); // arvutan vajalikud suurused
        System.out.println("Ruut_P: " + 8 * raadius );
        System.out.println("Ring_S: " + raadius * raadius * Math.PI );
        System.out.println("Ring_P: " + 2 * raadius * Math.PI );

    }

    static void palga_calculaator() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Tootajate arv: ");
        int t = reader.nextInt();
        int[] toomehed = new int[t];
        for (int i = 0; i < t; i++){
            System.out.println("Töötaja " + (i + 1) +" palganumber?");
            toomehed[i] = reader.nextInt(); // loen sisse töötaja palga
        }
        System.out.println("Mis palgast alates anname palgatõusu?");
        int palganumber = reader.nextInt();
        System.out.println("Palgad vastavalt -->");
        for (int i = 0; i < t; i++){
            if (toomehed[i] < palganumber) {
                System.out.println("1: " + (toomehed[i] * 1.05));
            }else{
                System.out.println("1: " + toomehed[i]);
            }
        }
    }
    static void osakeste_energia() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Mis on näiline temperatuur?");
        int temp = reader.nextInt();
        if (temp > 25) {
            System.out.println("hot!");
        }
        else if (temp < 10){
            System.out.println("cold!");
        }
        else {
            System.out.println("warm!");
        }
    }

    public static void extra_method_run(){
        ringjoon();
        palga_calculaator();
        osakeste_energia();
    }
    public static void main(String[] arg) {
        extra_method_run();
    }

}


