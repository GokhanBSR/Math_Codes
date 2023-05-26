import java.util.Scanner;

public class TekCiftSayi {
    void bul(){
        System.out.println("Tek Hane mi Çift Hane mi !");
        System.out.println("Bir Sayı Girin Bakalım");
        Scanner scanner =new Scanner(System.in);
        long sayi=scanner.nextInt();
        if  (sayi%2==0){
        System.out.println("Girilen Sayı Çift Sayıdır");
    }else {
            System.out.println("Girilen Sayı Tek Sayıdır");
}
}
}
