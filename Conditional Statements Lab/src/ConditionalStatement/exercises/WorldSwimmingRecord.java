package ConditionalStatement.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecs = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecForOneMetre = Double.parseDouble(scanner.nextLine());
        double metresInSec = distanceInMetres * timeInSecForOneMetre;
        double waterSlow = Math.floor(distanceInMetres /15) * 12.5;
        double timeWithSlow = metresInSec + waterSlow;
        double difference = Math.abs(timeWithSlow - recordInSecs);
        if(recordInSecs >timeWithSlow){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeWithSlow);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
