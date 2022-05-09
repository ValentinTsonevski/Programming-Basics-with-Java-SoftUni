import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        double discount = 0.00;
        double rent = 0.00;
        String season = scanner.nextLine();
        int fisherNumber = Integer.parseInt(scanner.nextLine());
        if (season.equals("Spring")) {
            rent = 3000;
            if (fisherNumber <= 6) {
                discount = 0.10;

            } else if (fisherNumber <= 11) {
                discount = 0.15;
            } else {
                discount = 0.25;
            }if (fisherNumber % 2 == 0) {
                rent = rent - rent * 0.05;
            }

        } else if (season.equals("Summer")) {
            rent = 4200;

            if (fisherNumber <= 6) {
                discount = 0.10;
            } else if (fisherNumber <= 11) {
                discount = 0.15;
            } else {
                discount = 0.25;
            }if (fisherNumber % 2 == 0) {
                rent = rent - rent * 0.05;
            }


        } else if (season.equals("Winter")) {
            rent = 2600;

            if (fisherNumber <= 6) {
                discount = 0.10;
            } else if (fisherNumber <= 11) {
                discount = 0.15;
            } else {
                discount = 0.25;
            }if (fisherNumber % 2 == 0) {
                rent = rent - rent * 0.05;
            }

        } else if (season.equals("Autumn")) {
            rent = 4200;
            if (fisherNumber <= 6) {
                discount = 0.10;
            } else if (fisherNumber <= 11) {
                discount = 0.15;
            } else {
                discount = 0.25;
            }

        }
        double moneyNeeded = rent - rent  * discount;
        if (budget >= moneyNeeded) {
            System.out.printf("Yes! You have %.2f leva left.", budget - moneyNeeded);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded - budget);
        }


    }
}
