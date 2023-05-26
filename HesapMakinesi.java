import java.util.Scanner;
/*
*Calculator codes
*/
public class HesapMakinesi {

        static void topla() {
            Scanner scanner = new Scanner(System.in);
            int sayi, sonuc = 0, i = 1;
            while (true) {
                System.out.print(i++ + ". sayı :");
                sayi = scanner.nextInt();
                if (sayi == 0) {
                    break;
                }
                sonuc += sayi;
            }
            System.out.println("İşlem Sonucu : " + sonuc);
        }

        static void cikarma() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Girilecek Sayı Adedi :");
            int sayac = scan.nextInt();
            int sayi,
            sonuc = 0;

            for (int i = 1; i <= sayac; i++) {
                System.out.print(i + ". sayı :");
                sayi = scan.nextInt();
                if (i == 1) {
                    sonuc += sayi;
                    continue;
                }
                sonuc -= sayi;
            }

            System.out.println("İşlem Sonucu : " + sonuc);
        }

        static void times() {
            Scanner scanner = new Scanner(System.in);
            int sayi, sonuc = 1, i = 1;

            while (true) {
                System.out.print(i++ + ". sayı :");
                sayi = scanner.nextInt();

                if (sayi == 1)
                    break;

                if (sayi == 0) {
                    sonuc = 0;
                    break;
                }
                sonuc *= sayi;
            }

            System.out.println("İşlem Sonucu : " + sonuc);
        }

        static void divided() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Girilecek Sayı Adadi :");
            int counter = scanner.nextInt();
            double sayi, sonuc = 0.0;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                sayi = scanner.nextDouble();
                if (i != 1 && sayi == 0) {
                    System.out.println("Böleni 0 giremezsiniz.");
                    continue;
                }
                if (i == 1) {
                    sonuc = sayi;
                    continue;
                }
                sonuc /= sayi;
            }

            System.out.println("Sonuç : " + sonuc);
        }

        static void kuvvetAlma() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Taban değeri giriniz :");
            int taban = scanner.nextInt();
            System.out.print("Üs değeri giriniz :");
            int ussu = scanner.nextInt();
            int sonuc = 1;

            for (int i = 1; i <= ussu; i++) {
                sonuc *= taban;
            }

            System.out.println("İşlem Sonucu : " + sonuc);
        }

        static void faktoriyel() {
            Scanner scaner = new Scanner(System.in);
            System.out.print("Sayı giriniz :");
            int sayi = scaner.nextInt();
            int sonuc = 1;

            for (int i = 1; i <= sayi; i++) {
                sonuc *= i;
            }

            System.out.println("İşlem Sonucu : " + sonuc);
        }


//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            int select;
//            String menu = "1- Toplama İşlemi\n"
//                    + "2- Çıkarma İşlemi\n"
//                    + "3- Çarpma İşlemi\n"
//                    + "4- Bölme işlemi\n"
//                    + "5- Üslü Sayı Hesaplama\n"
//                    + "6- Faktoriyel Hesaplama\n"
//                    + "7- Mod Alma\n"
//                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
//                    + "0- Çıkış Yap";
//
//            do {
//                System.out.println(menu);
//                System.out.print("Lütfen bir işlem seçiniz :");
//                select = scan.nextInt();
//                switch (select) {
//                    case 1:
//                        plus();
//                        break;
//                    case 2:
//                        minus();
//                        break;
//                    case 3:
//                        times();
//                        break;
//                    case 4:
//                        divided();
//                        break;
//                    case 5:
//                        power();
//                        break;
//                    case 6:
//                        factorial();
//                        break;
//                    case 0:
//                        break;
//                    default:
//                        System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
//                }
//            } while (select != 0);
//
//
//        }
}

