package BasicCoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Coffee turkishCoffee=new Coffee("Türk Kahvesi");
        Coffee filterCoffee=new Coffee("Filtre Kahve");
        Coffee espresso=new Coffee("Espresso");

        // Kullanıcıya kahve seçimini söyleyelim
        System.out.println("Lütfen almak istediğiniz kahveyi seçiniz");
        System.out.println("1. "+turkishCoffee.getAd());
        System.out.println("2. "+filterCoffee.getAd());
        System.out.println("3. "+espresso.getAd());

        int choise = scan.nextInt();
        scan.nextLine();// dummy code

        Coffee choiseCoffe= null;

        switch (choise){
            case 1 :
                choiseCoffe=turkishCoffee;
                break;
            case 2 :
                choiseCoffe=filterCoffee;
                break;
            case 3 :
                choiseCoffe=espresso;
                break;
            default:
                System.out.println("Lütfen geçerli bir kahve seçimi giriniz !!!");
                scan.close();
        }
        // Sipariş oluşturma
        Order order = new Order(choiseCoffe);
        // süt ekleme
        System.out.println("Kahvenizde süt ister misiniz ? \n(Evet/Hayır)");
        String sutCevap = scan.nextLine();
        if (sutCevap.equalsIgnoreCase("Evet")){
            order.setAddMilk(true);
        }else order.setAddMilk(false);

        System.out.println("Kahvenizde şeker ister misiniz ? \n(Evet/Hayır)");
        String sugarCevap = scan.nextLine();
        if (sugarCevap.equalsIgnoreCase("Evet")){
            order.setSugar(true);
            System.out.println("Kaç şeker istersiniz?");
            int sekersayisi = scan.nextInt();
            order.setHowmychsugar(sekersayisi);
        }

        // Kahve boyutu
        System.out.println("Kahvenizi hangi boyutta istersiniz ? \n Büyük-Orta-Küçük");
        String dimensionAnswer = scan.nextLine();
        order.setDimesion(dimensionAnswer);
    }
}
