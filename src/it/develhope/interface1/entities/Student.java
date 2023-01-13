package it.develhope.interface1.entities;
/**
 * Define subclass Student
 */
public class Student extends CollegePerson implements  LearningPerson{
    int academicYear;

    public Student (String name, String surname, int id, int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }
    @Override
    public void studyAtHome() {
        System.out.println("I'm studying at home");
    }
}
