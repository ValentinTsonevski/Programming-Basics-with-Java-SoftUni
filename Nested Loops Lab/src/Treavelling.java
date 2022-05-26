import java.util.Scanner;

public class Treavelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double sum = 0;
            double neededBudget = Double.parseDouble(scanner.nextLine());

            while (sum < neededBudget){
                double money = Double.parseDouble(scanner.nextLine());
                sum += money;

            }

            System.out.printf("Going to %s!\n", destination);
          destination = scanner.nextLine();
        }







    }
}
