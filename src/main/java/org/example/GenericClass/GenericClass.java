package org.example.GenericClass;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>("Hello, World!");
        stringInstance.printValue();

        GenericClass<Integer> integerInstance = new GenericClass<>(123);
        integerInstance.printValue();

        GenericClass<Double> doubleInstance = new GenericClass<>(45.67);
        doubleInstance.printValue();

        GenericClass<Boolean> booleanInstance = new GenericClass<>(true);
        booleanInstance.printValue();
    }
}

