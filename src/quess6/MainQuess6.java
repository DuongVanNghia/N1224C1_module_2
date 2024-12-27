package quess6;

public class MainQuess6 {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("id = " + student1.getId());
        System.out.println("name = " + student1.getName());
        System.out.println("score = " + student1.getScore());

        student1.setName("duong van nghia");
        student1.setScore(9.2);

        System.out.println("id = " + student1.getId());
        System.out.println("name = " + student1.getName());
        System.out.println("score = " + student1.getScore());

        student1.setName(" ");
        student1.setScore(11);

    }
}
