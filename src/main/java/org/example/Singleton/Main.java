package org.example.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();


        Product product = new Product.ProductBuilder()
                .setName("Phone")
                .setPrice(45000.00)
                .setQuantity(1)
                .build();


        System.out.println(product);
    }
}
