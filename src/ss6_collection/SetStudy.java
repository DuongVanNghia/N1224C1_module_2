package ss6_collection;

import java.util.HashSet;
import java.util.Set;

public class SetStudy {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student(1,"thong",5.0));
        set.add(new Student(1,"thong",5.0));
        set.add(new Student(2,"hoai",5.2));
        set.add(new Student(2,"hoai",5.2));
        System.out.println(set.size());
    }
}
