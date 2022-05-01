package ConditionalStatement.exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double budget = puzzle * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int totalToys = puzzle + dolls + bears + minions + trucks;
        if (totalToys >= 50) {
            budget = budget - budget * 0.25;
        }
        budget = budget - budget * 0.10;
        if (budget >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", budget - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - budget);
        }

    }
}
