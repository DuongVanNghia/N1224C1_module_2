package quess4;

public class Fractionn {
    private int numerator;
    private int denominator;
    public Fractionn() {
        numerator = 0;
        denominator = 1;
    }
    public Fractionn(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }
    public Fractionn(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        abbreviated();
    }
    public void abbreviated() {
        int greatestCommon = greatestCommonWish(numerator, denominator);
        numerator /= greatestCommon;
        denominator /= greatestCommon;

    }

    private int greatestCommonWish(int a, int b) {
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
    public Fractionn copy(){
        return new Fractionn(numerator, denominator);
    }
    public  void sum(int value) {
        numerator *= value*denominator;
        abbreviated();
    }
    public void output(){
        if(denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+ "/"+ denominator);
        }

    }


}
