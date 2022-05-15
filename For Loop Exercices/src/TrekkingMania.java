import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 5) {
                musala += number;
                sum += number;
            }else if(number <= 12){
                monblan+=number;
                sum+=number;
            }
            else if (number <= 25) {
                kilimandjaro += number;
                sum += number;
            } else if (number <= 40) {
                k2 += number;
                sum += number;
            } else {
                everest += number;
                sum += number;
            }

        }
        System.out.printf("%.2f%%\n",musala * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n",monblan * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n",kilimandjaro * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n",k2 * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n",everest * 1.0 / sum * 100);

    }
}
