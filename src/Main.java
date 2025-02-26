import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.8));
        students.add(new Student("Charlie", 3.2));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}