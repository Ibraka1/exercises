package Depo;

import java.util.*;

public class UrunService{
    Urun obj1;
    static Scanner inp = new Scanner(System.in);
    public static  Map<Integer, Urun> mapUrun = new HashMap<>();

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
        mapUrun.put(obj1.urunId, obj1);
    }

    public void urunGiris(){
        System.out.println("--------- ÜRÜN GİRİŞ SAYFASI ---------");
        System.out.println("Lütfen giriş yapmak istediğiniz ürünün id numarasını giriniz :");
        System.out.println("İşlem seçiniz : \n1:Ürünü Ekleme \n0:Çıkış");
        String secim2 = inp.next();
        System.out.println("Lütfen ürün ID giriniz :");
        int id = inp.nextInt();
        boolean idCheck= mapUrun.containsKey(id);
        if (idCheck){
            System.out.println("Lütfen ürün miktarı giriniz  : ");
            int miktar =inp.nextInt();
            int sumMiktar =mapUrun.get(id).getUrunMiktar();
            mapUrun.get(id).setUrunMiktar(miktar+sumMiktar);
        }else System.out.println("Girilen ID de ürün bulunmamaktadır !! ");
        }

    public static void urunYazdirma (){

        System.out.println("             ***** QA-03 DEPO ÜRÜNLERİ *****         ");
        System.out.printf("%-3s      %-10s      %-10s      %-3s     %-6s    %-3s \n", "Id", "Ürün Adı ", "Üretici Adı", "Ürün Birimi", "Ürün Miktarı", "Ürün Raf");
        System.out.println("--------------------------------------------------------------------------------------");
        Collection<Urun> values = mapUrun.values();
        List<Urun> listele = new ArrayList<>();
        listele.addAll(values);
        for (Urun w : listele) {
            System.out.printf("%-3s      %-10s      %-11s      %-10s       %-12s     %-3s \n", w.getUrunId(), w.getUrunIsmi(), w.getUretici(), w.getUrunBirimi(), w.getUrunMiktar(), w.getRaf());
            System.out.println();
        }
    }

    public void urunRafaKoy() {

        System.out.println("--------- ÜRÜN RAF SAYFASI ---------");
        System.out.println("Lütfen rafa yerleştirmek istediğiniz ürünün id numarasını giriniz :");
        System.out.println("İşlem seçiniz : \n1:Ürün Rafa yerleştir \n2:Ürün Raftan çıkar  \n0:Çıkış");
        String secim1 = inp.next();
        switch (secim1) {
            case "1":
                System.out.println("Lütfen ürün ID giriniz :");
                int id = inp.nextInt();
                boolean idCheck = mapUrun.containsKey(id);
                if (idCheck) {
                    System.out.println("Lütfen Ürün Rafını giriniz  : \n(!Raf bilgisini boşluk olmadan giriniz!)");
                    String raf = inp.next();
                    mapUrun.get(id).setRaf(raf);
                } else System.out.println("Girilen ID de ürün bulunmamaktadır !! ");
                break;
            case "2":
                System.out.println("Lütfen ürün ID giriniz :");
                int id1 = inp.nextInt();
                boolean idCheck1 = mapUrun.containsKey(id1);
                if (idCheck1) {
                   mapUrun.get(id1).setRaf("Yerleştirilmedi");
                } else System.out.println("Girilen ID de ürün bulunmamaktadır !! ");
        }
    }
}