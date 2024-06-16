package org.example;

import org.example.gezegensinifi.gezegensiniflandirma;

public class Main {


    public static class GezegenBilgileri {
        public static void main(String[] args) {
            for (gezegensiniflandirma.Gezegen gezegen : gezegensiniflandirma.Gezegen.values()) {
                System.out.println("Gezegen: " + gezegen.name());
                System.out.println("Sira: " + gezegen.getSira());
                System.out.println("Uzaklik (Milyon km): " + gezegen.getUzaklik());
                System.out.println("Yaricap (km): " + gezegen.getYaricap());
                System.out.println("Donme Suresi (Gun): " + gezegen.getDonmeSuresi());
                System.out.println();
            }
        }
    }
}
