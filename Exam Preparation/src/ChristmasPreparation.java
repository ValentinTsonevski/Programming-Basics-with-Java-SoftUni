import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPaper = Integer.parseInt(scanner.nextLine()); //rolki opakovachna hartiq
        int countCloth = Integer.parseInt(scanner.nextLine()); // broi rolki plat
        double litresGlue = Double.parseDouble(scanner.nextLine()); // litri lepilo
        double discount = Double.parseDouble(scanner.nextLine()); // otstupka

        double paperPrice = countPaper * 5.80; // cena za broi
        double clothPrice = countCloth * 7.20; // cena za broi
        double gluePrice = litresGlue * 1.20; //cena za litur

        double totalSumWithoutDiscount = paperPrice + clothPrice + gluePrice;
        double discountPrice = totalSumWithoutDiscount * (discount * 0.01);
        double totalSum = totalSumWithoutDiscount - discountPrice;

        System.out.printf("%.3f", totalSum);
    }
}
