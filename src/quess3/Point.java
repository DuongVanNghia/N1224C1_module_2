package quess3;

import java.util.Scanner;

public class Point {
    double x;
    double y;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = sc.nextDouble();
        System.out.println("Enter Y: ");
        y = sc.nextDouble();
    }
    double distance(Point p){
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }
}
