package ss3_static.quess1_student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"nghia",9.4);
        student1.output();
        Student student2 = new Student(2,"van",9.4);
        student2.output();
        Student student3 = new Student(3,"duong",9.4);
        student3.output();
        System.out.println(Student.count);
    }
}
