package ConditionalStatement.exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totaltime = first + second + third;
        int totalTimeInMin = totaltime / 60;
        int totalTimeInSec = totaltime % 60;
        if (totalTimeInSec < 10) {
            System.out.printf("%d:0%d", totalTimeInMin, totalTimeInSec);

        }else System.out.printf("%d:%d", totalTimeInMin, totalTimeInSec);


    }
}
