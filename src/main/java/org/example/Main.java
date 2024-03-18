package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("a001","Ansgar", "Apfel"));
        students.add(new Student("b001","Berta","Brandt"));
        students.add(new Student("c001","Claudia","Cactus"));
        students.add(new Student("d001","Dora","Dingsda"));
        students.add(new Student("e001","Ernst","Einhorn"));

        for(Student student:students) {
            System.out.println(student);
        }


        School school = new School();
        for (Student student:students) {
            school.addStudent(student);
        }
        System.out.println(school);
    }
}