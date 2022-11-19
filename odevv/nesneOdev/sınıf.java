package com.example.odevv.nesneOdev;

import java.util.Scanner;

public class sınıf {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        int sayac = 0;
        public double kmHesap(double n) {
            double sonuc = n*0.621;
            return sonuc;
        }

        public double alan(double n, double y) {
            double sonuc = n*y;
            return sonuc;
        }

        public double fact(double n) {
            for (int i =1; i<=n; i++) {
                fact = fact * i;
            }
            double sonuc = fact;
            return sonuc;
        }

        public void harf(String n) {
            for(int i =0; i < n.length(); i++) {
                if(n.charAt(i) == 'e') {
                    sayac++;
                }

            }
            System.out.println("Bulunan e harfi ="  + sayac);
        }
        public double kenar(double n) {
            double sonuc = (((n-2)*180)/2);
            return sonuc;
        }
        public double hesap (double n) {
            double saat = n*8;
            double hamMaas =0;
            double mesaimaas = 0;
            double sonuc1 = 0;
            if(150 >saat) {
                hamMaas = saat*40;
            }

            else if (saat>150) {
                double mesai = saat-150;
                double hamsaat = saat-mesai;
                double sonuc = hamsaat *40;
                mesaimaas = mesai*80;
                sonuc1 = mesaimaas + sonuc;
            }
            double sonuc = sonuc1+hamMaas;
            return sonuc;
        }

        public int park(int n) {
            int fiyat=0;
            if (n==1) {
                fiyat = 50;
            }
            else if (n>1){
                fiyat = 50+(n-1)*10;
            }
            else {
                System.out.println("Hatalı tuşlama yaptınız");
            }
            return fiyat;
        }
}
