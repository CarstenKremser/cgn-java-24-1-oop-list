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

        Student aStudent = school.findById("d001");
        System.out.println(aStudent);

        school.removeStudent("b001");
        System.out.println(school);

        Course course1 = new Course("english","Smith","A21");
        Course course2 = new Course("math","Meier","B52");
        Course course3 = new Course("french","Müller","A33");
        Course course4 = new Course("physics","Schmidt","B14");

        aStudent.addCourse(course2);
        aStudent.addCourse(course3);
        aStudent.addCourse(course4);

        aStudent = school.findById("c001");
        aStudent.addCourse(course1);
        aStudent.addCourse(course4);

        aStudent = school.findById("a001");
        aStudent.addCourse(course2);
        aStudent.addCourse(course3);

        System.out.println(school.retrieveAllCoursesForStudent("c001"));


        // use Sack
        System.out.println("Sack: ");

        Sack sack = new Sack();

        sack.add(students.get(0));
        sack.add(students.get(1));
        sack.add(students.get(2));
        sack.add(students.get(3));

        System.out.println(sack);

        sack.removeLast();
        System.out.println(sack);

        System.out.println(sack.removeByIndex(1));
        System.out.println(sack);

        // use Beutel
        System.out.println("Beutel: ");

        Beutel beutel = new Beutel();

        beutel.add(students.get(0));
        beutel.add(students.get(1));
        beutel.add(students.get(2));
        beutel.add(students.get(3));

        System.out.println(beutel);

        beutel.removeLast();
        System.out.println(beutel);

        System.out.println(beutel.removeByIndex(1));
        System.out.println(beutel);

    }
}