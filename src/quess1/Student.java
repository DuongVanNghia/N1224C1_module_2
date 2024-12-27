package quess1;

import java.util.Scanner;

public class Student {
    String name;
    double scoreMath;
    double scoreliteratureScore;
    Student(){

    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter score Math: ");
        scoreMath = sc.nextDouble();
        System.out.print("Enter scoreliterature score: ");
        scoreliteratureScore = sc.nextDouble();
    }
    double averageScore(){
        return (scoreMath+scoreliteratureScore)/2;
    }
    void output(){
        System.out.println("Name: " + name);
        System.out.println("Math: " + scoreMath);
        System.out.println("Scoreliterature Score: " + scoreliteratureScore);
        System.out.println("Average: " + averageScore());
    }
}
