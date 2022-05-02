import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecFor1Metres = Double.parseDouble(scanner.nextLine());

        double DistanceInSec = distanceInMetres * timeInSecFor1Metres;
        double distanceInSecAfterSlow = Math.floor(distanceInMetres / 50) * 30;
        double totalTime = DistanceInSec + distanceInSecAfterSlow ;

        if(recordInSec <= totalTime){
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(totalTime - recordInSec));
        }else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }



    }
}
