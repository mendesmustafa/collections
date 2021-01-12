package com.mendes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        Student jack = new Student(3, "Jack");
        Student ali = new Student(2, "Ali");
        Student mehmet = new Student(4, "Mehmet");
        Student mario = new Student(1, "Mario");
        Student ahmet = new Student(5, "Ahmet");
        students.add(jack);
        students.add(ali);
        students.add(mehmet);
        students.add(mario);
        students.add(ahmet);
        System.out.println("ArrayList: " + students);

        Student collectionsMax = Collections.max(students, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                if (t1.getName().compareTo(t2.getName()) < 0) {
                    return -1;
                } else if (t1.getName().compareTo(t2.getName()) > 0) {
                    return 1;
                } else
                    return 0;
            }
        });
        System.out.println("collections max name: " + collectionsMax);

        Student collectionMin = Collections.min(students);
        System.out.println("collection min name: " + collectionMin);

        Collections.sort(students);
        System.out.println("collections sort by name: " + students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                if (t1.getId() < t2.getId()) {
                    return -1;
                } else if (t1.getId() > t2.getId()) {
                    return 1;
                } else
                    return 0;
            }
        });
        System.out.println("collection sort by id: " + students);

        Collections.reverse(students);
        System.out.println("reverse" + students);
    }
}

class Student implements Comparable<Student> {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.name.compareTo(student.name) < 0) {
            return -1;
        } else if (this.name.compareTo(student.name) > 0) {
            return 1;
        } else
            return 0;
    }
}
