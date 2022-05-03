import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countOrders = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (fruit){
            case "Watermelon":
                switch (size){
                    case "small":
               price = 2 * 56.0;
               break;
                    case "big":
                        price = 5 * 28.70;
                        break;
                }
                break;
            case "Mango":
                switch (size){
                    case"small":
                        price = 2 * 36.66;
                        break;
                    case "big":
                        price = 5 * 19.60;
                        break;

                }
                break;
            case "Pineapple":
                switch (size){
                    case "small":
                        price = 2 * 42.10;
                        break;
                    case "big":
                        price = 5 * 24.80;
                        break;
                }
                break;
            case "Raspberry":
                switch (size){
                    case "small":
                        price = 2 * 20.0;
                        break;
                    case "big":
                        price = 5 * 15.20;
                        break;
                }
        }
        double sum = countOrders * price;
        if(sum >= 400 && sum <= 1000){
         sum = sum - sum * 0.15;
        }
        if(sum > 1000){
        sum = sum - sum * 0.50;
        }
        System.out.printf("%.2f lv.", sum);


    }
}
