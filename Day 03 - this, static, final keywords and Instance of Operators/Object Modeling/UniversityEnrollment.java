package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private Professor professor;
    private List<Learner> learners;

    public Subject(String name) {
        this.name = name;
        this.learners = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollLearner(Learner learner) {
        learners.add(learner);
    }

    public void displaySubjectDetails() {
        System.out.println("Subject: " + name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Learners:");
        for (Learner learner : learners) {
            System.out.println("- " + learner.getName());
        }
    }
}

class Learner {
    private String name;
    private List<Subject> subjects;

    public Learner(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollSubject(Subject subject) {
        subjects.add(subject);
        subject.enrollLearner(this);
    }
}

class Professor {
    private String name;
    private List<Subject> subjects;

    public Professor(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignSubject(Subject subject) {
        subjects.add(subject);
        subject.assignProfessor(this);
    }
}
public class UniversityEnrollment {
    public static void main(String[] args) {
        Learner learner1 = new Learner("Alice");
        Learner learner2 = new Learner("Bob");

        Professor professor1 = new Professor("Dr. Smith");

        Subject subject1 = new Subject("Computer Science");

        professor1.assignSubject(subject1);
        learner1.enrollSubject(subject1);
        learner2.enrollSubject(subject1);

        subject1.displaySubjectDetails();
    }
}
