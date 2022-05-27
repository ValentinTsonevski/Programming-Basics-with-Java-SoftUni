import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parcelHeight = Double.parseDouble(scanner.nextLine()); // teglo na pratkata
        String typeService = scanner.nextLine(); //tip uspuga standard // express
        int distanceInKm = Integer.parseInt(scanner.nextLine()); //distanciq v kilometri
        double pricePerKM = 0.0;
        double totalPrice = 0.0;
        double overPriceKg = 0.0;
        double overpriceKm = 0.0;
        double totalOverPrice =0.0;




        if(typeService.equals("standard")){
            if(parcelHeight < 1){
            pricePerKM = 0.03;
            }else if (parcelHeight > 1 && parcelHeight < 10){
                pricePerKM = 0.05;
            }else if (parcelHeight >=10 && parcelHeight < 40 ){
             pricePerKM = 0.10;
            }else if (parcelHeight >=40 && parcelHeight < 90){
            pricePerKM = 0.15;
            }else if (parcelHeight >= 90 && parcelHeight < 150){
             pricePerKM = 0.20;
            }
            totalPrice = distanceInKm * pricePerKM;

            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", parcelHeight , totalPrice);


        }else if (typeService.equals("express")){
         if (parcelHeight < 1){
             pricePerKM = 0.03;
             overPriceKg =(pricePerKM * 0.80);
             overpriceKm = parcelHeight * overPriceKg;
             totalOverPrice = distanceInKm * overpriceKm;
         }else if (parcelHeight > 1 && parcelHeight < 10){
             pricePerKM = 0.05;
             overPriceKg = (pricePerKM * 0.40);
             overpriceKm = parcelHeight * overPriceKg;
             totalOverPrice = distanceInKm * overpriceKm;
         }else if (parcelHeight >= 10 && parcelHeight < 40){
             pricePerKM = 0.10;
             overPriceKg = (pricePerKM * 0.05);
             overpriceKm = parcelHeight * overPriceKg;
             totalOverPrice = distanceInKm * overpriceKm;
         }else if (parcelHeight >= 40 && parcelHeight < 90){
             pricePerKM = 0.15;
             overPriceKg =(pricePerKM * 0.02);
             overpriceKm = parcelHeight * overPriceKg;
             totalOverPrice = distanceInKm * overpriceKm;
         }else if (parcelHeight >= 90 && parcelHeight < 150){
             pricePerKM = 0.20;
          overPriceKg  = (pricePerKM * 0.01);
             overpriceKm = parcelHeight * overPriceKg;
             totalOverPrice = distanceInKm * overpriceKm;

         }
        // double totalOverPrice = distanceInKm * overPrice;
          double transportPrice = distanceInKm * pricePerKM;
         totalPrice = totalOverPrice + transportPrice ;
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", parcelHeight , totalPrice);
        }
        //double priceForTransport = distanceInKm * pricePerKM;
      //  totalPrice = parcelHeight * pricePerKM + priceForTransport;


    }
}
