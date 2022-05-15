import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toy = 0;
        int money = 10;
        int sum = 0;
        for (int i = 1; i <= years; i++) {

            if (i % 2 == 0) {
                sum += money - 1;
                money += 10;

            } else {
                toy += 1;
            }

        }
        sum += toy * toyPrice;

        if (sum >= laundry) {
            System.out.printf("Yes! %.2f", sum - laundry);
        } else {
            System.out.printf("No! %.2f", Math.abs(laundry - sum));
        }


    }
}
