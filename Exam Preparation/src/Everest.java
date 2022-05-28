import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int daysCounter = 0;
        int metresCount = 5364;
        boolean isFailed = false;

        while (!command.equals("END")) {
            String text = scanner.nextLine();
            int metres = Integer.parseInt(command);

            metresCount += metres;
            daysCounter++;
            command = scanner.nextLine();


            if (daysCounter == 5){
                System.out.println("Failed!");
                System.out.printf("%d", metresCount);
                isFailed = true;
                break;

            }

        }
        if(metresCount >= 8848){
            System.out.println("Failed");
            System.out.printf("%d",metresCount);
        }

    }
}
