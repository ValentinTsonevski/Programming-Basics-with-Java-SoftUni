import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String project = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.00;
        if (project.equals("Premiere")){
        totalSum = r * c * 12.00;
            System.out.printf("%.2f", totalSum);
        }else if (project.equals("Normal")){
         totalSum = r * c * 7.50;
            System.out.printf("%.2f" , totalSum);
        }else if (project.equals("Discount")){
            totalSum = r * c * 5.00;
            System.out.printf("%.2f" , totalSum);
        }





    }
}
