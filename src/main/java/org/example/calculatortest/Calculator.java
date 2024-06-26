package org.example.calculatortest;


public class Calculator {
        public double divide(double numerator, double denominator) throws DivideByZeroException {
            if (denominator == 0) {
                throw new DivideByZeroException("Sıfıra bölme işlemi hatası");
            }
            return numerator / denominator;
        }
}

