import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double prize = 0.0;


        switch (gender){
            case "m":

                switch (sport){
                    case "Gym":
                prize = 42;
                break;
                    case "Boxing":
                        prize = 41;
                        break;
                    case  "Yoga":
                        prize = 45;
                        break;
                    case "Zumba":
                        prize = 34;
                        break;
                    case "Dances":
                        prize = 51;
                        break;
                    case "Pilates":
                        prize = 39;
                      //  break;
                }break;
            case "f":
                switch (sport){
                    case "Gym":
                        prize = 35;
                        break;
                    case "Boxing":
                        prize = 37;
                        break;
                    case  "Yoga":
                        prize = 42;
                        break;
                    case "Zumba":
                        prize = 31;
                        break;
                    case "Dances":
                        prize = 53;
                        break;
                    case "Pilates":
                        prize = 37;
                        break;
                }
                break;
        }
        if(ages <= 19){
        prize = prize - prize * 0.20;
        }
        if(budget >= prize){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.", prize - budget);
        }



    }
}
