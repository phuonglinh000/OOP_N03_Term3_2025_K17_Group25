package review;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        // So sánh theo GPA giảm dần (cao đến thấp)
        if (this.gpa < other.gpa) return 1;
        else if (this.gpa > other.gpa) return -1;
        else return this.name.compareTo(other.name); // nếu GPA bằng thì so sánh tên
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return Float.compare(this.gpa, other.gpa) == 0 &&
               Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }
}
