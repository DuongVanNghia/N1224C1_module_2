package quess4;

public class Mainques4 {
    public static void main(String[] args) {
        Fractionn a=new Fractionn();
        a.output();
        Fractionn b=new Fractionn(1,2);
        b.output();
        Fractionn c=new Fractionn(3);
        c.output();
        Fractionn d=new Fractionn(-6,-2);
        d.output();
        Fractionn e=new Fractionn(3,-1);
        e.output();
        Fractionn f=e.copy();
        f.sum(100);
        e.output();
        f.output();
    }
}
