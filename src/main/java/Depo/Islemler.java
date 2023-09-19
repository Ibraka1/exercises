package Depo;

import java.util.Scanner;

import static Depo.UrunService.urunYazdirma;


public class Islemler {
    static UrunService obj1 =new UrunService();
    static Scanner scan =new Scanner(System.in);
    public static void start(){
        do {
            System.out.println("Depo Sistemine Hoşgeldiniz ");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
            System.out.println("1:Ürün Tanımlama \n2:Ürün Listele \n3:Ürün Girişi \n4:Ürün Rafa Yerleştir \n5:Ürün Çıkart \n0:Çıkış Yap");
            int choise =scan.nextInt();
            switch (choise) {
                case 1:
                    obj1.tanimlama();
                    break;
                case 2 :
                    urunYazdirma();
                    break;
                case 3 :
                    obj1.urunGiris();
                    break;
                case 4 :
                    obj1.urunRafaKoy();
                    break;

            }
        }while( true);

    }
}
