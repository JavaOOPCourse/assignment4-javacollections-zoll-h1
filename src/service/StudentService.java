package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(01, "Nurbek", 4.5));
        students.add(new Student(02, "Bro", 3.0));
        students.add(new Student(03, "Aidar", 4.0));
        students.add(new Student(04, "Nigga", 4.9));
        students.add(new Student(05, "Nurai", 2.3));
    }
    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        for(int i = 0; i < students.size(); i++) {
            double currentGpa = students.get(i).getGpa();
            if(currentGpa < 2.0) {
                System.out.println("The student " + i + "is failing");
                students.remove(i);
            }
        }
    }
    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        for(int i = 0; i < students.size(); i++) {
            double currentGpa = students.get(i).getGpa();
            double highestGpa = 0.0;
            if(currentGpa > highestGpa) {
               currentGpa = highestGpa;
            }
                System.out.println("The highest gpa " + highestGpa + " Student index : " + i);
        }
    }
    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        for(int i = 0; i < students.size(); i++) {
        }
        students.add(2, new Student(02, "AMianna", 4.0 ));
        System.out.println("Inserted...");
    }

    public void printStudents() {
        // TODO: Print using Iterator
        Iterator<Student> it = students.iterator();
        while(it.hasNext()) {
            System.out.println("Students " + it.next());
        }
    }
}
