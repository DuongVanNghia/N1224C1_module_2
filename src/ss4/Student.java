package ss4;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter score: ");
        this.score = sc.nextDouble();
    }
    public void output(){
        super.output();
        System.out.println("score: " + this.score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
