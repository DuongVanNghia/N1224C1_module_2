package ss3_static;

public class Main2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher1.schoolName="su pham";// thay doi luon static khi thay doi 1 cai
        System.out.println(teacher1.schoolName);
        System.out.println(teacher2.schoolName);
    }
}
