package it.develhope.interface1.entities;
/**
 * define a Superclass
 */
public class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;

    public void goToCollege() {
        System.out.println(name + " - " + surname + " - " + collegeId);
    }
}


