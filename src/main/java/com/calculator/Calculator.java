package com.calculator;

public class Calculator {

    double num1;
    double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addNumbers() {
        System.out.println(num1 + num2);
    }

    public void deductNumbers() {
        System.out.println(this.num1 - this.num2);
    }

    public static void main(String[] args) {
        Calculator number1 = new Calculator(22.0, 10.0);
        Calculator number2 = new Calculator(2.2, 53.0);

        number1.addNumbers();
        number2.addNumbers();

        number1.deductNumbers();
        number2.deductNumbers();
    }
}
