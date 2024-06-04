package org.example.Kelimedizisiolusturma;

import java.util.*;

public class Kelimedizisiolusturma {

    // Harflerin tekrar edip etmediğini kontrol eden fonksiyon
    public static boolean tekrarEdenHarfVarMi(String kelime) {
        Set<Character> karakterSeti = new HashSet<>();
        for (char c : kelime.toCharArray()) {
            if (karakterSeti.contains(c)) {
                return true;
            }
            karakterSeti.add(c);
        }
        return false;
    }

    // Kelime dizisini işleyip tekrar eden harf içeren iki kelime bulup yeni bir metin oluşturan fonksiyon
    public static String tekrarEdenHarfIcerenKelimeBulVeBirlesikMetinOlustur(String[] kelimeDizisi) {
        String ilkKelime = null;
        String ikinciKelime = null;

        for (String kelime : kelimeDizisi) {
            if (tekrarEdenHarfVarMi(kelime)) {
                if (ilkKelime == null) {
                    ilkKelime = kelime;
                } else {
                    ikinciKelime = kelime;
                    break;
                }
            }
        }

        if (ilkKelime != null && ikinciKelime != null) {
            return ilkKelime + ikinciKelime;
        } else {
            return "Uygun kelime bulunamadı.";
        }
    }

    public static void main(String[] args) {
        String[] kelimeDizisi = {"kütüphane", "kitap", "kalem", "sözcük","çanta","ev","zil"};

        String sonuc = tekrarEdenHarfIcerenKelimeBulVeBirlesikMetinOlustur(kelimeDizisi);

        System.out.println("Oluşturulan metin: " + sonuc);
    }
}  // Bu satırın sonundaki kapanış parantezinin eksik olup olmadığını kontrol edin


