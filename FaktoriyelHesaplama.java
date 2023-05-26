import java.util.Scanner;

public class FaktoriyelHesaplama {
    public void hesapla(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyel Hesaplama Aracı:"  );
        System.out.println("Bir Sayı Giriniz:  ");

        int sayi = scanner.nextInt();
        int sayac = sayi;
        long faktoriyel =1;
        while (sayac >1){
            faktoriyel *=sayac;
            sayac --;
        }
//        for ile de yazılabilir
//           for(int i = 1; i <= num; ++i)
//        {
//           faktoriyel *= i;
//        }
        System.out.println("Girilen Sayının Faktöriyeli =  : "+ sayi + faktoriyel);
    }

}
