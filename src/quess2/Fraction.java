package quess2;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        numerator = sc.nextInt();
        do {
            System.out.println("Enter denominator: ");
            denominator = sc.nextInt();
        } while (denominator == 0);
    }

    public void abbreviated() {
        int greatestCommon = greatestCommonWish(numerator, denominator);
        numerator /= greatestCommon;
        denominator /= greatestCommon;

    }

    public int greatestCommonWish(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void output() {
        abbreviated();
        if (denominator == 0) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }

    }

    public Fraction sum(Fraction f) {
        Fraction sum = new Fraction();
        sum.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        sum.denominator = this.denominator * f.denominator;
        return sum;
    }

    public Fraction subtraction(Fraction f) {
        Fraction subtraction = new Fraction();
        subtraction.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
        subtraction.denominator = this.denominator * f.denominator;
        return subtraction;
    }

    public Fraction multiplication(Fraction f) {
        Fraction multiplication = new Fraction();
        multiplication.numerator = this.numerator * f.denominator * f.numerator;
        multiplication.denominator = this.denominator * f.denominator;
        return multiplication;
    }

    public Fraction division(Fraction f) {
        Fraction division = new Fraction();
        division.numerator = this.numerator / f.numerator;
        division.denominator = this.denominator / f.denominator;
        return division;
    }

    boolean negativeFraction() {
        return numerator * denominator < 0;
    }

    boolean fractionState0() {
        return numerator * denominator == 0;
    }

}
