import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissions = 0.00;
        if (cityName.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commissions = sales * 0.05;
                System.out.printf("%.2f", commissions);
            } else if (sales > 500 && sales <= 1000) {
                commissions = sales * 0.07;
                System.out.printf("%.2f", commissions);
            } else if (sales > 1000 && sales <= 10000) {
                commissions = sales * 0.08;
                System.out.printf("%.2f", commissions);
            } else if (sales > 10000) {
                commissions = sales * 0.12;
                System.out.printf("%.2f", commissions);
            }else {
                System.out.println("error");
            }
        } else if (cityName.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commissions = sales * 0.045;
                System.out.printf("%.2f", commissions);
            } else if (sales > 500 && sales <= 1000) {
                commissions = sales * 0.075;
                System.out.printf("%.2f", commissions);
            } else if (sales > 1000 && sales <= 10000) {
                commissions = sales * 0.10;
                System.out.printf("%.2f", commissions);
            } else if (sales > 10000) {
                commissions = sales * 0.13;
                System.out.printf("%.2f", commissions);
            } else {
                System.out.println("error");
            }
        } else if (cityName.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commissions = sales * 0.055;
                System.out.printf("%.2f", commissions);
            } else if (sales > 500 && sales <= 1000) {
                commissions = sales * 0.08;
                System.out.printf("%.2f", commissions);
            } else if (sales > 1000 && sales <= 10000) {
                commissions = sales * 0.12;
                System.out.printf("%.2f", commissions);
            } else if (sales > 10000) {
                commissions = sales * 0.145;
                System.out.printf("%.2f", commissions);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }


    }
}
