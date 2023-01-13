package it.develhope.interface1.entities;

public class Professor extends CollegePerson implements TeachingPerson{
    String teachingSubject;

    public  Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I teach to other people");
    }


}
