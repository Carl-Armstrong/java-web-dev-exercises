package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster;
    String textBook;
    int classPeriod;
    Teacher teacher;

    public Course (ArrayList<Student> roster, String textBook, int classPeriod, Teacher teacher) {
        this.roster = roster;
        this.textBook = textBook;
        this.classPeriod = classPeriod;
        this.teacher = teacher;
    }
}
