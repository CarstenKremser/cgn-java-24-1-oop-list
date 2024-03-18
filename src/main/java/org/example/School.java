package org.example;

import java.util.List;
import java.util.ArrayList;

public class School {

    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        String result = "School{" +
                "students= {\n";
        for(Student student : students) {
            result += student.toString() + "\n";
        }
        result += "}}";
        return result;
    }
}
