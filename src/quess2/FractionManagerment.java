package quess2;

public class FractionManagerment {
    public static void main(String[] args) {
        Fraction fraction1 =new Fraction();
        fraction1.input();
        fraction1.output();

        Fraction fraction2 = new Fraction();
        fraction2.input();
        fraction2.output();

        Fraction sum = fraction1.sum(fraction2);
        System.out.println("tong cua 2 phan so la: ");
        sum.output();

        Fraction subtraction= fraction1.subtraction(fraction2);
        System.out.println("hieu cua 2 phan so la: ");
        subtraction.output();

        Fraction multiplication= fraction1.multiplication(fraction2);
        System.out.println("tich cua 2 phan so la: ");
        multiplication.output();

        Fraction division= fraction1.division(fraction2);
        System.out.println("thuong cua 2 phan so la: ");
        division.output();

        System.out.println("phan so do la phan so: "+ (fraction1.negativeFraction()?"am":"duong"));
        System.out.println("phan so do la phan so: "+(fraction1.fractionState0()?"bang 0":"khac 0"));



    }
}
