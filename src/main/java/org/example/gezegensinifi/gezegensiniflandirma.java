package org.example.gezegensinifi;


public class gezegensiniflandirma {


    public enum Gezegen {
        MERKUR(1, 57.91, 2439.7, 58.646),
        VENUS(2, 108.2, 6051.8, -243.025),
        DUNYA(3, 149.6, 6371.0, 0.997),
        MARS(4, 227.9, 3389.5, 1.026),
        JUPITER(5, 778.5, 69911.0, 0.4135),
        SATURN(6, 1434, 58232.0, 0.444),
        URANUS(7, 2871, 25362.0, -0.718),
        NEPTUN(8, 4495, 24622.0, 0.671);

        private final int sira;
        private final double uzaklik;
        private final double yaricap;
        private final double donmeSuresi;

        Gezegen(int sira, double uzaklik, double yaricap, double donmeSuresi) {
            this.sira = sira;
            this.uzaklik = uzaklik;
            this.yaricap = yaricap;
            this.donmeSuresi = donmeSuresi;
        }

        public int getSira() {
            return sira;
        }

        public double getUzaklik() {
            return uzaklik;
        }

        public double getYaricap() {
            return yaricap;
        }

        public double getDonmeSuresi() {
            return donmeSuresi;
        }
    }

}
