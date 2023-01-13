package it.develhope.interface1;

import it.develhope.interface1.entities.Assistant;
import it.develhope.interface1.entities.Professor;
import it.develhope.interface1.entities.Student;
import jdk.jshell.spi.ExecutionControl;

public class Start {
    public static void main(String[] args){
        Student student = new Student("Giulia", "Conta", 234, 2022);
        Professor professor = new Professor("Paolo", "Licata", 567, "Computer science");
        Assistant assistant = new Assistant("Marco", "Rossi", 890, true);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
