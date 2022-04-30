package ConditionalStatement.exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double videoCardsSum = videoCards * 250;
        double processorsSum = videoCardsSum * 0.35;
        double ramSum = videoCardsSum * 0.10;
        double totalPrice = videoCardsSum + processorsSum * processors + ramSum * ram;
        if (videoCards > processors) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }


    }
}
