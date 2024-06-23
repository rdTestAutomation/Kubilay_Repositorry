package org.example.IK_uygulama;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private Personel takimLideri;
    private List<Personel> personeller;
    private List<Gorev> gorevler;

    public Departman(String ad, Personel takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personeller = new ArrayList<>();
        this.gorevler = new ArrayList<>();
        this.personelEkle(takimLideri);  // Takım liderini de personel listesine ekliyoruz
    }

    public void takimLideriDegistir(Personel yeniTakimLideri) {
        this.takimLideri = yeniTakimLideri;
    }

    public void personelEkle(Personel personel) {
        this.personeller.add(personel);
    }

    public void personelCikar(Personel personel) {
        this.personeller.remove(personel);
    }

    public void personelDegistir(Personel eskiPersonel, Personel yeniPersonel) {
        int index = this.personeller.indexOf(eskiPersonel);
        if (index != -1) {
            this.personeller.set(index, yeniPersonel);
        }
    }

    public void gorevEkle(Gorev gorev) {
        this.gorevler.add(gorev);
    }

    public void goreviTamamla(Gorev gorev) {
        int index = this.gorevler.indexOf(gorev);
        if (index != -1) {
            this.gorevler.get(index).setTamamlandi(true);
        }
    }

    // Getter and Setter methods
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Personel getTakimLideri() {
        return takimLideri;
    }

    public List<Personel> getPersoneller() {
        return personeller;
    }

    public List<Gorev> getGorevler() {
        return gorevler;
    }
}

