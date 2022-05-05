import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalSum = 0.00;
        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                totalSum = quantity * 0.50;
                System.out.println(totalSum);
            } else if (product.equals("water")) {
                totalSum = quantity * 0.80;
                System.out.println(totalSum);
            } else if (product.equals("beer")) {
                totalSum = quantity * 1.20;
                System.out.println(totalSum);
            } else if (product.equals("sweets")) {
                totalSum = quantity * 1.45;
                System.out.println(totalSum);
            } else if (product.equals("peanuts")) {
                totalSum = quantity * 1.60;
                System.out.println(totalSum);
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                totalSum = quantity * 0.40;
                System.out.println(totalSum);
            } else if (product.equals("water")) {
                totalSum = quantity * 0.70;
                System.out.println(totalSum);
            } else if (product.equals("beer")) {
                totalSum = quantity * 1.15;
                System.out.println(totalSum);
            } else if (product.equals("sweets")) {
                totalSum = quantity * 1.30;
                System.out.println(totalSum);
            } else if (product.equals("peanuts")) {
                totalSum = quantity * 1.50;
                System.out.println(totalSum);
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                totalSum = quantity * 0.45;
                System.out.println(totalSum);
            } else if (product.equals("water")) {
                totalSum = quantity * 0.70;
                System.out.println(totalSum);
            } else if (product.equals("beer")) {
                totalSum = quantity * 1.10;
                System.out.println(totalSum);
            } else if (product.equals("sweets")) {
                totalSum = quantity * 1.35;
                System.out.println(totalSum);
            } else if (product.equals("peanuts")) {
                totalSum = quantity * 1.55;
                System.out.println(totalSum);
            }
        }


    }
}
