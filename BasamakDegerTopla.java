import java.util.Scanner;

public class BasamakDegerTopla {

    public void topla(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak Değer Toplama Aracı:"  );
        System.out.println("Bir sayı giriniz:"  );
        int sayi = scanner.nextInt();

        int adet = 0;
        int toplam = 0;
        try {
            while (sayi !=0){
                toplam = (sayi%10)+toplam;
                sayi /= 10;
                ++adet;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Basamakların Toplamı: " + toplam);

    }

}
