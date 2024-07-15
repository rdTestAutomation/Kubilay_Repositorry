package org.example.Singleton;

public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public static class ProductBuilder {
        private String name;
        private double price;
        private int quantity;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}

