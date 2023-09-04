package QuestionBooks;

import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        /* km birim fiyatı :0.10$
        12 yaşından küçükse toplam fiyata %50 indirim
        12 ve 24 yaş arasındaysa %10 indirim
        65 yaşından büyükse %30indirim
        gidiş dönüş alırsa %20 indirim
        bu koşullara göre ucak bileti hesaplayan program

         */

        Scanner input = new Scanner(System.in);
        int km,yas,tip ;
        System.out.println("Lutfen yolculuk mesafesini yaziniz :");
        km=input.nextInt();
        System.out.println("Lutfen yasinizi giriniz :");
        yas= input.nextInt();
        System.out.println("Lutfen Yolculuk tipini seciniz !!(1=Tek Gidis , 2=Gidis/Donus)");
        tip =input.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;
        if (km>0 && yas>0 && (tip==1 || tip==2)){
            System.out.println("Bilgiler alındı ücret hesaplanıyor.");
            normalFiyat=km*0.1;
            if (yas<12){
                yasIndirimi=normalFiyat*0.5; // yaşa göre indirim oranı
            } else if (yas>=12&&yas<=24) {
                yasIndirimi=normalFiyat*0.1;
            } else if (yas>=65) {
                yasIndirimi=normalFiyat*0.3;
            }else {
                yasIndirimi=0;
            } normalFiyat-=yasIndirimi;
            if (tip==2){
                tipIndirimi=normalFiyat*0.2;
                normalFiyat=(normalFiyat-tipIndirimi)*2;
            }
            System.out.println("Bilet Tutarı : $"+normalFiyat);
        }else System.out.println("Girilen bilgiler eksik veya yanlış !! Lütfen kontrol ediniz. ");

    }
}
