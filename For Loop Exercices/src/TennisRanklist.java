import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int starter = points;
        int wins = 0;
        for (int i = 0 ; i < n ; i ++){
            String place = scanner.nextLine();
            switch (place){
                case "W":
                    points += 2000;
                    wins++;
                    break;
                case"F":
                    points+= 1200;
                    break;
                case"SF":
                    points+= 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n",points);
        System.out.printf("Average points: %d%n",(points-starter)/n);
        System.out.printf("%.2f%%\n",wins * 1.0 / n * 100);
    }//System.out.printf("%.2f%%\n",p1 * 1.0 / n * 100);










    }

