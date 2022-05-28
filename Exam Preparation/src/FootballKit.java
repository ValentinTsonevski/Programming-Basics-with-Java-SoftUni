import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForBonusBall = Double.parseDouble(scanner.nextLine());

        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double bootsPrice = (shirtPrice + shortsPrice) * 2;
        double totalSumWithoutDiscount = shirtPrice + shortsPrice + socksPrice + bootsPrice;
        double totalSum = totalSumWithoutDiscount - totalSumWithoutDiscount * 0.15;
        if (totalSum >= sumForBonusBall){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",totalSum);
        }else {
            double moneyNeeded = sumForBonusBall - totalSum;
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",moneyNeeded);
        }


    }
}
