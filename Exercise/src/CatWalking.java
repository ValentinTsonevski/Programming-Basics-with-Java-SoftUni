import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int countWalksPerDay = Integer.parseInt(scanner.nextLine());
        int eatCaloriesPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesBurnedPerWalk = 5;
        int enoughCaloriesBurned = eatCaloriesPerDay /2;

        int burnCaloriesPerWalkingDay = minWalkingPerDay * countWalksPerDay * caloriesBurnedPerWalk;

        if (burnCaloriesPerWalkingDay >= enoughCaloriesBurned ){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnCaloriesPerWalkingDay);

        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnCaloriesPerWalkingDay);
        }




    }
}
