import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> studentNames = new ArrayList();

        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    static void displayStudents(ArrayList<Student> names){
        for (Student stud: names)
            System.out.println(stud);
    }

    static void addStudents(ArrayList<Student> names){
        names.add(new Student("Mark", "Mywords", 95));
        names.add(new Student("Andrew", "Apic", 45));
        names.add(new Student("Beth", "Tween", 78));
    }
}
