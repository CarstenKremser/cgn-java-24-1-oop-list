package org.example;

import java.util.List;
import java.util.ArrayList;

public class School {

    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findById(String id) {
        for (Student student:students) {
            if(student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudent(String id) {
        Student student = findById(id);
        if (student != null) {
            return students.remove(student);
        }
        return false;
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

    public String retrieveAllCoursesForStudent(String id) {
        String result = "";
        Student student = findById(id);
        if (student != null) {
            result += "Courses for Student with id " + id + ":\n";
            for (Course course: student.getCourses()) {
                result += course.toString() + "\n";
            }
        }
        return result;
    }
}
