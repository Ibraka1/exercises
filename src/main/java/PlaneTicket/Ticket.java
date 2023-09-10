package PlaneTicket;
     /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */

import java.util.Scanner;

public class Ticket {
         public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             System.out.println("QA 03 Havayollarına Hoşgeldiniz...\nLütfen gitmek istediğiniz şehri seçiniz :");
             System.out.println("1: A->B \n2: A->C \n3: A->D");
             int select =scan.nextInt();
             System.out.println("Lütfen bilet tipini seçiniz \n1 : Tek Yön \n2 : Gidiş-Dönüş ");
             int tripType= scan.nextInt();
             System.out.println("Lütfen yaşınızı giriniz : ");
             int age =scan.nextInt();
             double total=0;
             switch (select){
                 case 1 :
                     if (tripType==2){
                         total=total+((aB()*2)*0.8);
                     }else {
                         total+=aB();
                     }
                     break;
                 case 2 :
                     if (tripType==2){
                         total=total+((aC()*2)*0.8);
                     }else {
                         total+=aB();
                     }
                     break;
                 case 3 :
                     if (tripType==2){
                         total=total+((aD()*2)*0.8);
                     }else {
                         total+=aB();
                     }
                     break;
                 default:
                     System.out.println("Hatalı giriş yaptınız.");
             }
             if (age<12){
                 System.out.println("Yaş indirimi %50 \nÖdemeniz gereken tutar : "+(total*0.5));
             }else if (age>13 && age<25)
                 System.out.println( "Yaş indirimi %10 \nÖdemeniz gereken tutar : "+(total*0.9));
             else if (age>65){
                 System.out.println("Yaş indirimi %30 \nÖdemeniz gereken tutar : "+(total*0.7));
             }



         }

         public static double aB (){
             int mesafe =500;
             return mesafe*(0.1);


         }
  public static double aC (){
             int mesafe =700;
             return mesafe*(0.1);

         }
  public static double aD (){
             int mesafe =900;
             return mesafe*(0.1);

         }
}
