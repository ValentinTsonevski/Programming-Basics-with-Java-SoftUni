import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int n = Integer.parseInt(scanner.nextLine());
       // for (int i = 1; i <= number ; i = i * 2 + 1) {
        //    System.out.println(i);
       // }

     while (number <= n){

         System.out.println(number);
         number = number * 2 + 1;
     }




    }
}
