import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int totalPieces = length * width;
        String command = scanner.nextLine();
        boolean isFailed = false;

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            totalPieces -= pieces;
            if (totalPieces <= 0) {
                isFailed = true;
                break;
            }


            command = scanner.nextLine();

        }
        if (isFailed) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        } else {
            System.out.printf("%d pieces are left.", totalPieces);
        }


    }
}
