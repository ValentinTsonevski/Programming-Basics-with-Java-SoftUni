import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = 10000;
        int currentSteps = 0;

        while (target > currentSteps){
            String goingHome = scanner.nextLine();
            if(goingHome.equals("Going home")){
            currentSteps += Integer.parseInt(scanner.nextLine());
            break;
            }
           currentSteps += Integer.parseInt(goingHome);
        }
       if(currentSteps >= target){
           System.out.printf("Goal reached! Good job!\n" +
                   "%d steps over the goal!", currentSteps - target);
       }else {
           System.out.printf("%d more steps to reach goal.", target - currentSteps);
       }




    }
}
