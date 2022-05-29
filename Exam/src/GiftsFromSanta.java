import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int adress = m; adress >= n ; adress--) {
            if(adress % 2 == 0 && adress % 3 == 0){
                if(s == adress){
                    break;
                }

                System.out.print(adress + " ");

            }

        }




    }
}
