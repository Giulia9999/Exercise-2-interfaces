package it.develhope.interface1.entities;
/**
 * Define subclass Assistant
 */
public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{
    boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }
    @Override
    public void studyAtHome() {
        System.out.println("I study at home, will I take the PHD? " + isGoingToBeAPhD);
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I teach to other people with the professor");
    }
}
