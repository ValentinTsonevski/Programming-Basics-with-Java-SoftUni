import java.util.Scanner;

public class AndProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberProcessors = Integer.parseInt(scanner.nextLine()); // procesorite koito trqbvad da se izrabotqt
        int personalNumber = Integer.parseInt(scanner.nextLine()); // personal
        int workingDays = Integer.parseInt(scanner.nextLine()); // rabotni dni
        int workingHoursPerDay = 8;
        double timeForOneProcessor = 3.0;
        double pricePerProcessor = 110.10;
        double profit = 0 ;
        double loss = 0;

        int totalWorkingHours = personalNumber * workingDays * workingHoursPerDay;
        double processorsForPeriod =  Math.floor(totalWorkingHours / timeForOneProcessor);

        if(processorsForPeriod >= numberProcessors){
            double processorsLeft =  processorsForPeriod -numberProcessors;
            profit = processorsLeft * pricePerProcessor;
            System.out.printf("Profit: -> %.2f BGN", profit);
        }else {
            double processorsLeft = Math.abs(numberProcessors - processorsForPeriod);
            loss = processorsLeft * 110.10;
            System.out.printf("Losses: -> %.2f BGN", loss);
        }



    }
}
