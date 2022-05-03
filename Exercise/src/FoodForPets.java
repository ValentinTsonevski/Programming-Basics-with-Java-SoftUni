import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int countDays = Integer.parseInt(scanner.nextLine());
     double totalFood = Double.parseDouble(scanner.nextLine());
     int days = 0;
     double biscuits = 0.0;
     double totalFoodEaten = 0;
     double foodDogEaten = 0.0;
     double catFoodEaten = 0.0;



        for (int i = 1; i <= countDays ; i++) {
        int dogEatFood = Integer.parseInt(scanner.nextLine());
        int catEatFood = Integer.parseInt(scanner.nextLine());
        double eatenFoodForDay = dogEatFood + catEatFood ;
        totalFoodEaten += dogEatFood + catEatFood;
        foodDogEaten += dogEatFood;
        catFoodEaten += catEatFood;
        days ++;
        if(days % 3 == 0){
         biscuits += eatenFoodForDay * 0.10;
        }

        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f of the food has been eaten.%n", (totalFoodEaten / totalFood) * 100);
        System.out.printf("%.2f eaten from the dog.%n", (foodDogEaten / totalFoodEaten) * 100);
        System.out.printf("%.2f eaten from the cat.%n", (catFoodEaten / totalFoodEaten)* 100);




    }
}
