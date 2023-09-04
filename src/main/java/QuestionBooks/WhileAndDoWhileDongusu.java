package QuestionBooks;

public class WhileAndDoWhileDongusu {
    public static void main(String[] args) {
        String a = "sonsuz döngü";
        String b = "Tek sefer çalışan döngü";
        int i = 10;
  //     while (i<5){
  //         System.out.println(a);
  //     } // bu döngüden kurtulmak için body içine idx increment girmek gerekir.

        do {
            System.out.println(b);
            i++;
        }while(i<5); // idx im 10 olmasına rağmen kodu bir kez çalıştırır.

    }
}
