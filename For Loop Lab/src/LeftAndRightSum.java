import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftNumber = 0;
        int rightNumber= 0;
      int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
           leftNumber = leftNumber + number ;
        }

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightNumber = rightNumber + number;
        }
                   if(leftNumber == rightNumber){
                       System.out.println("Yes, sum = " + leftNumber);
}else{
                       int diff = Math.abs(leftNumber - rightNumber);
                       System.out.println("No, diff = " + diff);
                   }




    }
}
