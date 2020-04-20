import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Kodutöö3 {

    BufferedReader br = null;
    private static Scanner in = new Scanner(System.in);

    private static String askForFilename(){
        System.out.println("Enter the name of the file below: ");
        return in.nextLine();
    }

    private static double returnAverageWOMaxMin(List<Integer> dataInt) {
        return (double) (returnAverage(dataInt)*dataInt.size() - (returnMax(dataInt) + (double) returnMin(dataInt))) / (double) (dataInt.size()-2);
    }
    private static int returnMin(List<Integer> dataInt) {
        int min = dataInt.get(0);
        for (int i : dataInt) min = (Math.min(i, min));
        return min;
    }

    private static int returnMax(List<Integer> dataInt) {
        int max = dataInt.get(0);
        for (int i : dataInt) max = (Math.max(i, max));
        return max;
    }

    private static double returnAverage(List<Integer> dataInt) {
        int sum = 0;
        for (Integer s : dataInt) sum += s;
        return (double) sum / (double) dataInt.size();
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        String csvFile = askForFilename();
        BufferedReader br = null;
        try {
            String line = "";

            boolean asked = false;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                List<String> oneLineData = new LinkedList<String>(Arrays.asList(line.split(";")));
                //Arrays.asList(line.split(";"));
                System.out.println(oneLineData.remove(0));

                List<Integer> dataInt = new ArrayList<>();
                for(String s : oneLineData) dataInt.add(Integer.parseInt(s.trim()));
                System.out.println(String.format("Max temperature is: %d \nMin temperature is: %d \nAverage temperature is: %f \nAverage without extremes is: %f", returnMax(new ArrayList<>(dataInt)), returnMin(new ArrayList<>(dataInt)), round(returnAverage(new ArrayList<>(dataInt)), 1), round(returnAverageWOMaxMin(new ArrayList<>(dataInt)),1)));

                if (!asked){
                    System.out.println("Want more data? ( y / n )");
                    asked = true;
                    if (in.nextLine().equals("n")) break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
