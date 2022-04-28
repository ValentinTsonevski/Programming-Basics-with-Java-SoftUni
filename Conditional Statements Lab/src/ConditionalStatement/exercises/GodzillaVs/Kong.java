package ConditionalStatement.exercises.GodzillaVs;

import java.util.Scanner;

public class Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        double decor = filmBudget * 0.10;
        if (statist > 150) {
            clothes = clothes - clothes * 0.10;
        }
        double moneyForClothes = statist * clothes;
        double moneyForFilming = decor + moneyForClothes;
        if (decor + moneyForClothes <= filmBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget - moneyForFilming);
        } else if (moneyForFilming > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyForFilming - filmBudget);

        }


    }
}
