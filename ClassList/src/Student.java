import java.util.ArrayList;
import java.util.Collections;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList();

        addStudents(studentNames);

        displayStudents(studentNames);

        System.out.println();
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

     static void addStudents(ArrayList<String> names){
        names.add("Mark");
        names.add("Andrew");
        names.add("Beth");
    }

    static void displayStudents(ArrayList<String> names){
        for (String student: names)
            System.out.println("Student Name: "+ student);
    }
}
