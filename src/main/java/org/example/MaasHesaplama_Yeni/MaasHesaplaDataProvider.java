package org.example.MaasHesaplama.;
import org.example.MaasHesaplama.MaasHesaplamaTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaasHesaplaDataProvider {
    @Test(groups = "unit", dataProvider = "salary")
    public void testMaas(int workingDay, double payOfDay, double maas) {
        MaasHesapla maasHesapla = new MaasHesapla(workingDay, payOfDay);

        Assert.assertEquals(maasHesapla.maas(), maas);
    }

    @DataProvider(name = "salary")
    public Object[][] dataProvider() {
        return new Object[][]{
                {45, 250, 6000},
                {45, 250, 6000},
                {25, 200, 2000},
                {25, 200, 3500}
        };
    }
}


