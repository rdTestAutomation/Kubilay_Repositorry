package org.example.IK_uygulama;

import java.time.LocalDate;
import java.time.Period;

public class Erkek extends Personel {
    public Erkek(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasinaKalanYil() {
        int emeklilikYasi = 65;
        LocalDate simdikiTarih = LocalDate.now();
        int yas = Period.between(getDogumTarihi(), simdikiTarih).getYears();
        return emeklilikYasi - yas;
    }
}
