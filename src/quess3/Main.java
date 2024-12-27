package quess3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        System.out.println("toa do diem 1: ");
        point1.input();
        System.out.println("toa do diem 2: ");
        point2.input();
        double distance = point1.distance(point2);
        System.out.println("khoang cach giua 2 diem la: "+distance);
    }
}
