package ss6_collection;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private double score;

   public Student(){

   }
   public Student(int id, String name, double score) {
       this.id = id;
       this.name = name;
       this.score = score;
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
