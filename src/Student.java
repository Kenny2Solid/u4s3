import java.util.Objects;


public record  Student(String name, double gpa) implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        if (other == null) {
            throw new NullPointerException("Cannot compare to null");
        }
        // Compare by GPA in descending order
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}