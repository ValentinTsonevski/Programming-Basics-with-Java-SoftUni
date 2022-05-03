import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoin = Double.parseDouble(scanner.nextLine());
        double ioan = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double dolar = ioan * 0.15;
       double Euro = 1.95;


        double TotalLeva = bitcoin * 1168 + dolar * 1.76 ;
        double totalEuro = TotalLeva / Euro;
        double TotalEuroAfterFee = totalEuro - totalEuro * (fee / 100);
        System.out.printf("%.2f", TotalEuroAfterFee);






    }
}
