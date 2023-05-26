import java.util.Random;
import java.util.Scanner;

public class NotOrtalamaHesap {

    void notlar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("quiz notunu giriniz:");
        int quiz = scanner.nextInt();
        if (quiz > 100 && quiz < 1) {
            System.out.println("100 lük sistemde not giriniz");
        }

        System.out.println("vize notunu giriniz:");
        int vize = scanner.nextInt();
        if (vize > 100 && vize < 1) {
            System.out.println("100 lük sistemde not giriniz");
        }

        System.out.println("final notunu giriniz:");
        int finalNot = scanner.nextInt();

        if (finalNot > 100 && finalNot < 1) {
            System.out.println("100 lük sistemde not giriniz");
        }
        if (finalNot < 50) {
            System.out.println("Tebrikler final başarınızla kaldınız");
        } else {
            hesapla(quiz, vize, finalNot);
        }

    }

    void hesapla(int quizNotu, int vizeNotu, int finalNotu) {

        Random random = new Random();
        double kanaat = random.nextDouble(1, 5);
        double ortalama = (quizNotu * 0.2) + (vizeNotu * 0.35) + (finalNotu * 0.45) + kanaat;

        if (ortalama <= 100 && ortalama >= 80) {
            System.out.println("Sınıfı Başarıyla Geçtiniz. Ortalamanız :" + ortalama);
            System.out.println("Maximum aldıgınız not:" + Math.max(Math.max(quizNotu, vizeNotu), finalNotu));
        } else if (ortalama < 80 && ortalama >= 50) {
            System.out.println("Sınıfı Koşullu Geçtiniz. Ortalamanız :" + ortalama);
            System.out.println("Maximum aldıgınız not:" + Math.max(Math.max(quizNotu, vizeNotu), finalNotu));
        } else {
            System.out.println("Sınıfı Başarıyla geçemedin. Ortalamanız :" + ortalama);
            System.out.println("Minimum aldıgınız not:" + Math.min(Math.max(quizNotu, vizeNotu), finalNotu));
        }
    }
}