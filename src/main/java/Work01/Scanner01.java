package Work01;

public class Scanner01 {
    public static void main(String[] args) {
        //1.soru
         /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        int yapılacakIs = 10;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Lutfen isci sayisini giriniz...");
        int isci = input.nextInt();
        double gün = yapılacakIs/isci;
        System.out.println("İşin bitme süresi " + gün +" gündür.");

       //  2.soru
        /* TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Lutfen üyelik icin isim ve soyisim giriniz...");
        String fullName = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int age =scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz...");
        double weight =scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz...");
        double height =scan.nextDouble();

        System.out.println("Lutfen salona kaç ay devam edeceginizi giriniz...");
        int month =scan.nextInt();

        int totalPrice = 20*month;

        System.out.println("Spor salonu ödemeniz : $"+totalPrice);


        //3.soru
         /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        java.util.Scanner scan01 = new java.util.Scanner(System.in);
        System.out.println("Lutfen a,b,c degerlerini giriniz.");
        int a = scan01.nextInt();
        int b = scan01.nextInt();
        int c = scan01.nextInt();
        double result = (a^2-b^2/3*c);
        System.out.println(result);

        // 4.soru

          /*
         Kullanicidan kilosunu ve boyunu alip
         Vucut kitle indeksini hesaplayan bir program yaziniz.
         Ipucu : Vucut
         Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
         ORNEK:
         INPUT      : Kilo: 71
                           Boy: 1,72
         OUTPUT  : Vucut Kitle Indeksiniz : 23
             */

        java.util.Scanner scan02 = new java.util.Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz...");
        double weight1 =scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz...");
        double height1 =scan.nextDouble();

        double VKI = (weight1 / Math.pow(height1,2));
        System.out.println("VKI = " + VKI);


    }
}
