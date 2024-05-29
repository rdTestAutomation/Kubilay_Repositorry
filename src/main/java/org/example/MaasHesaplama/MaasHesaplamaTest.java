package org.example.MaasHesaplama;

import java.util.Scanner;

public class MaasHesaplamaTest {

    // Fazla çalışılan her gün için verilen prim
    private static final double FAZLA_GUN_PRIMI =1000;

    // Çalışma gün eşiği
    private static final int FAZLA_MESAI_ESIGI = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan çalışılan gün sayısını girmesi istebilir
        System.out.print("Lütfen çalışılan gün sayısını giriniz: " );
        int calisilanGun = scanner.nextInt();

        System.out.print("Çalışanın günlük maaşını giriniz: "  );
        int GUNLUK_MAAS = scanner.nextShort();

        // Toplam maaşı hesapla
        double toplamMaas = calisilanGun * GUNLUK_MAAS;
        int fazlaGun = calisilanGun - FAZLA_MESAI_ESIGI;
        double prim = fazlaGun * FAZLA_GUN_PRIMI;

        // Eğer çalışılan gün sayısı 25'ten fazla ise, ekstra prim ekle,değilse primsiz toplam maaşını yazdır.
        System.out.println( calisilanGun > FAZLA_MESAI_ESIGI ? toplamMaas += prim : toplamMaas);

        // Toplam maaşı ekrana yazdır
        System.out.println("Toplam maaş: " + toplamMaas + " TL");

        scanner.close();
    }
}
