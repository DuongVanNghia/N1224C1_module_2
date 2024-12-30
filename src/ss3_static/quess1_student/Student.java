package ss3_static.quess1_student;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double score;
    static int count = 0;
    public Student(){
        count++;

    }
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        count++;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id: ");
        id = sc.nextInt();
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student score: ");
        score = sc.nextDouble();

    }
    public void output(){
        System.out.println(id + " " + name + " " + score);
    }
    public void getid(){
        System.out.println(id);
    }
    public void setid(int id){
        this.id = id;
    }
    public void getname(){
        System.out.println(name);
    }
    public void setname(String name){
        this.name = name;
    }
    public void getscore(){
        System.out.println(score);
    }
    public void setscore(double score){
        this.score = score;
    }


}
