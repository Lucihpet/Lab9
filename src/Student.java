import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student /*implements Comparable<Student>*/ /*implements Cloneable*/ implements Serializable {
    protected String name;
    protected double GPA;

    public Student (String n, double gpa) {
        this.name = n;
        this. GPA = gpa;
    }

    public Student (Student other) {
        this.name = other.name;
        this.GPA = other.GPA;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setGPA(double gpa) {
        this.GPA = gpa;
    }

    public String getName() {
        return this.name;
    }

    public double getGPA() {
        return this.GPA;
    }

    public int compareTo(Student other) {
        return (int)(this.GPA - other.GPA);
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public static void main (String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tim", 3.4));
        students.add(new Student("Allison", 3.7));
        students.add(new Student("Matt", 3.2));
        students.add(new Student("Fred", 2.7));
        students.add(new Student("Beth", 3.9));
        students.add(new Student("Heather", 4.0));
        students.add(new Student("Jake", 3.2));
        students.add(new Student("Zack", 2.9));
        students.add(new Student("Chris", 3.0));
        students.add(new Student("Melody", 3.7));
    }
}
