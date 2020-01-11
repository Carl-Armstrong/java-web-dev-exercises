package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student carlArmstrong = new Student("Carl Armstrong", 1234, 1, 4.0);

        System.out.println(carlArmstrong.getName());
        System.out.println(carlArmstrong.getStudentId());
        System.out.println(carlArmstrong.getNumberOfCredits());
        System.out.println(carlArmstrong.getGpa());

        System.out.println("\n");

        Teacher tonyStark = new Teacher("Tony", "Stark");
        tonyStark.setSubject("Mechanics");
        tonyStark.setYearsTeaching(1);

        System.out.println(tonyStark.getFirstName());
        System.out.println(tonyStark.getLastName());
        System.out.println(tonyStark.getSubject());
        System.out.println(tonyStark.getYearsTeaching());
    }
}
