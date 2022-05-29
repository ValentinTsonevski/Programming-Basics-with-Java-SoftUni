import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodInGramsNeeded = 0;
        int foodInKilograms = Integer.parseInt(scanner.nextLine());
        int foodInGrams = foodInKilograms * 1000;
        String command = scanner.nextLine();
        while (!command.equals("Adopted")) {
            int foodInGramsPerEat = Integer.parseInt(command);

            foodInGramsNeeded += foodInGramsPerEat;


            command = scanner.nextLine();
        }
        if (foodInGrams >= foodInGramsNeeded){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - foodInGramsNeeded);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodInGramsNeeded - foodInGrams));
        }








    }
}