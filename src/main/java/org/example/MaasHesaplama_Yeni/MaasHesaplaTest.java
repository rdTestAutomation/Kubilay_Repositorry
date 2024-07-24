package org.example.MaasHesaplama_Yeni;

import org.example.MaasHesaplama.MaasHesaplamaTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MaasHesaplaTest {
    MaasHesapla maasHesapla = new MaasHesapla();
    MaasHesapla maasHesapla2 = new MaasHesapla();

    @BeforeMethod
    public void beforeMethod() {
        maasHesapla.setWorkingDay(45);
        maasHesapla.setPayOfDay(250);

        maasHesapla2.setWorkingDay(25);
        maasHesapla2.setPayOfDay(200);

    }

    @Test(groups = "unit")
    public void testMaasHesapla() {
        Assert.assertEquals(maasHesapla.maas(), 6000);

    }
    @Test(groups = "unit")
    public void testMaasHesapla2(){
        Assert.assertEquals(maasHesapla.maas(), 4000);
    }
    @Test(groups = "unit")
    public void testMaasHesapla3(){
        Assert.assertEquals(maasHesapla2.maas(), 2000);
    }
    @Test(groups = "unit")
    public void testMaasHesapla4(){
        Assert.assertEquals(maasHesapla.maas(), 3500);
    }
}