package Depo;

import java.util.*;

public class UrunService<InvalidAmountException> {
    Urun obj1;
    static Scanner inp = new Scanner(System.in);
    public static Map<Integer, Urun> urun = new HashMap<>();

    public UrunService() {
        obj1 = new Urun();
    }


    public void tanimlama() {

        System.out.println("Ürünün ismini giriniz :");
        String name = inp.nextLine();
        System.out.println("Ürün üreticisi giriniz :");
        String uretici = inp.nextLine();
        System.out.println("Ürünün birimini giriniz : \n(Kg,Lt,mL)");
        String birim = inp.nextLine();
        int defaultMiktar=0;
        String defaultRaf="Yerleştirilmedi";
        Urun obj1 = new Urun(name, uretici, birim,defaultMiktar,defaultRaf);
        urun.put(obj1.urunId, obj1);
    }


    public static void urunYazdirma() {

        System.out.println("             ***** QA-03 DEPO ÜRÜNLERİ *****         ");
        System.out.printf("%-3s      %-10s      %-10s      %-3s     %-6s    %-3s \n", "Id", "Ürün Adı ", "Üretici Adı", "Ürün Birimi", "Ürün Miktarı", "Ürün Raf");
        System.out.println("--------------------------------------------------------------------------------------");
        Collection<Urun> values = urun.values();
        List<Urun> listele = new ArrayList<>();
        listele.addAll(values);
        for (Urun w : listele) {
            System.out.printf("%-3s      %-10s      %-11s      %-10s       %-12s     %-3s \n", w.getUrunId(), w.getUrunIsmi(), w.getUretici(), w.getUrunBirimi(), w.getUrunMiktar(), w.getRaf());
            System.out.println();
        }
    }

    public void urunGiris() {
        System.out.println("--------- ÜRÜN GİRİŞ SAYFASI ---------");
        System.out.println("Lütfen giriş yapmak istediğiniz ürünün id numarasını giriniz :");
        System.out.println("İşlem seçiniz : \n1:Ürün rafa yerleştir \n2:Ürünü miktarı düzenle \n0:Çıkış");
        String secim = inp.next();
        int sum=0;

        switch (secim) {
            case "1":
                System.out.println("Lütfen ürün ID giriniz :");
                int id = inp.nextInt();
                if (urun.containsKey(id)){
                    System.out.println("Lütfen raf kodu giriniz :");
                    String raf=inp.next();
                }else System.out.println("Girilen ID de ürün bulunmamaktadır !! ");



                break;


        }
    }


}