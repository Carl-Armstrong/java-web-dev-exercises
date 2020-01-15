package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster;
    String className;
    String textBook;
    int classPeriod;
    Teacher teacher;

    public Course (ArrayList<Student> roster, String className, String textBook, int classPeriod, Teacher teacher) {
        this.roster = roster;
        this.className = className;
        this.textBook = textBook;
        this.classPeriod = classPeriod;
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return className + " (Teacher: " + teacher + ", Class Period: " + classPeriod + ")";
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return theCourse.getClassName() == getClassName();
    }

}
