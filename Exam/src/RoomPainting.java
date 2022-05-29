import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxesWithPainting = Integer.parseInt(scanner.nextLine());
        int numberTapes = Integer.parseInt(scanner.nextLine());
        double priceForOneGloves = Double.parseDouble(scanner.nextLine());
        double priceForOneBrush = Double.parseDouble(scanner.nextLine());

        double AllPriceForPaint = 21.50 * boxesWithPainting;
        double AllPriceForTapeti = 5.20 * numberTapes;
        double needGloves = Math.ceil(numberTapes * 0.35);
        double needBrush = Math.floor(boxesWithPainting * 0.48);
        double totalPriceGloves = needGloves * priceForOneGloves;
        double totalPriceBrush = needBrush * priceForOneBrush;
        double priceForAllProduct = AllPriceForPaint + AllPriceForTapeti + totalPriceGloves + totalPriceBrush;
        double value =  priceForAllProduct / 15;
        System.out.printf("This delivery will cost %.2f lv." , value);

    }
}
