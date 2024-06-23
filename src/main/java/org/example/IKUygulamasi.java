package org.example;

import org.example.IK_uygulama.*;

import java.time.LocalDate;

public class IKUygulamasi {

    public static void main(String[] args) {
        // Personel oluşturulması
        Personel kadin1 = new Kadin("Ceren", "Kaya", LocalDate.of(1988, 5, 25));
        Personel erkek1 = new Erkek("Mete", "Han", LocalDate.of(1983, 2, 10));

        // Departman oluşturulması ve takım lideri atanması
        Departman departman = new Departman("Bilgi Teknolojileri", kadin1);

        // Personel ekleme
        departman.personelEkle(erkek1);

        // Görev ekleme
        Gorev gorev1 = new Gorev("Sunucu Güncellenmesi");
        departman.gorevEkle(gorev1);

        // Görevi tamamla
        departman.goreviTamamla(gorev1);

        // Emeklilik hesaplama
        System.out.println(kadin1.getAd() + " için emeklilik yılına kalan yıl: " + kadin1.emeklilikYasinaKalanYil());
        System.out.println(erkek1.getAd() + " için emeklilik yılına kalan yıl: " + erkek1.emeklilikYasinaKalanYil());
    }
}


