import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String catType = scanner.nextLine();
        String catGender = scanner.nextLine();
        int years = 0;
        double humanMonths = 0;
        double catMonths = 0;
        // 6 choveshki meseca sa = na 1 koteshki mesec

        if(catType.equals("British Shorthair")){
        if(catGender.equals("m")){
          years = 14;
          humanMonths = years * 12;
          catMonths = humanMonths / 6;
            System.out.printf("%.0f cat months", Math.floor(catMonths));
        }
        else if (catGender.equals("f")){
            years = 13;
            humanMonths = years * 12;
            catMonths = humanMonths /6;
            System.out.printf("%.0f cat months",Math.floor(catMonths));
        }
        }else if (catType.equals("Siamese")){
          if(catGender.equals("m")){
              years = 15;
              humanMonths = years * 12;
              catMonths = humanMonths /6;
              System.out.printf("%.0f cat months",Math.floor(catMonths));
          }
          else if (catGender.equals("f")){
              years = 16;
              humanMonths = years * 12;
              catMonths = humanMonths / 6;
              System.out.printf("%.0f cat months", Math.floor(catMonths));
          }
        }else if (catType.equals("Persian")){
            if(catGender.equals("m")){
                years = 14;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months",Math.floor(catMonths));
            }else if (catGender.equals("f")){
                years = 15;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months",Math.floor(catMonths));
            }
        }else if (catType.equals("Ragdoll")){
            if(catGender.equals("m")){
                years = 16;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months",Math.floor(catMonths));
            }else if (catGender.equals("f")){
                years = 17;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months",Math.floor(catMonths));
            }
        }else if (catType.equals("American Shorthair")){
            if(catGender.equals("m")){
                years = 12;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months", Math.floor(catMonths));
            }else if (catGender.equals("f")){
                years = 13;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months", Math.floor(catMonths));
            }
        }else if (catType.equals("Siberian")){
            if(catGender.equals("m")){
                years = 11;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months", Math.floor(catMonths));
            }else if (catGender.equals("f")){
                years = 12;
                humanMonths = years * 12;
                catMonths = humanMonths / 6;
                System.out.printf("%.0f cat months", Math.floor(catMonths));
            }
        }

       else {
            System.out.printf("%s is invalid cat!", catType);
        }




    }
}
