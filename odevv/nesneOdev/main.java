package com.example.odevv.nesneOdev;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("saaa");
        Scanner scanner = new Scanner(System.in);
        int z ;

        sınıf sınıf1 = new sınıf();
        System.out.println("-----------------------------------------------------------------------");
        //1. Soru
        System.out.println("Dönüştürülecek kilometreyi giriniz ");
        double c = scanner.nextInt();
        System.out.println("Mil sonucu = " + sınıf1.kmHesap(c));
        System.out.println("-----------------------------------------------------------------------");
        //2. Soru
        System.out.println("Uzun kenarı giriniz ");
        int u = scanner.nextInt();
        System.out.println("Kısa kenarı giriniz ");
        int k = scanner.nextInt();
        System.out.println("Diktörgen alanı = " + sınıf1.alan(u,k));
        System.out.println("-----------------------------------------------------------------------");
        //3. Soru
        System.out.println("Sayı giriniz");
        int f = scanner.nextInt();
        System.out.println("Faktoriyeli = " +sınıf1.fact(f));
        System.out.println("-----------------------------------------------------------------------");
        //4. Soru
        sınıf1.harf("Metehan");
        System.out.println("-----------------------------------------------------------------------");
        //5. soru
        System.out.println("Kenar sayısını giriniz");
        z=scanner.nextInt();
        System.out.println("İç açılar toplamı = " + sınıf1.kenar(z));
        System.out.println("-----------------------------------------------------------------------");
        //6. soru
        System.out.println("Kaç gün çalıştınız");
        double y = scanner.nextDouble();
        System.out.println("Maaş = " + sınıf1.hesap(y));
        System.out.println("-----------------------------------------------------------------------");
        //7. soru
        System.out.println("Kaç saat park edildi ?");
        int n = scanner.nextInt();
        System.out.println("Park ücreti = " + sınıf1.park(n));

    }
}
