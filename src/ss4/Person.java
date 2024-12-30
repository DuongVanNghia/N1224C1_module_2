package ss4;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    public Person(){

    }
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap name: ");
        name = sc.nextLine();
    }
    public void output(){
        System.out.println(id + " " + name);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
