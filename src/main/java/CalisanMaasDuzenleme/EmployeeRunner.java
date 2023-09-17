package CalisanMaasDuzenleme;

import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {
        boolean isAgain=true;
    Employee emp1 =new Employee();
    do {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :");
        emp1.name=scan.nextLine();
        System.out.println();
        System.out.println("Lütfen Maaşınızı giriniz : ");
        emp1.salary= scan.nextDouble();
        System.out.println("Lütfen haftalık çalışma saatinizi giriniz :");
        emp1.workHours=scan.nextInt();
        System.out.println("Lütfen işe başladığınız yılı giriniz :");
        emp1.hireYear=scan.nextInt();
        System.out.println("İsim : "+ emp1.name  +"\nMaaş : "+ emp1.salary+ "\nİşe başladığı yıl : "+ emp1.hireYear+  "\nHaftalık Çalışma saati : "+ emp1.workHours);
        System.out.println("Aylık vergi kesintisi :  "+ emp1.tax());
        System.out.println("Maaş artışınız : "+ emp1.incrase());
        System.out.println("Aylık çalışma saati ekstra ücret :"+ emp1.bonus());

        System.out.println("1:Yeni İşlem \n0:Çıkış");
        String choise = scan.next();
        if (choise.equals("1")){
            isAgain=true;
        } else if (choise.equals("0")) {
            isAgain=false;
        }else System.out.println("Lütfen geçerli işlem numarası giriniz : ");
        choise= scan.next();
    }while(isAgain);

    }
}
