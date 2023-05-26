import java.util.Scanner;

public class BedenKitleEndeksi {

        void bedenKitleEndeksi(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen Boyunuzu Giriniz (cm) cinsinden :  ");
            int boy = scanner.nextInt();
            System.out.println("Lütfen Kilonuzu Giriniz (kg) cinsinden :  ");
            double kilo = scanner.nextInt();

            if (boy > 100 && boy < 250 && kilo >40 && kilo<150) {
                bedenKitleEndeksiHesapla(boy, kilo);
            } else {
                System.out.println(" Girdiğiniz ölçüler standartlara uygun değil");
            }
        }
    public void bedenKitleEndeksiHesapla(int boy,double kilo){
        double boyMetre = boy/100;
        double bki = kilo / (boyMetre * boyMetre );
        String msg ;
        msg = "senin bki= "+ bki ;
        if(bki <18.5){
            System.out.println(msg  +" Zayıf");
        }else if ( 18.5<= bki && bki <=24.9){
            System.out.println(msg +" Normal");
        }else if (25<= bki && bki <=29.9){
            System.out.println(msg +" Hafif Şişman");
        }else if (30<= bki && bki <=40){
            System.out.println(msg +" Şişman");
        } else if (41<= bki && bki <=49) {
            System.out.println(" Aşırı Şişman");
        } else {
            System.out.println(msg + " Doktorunuza Başvurunuz");
            }
        }
}

