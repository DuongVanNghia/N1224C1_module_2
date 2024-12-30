package quess6;

public class Student {
    private int id;
    private String name;
    private double score;

    Student() {

    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name.trim().equals("")) {
            System.out.println("ban phai nhap ten");
        } else {
            this.name = name;
        }
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("loi khong dung ");
        }
    }

    public double getScore() {

        return score;
    }

}
