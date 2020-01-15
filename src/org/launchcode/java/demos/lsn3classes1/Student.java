package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
    return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public String getGradeLevel(int numberOfCredits) {
        String gradeLevel = "";

        if (numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else {
            gradeLevel = "Senior";
        }

        return gradeLevel;
    }

    public void addGrade(int creditsAdded, double grade) {
        double currentQualityScore = gpa * numberOfCredits;
        double addedQualityScore = creditsAdded * grade;
        double newQualityScore = currentQualityScore + addedQualityScore;
        numberOfCredits += creditsAdded;
        gpa = newQualityScore / numberOfCredits;
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
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

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

}