import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        double totalRakiq = 0.0;
        double totalDegrees = 0.0;
        double averageDegrees = 0.0;

        for (int number = 1; number <= days; number++) {
            double quantityRakiq = Double.parseDouble(scanner.nextLine());
            double degreesOnRakiq = Double.parseDouble(scanner.nextLine());

            totalRakiq += quantityRakiq;
            totalDegrees += quantityRakiq * degreesOnRakiq;
            averageDegrees = totalDegrees / totalRakiq;

        }


        System.out.printf("Liter: %.2f\n", totalRakiq);
        System.out.printf("Degrees: %.2f\n", averageDegrees);
      if(averageDegrees < 38){
          System.out.println("Not good, you should baking!");
      }else if (averageDegrees >=38 && averageDegrees < 42){
          System.out.println("Super!");
      }else if (averageDegrees > 42){
          System.out.println("Dilution with distilled water!");
      }

    }
}
