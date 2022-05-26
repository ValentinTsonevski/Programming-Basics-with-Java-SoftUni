import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magickNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        int combinationCounter = 0;

        for (int firstNumber = startNumber; firstNumber <= endNumber ; firstNumber++) {
            for (int secondNumber = startNumber; secondNumber <= endNumber; secondNumber++) {
                combinationCounter++;
                int sum = firstNumber + secondNumber;
                if (magickNumber == sum){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter , firstNumber, secondNumber, magickNumber);
                    break;
                }

            }
            if(isFound){
                break;
            }
        }
        if (!isFound){
            System.out.printf("%d combinations - neither equals %d", combinationCounter , magickNumber);
        }




    }
}
