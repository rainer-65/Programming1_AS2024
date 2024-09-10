package lecture10.examples;

// Java program to illustrate concept of Aggregation

// Importing required classes
import java.util.*;

// Class 1
// Student class
class Student {

    // Attributes of Student
    private String studentName;
    private int studentId;

    // Constructor of Student class
    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String toString() {
        return "Student Name: " + this.studentName + " " + "Student ID: " + this.studentId;
    }
}

// Class 2
// Department class contains list of Students
class CompetenceCenter {

    // Attributes of Department class
    private String ccName;
    private List<Student> students;

    // Constructor of Department class
    public CompetenceCenter(String ccName, List<Student> students) {
        this.ccName = ccName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String toString() {
        return "CC Name: " + ccName;
    }
}

// Class 3
// Institute class contains the list of competence centers
class Institute {

    // Attributes of Institute
    private String instituteName;
    private List<CompetenceCenter> competenceCenters;

    // Constructor of Institute class
    public Institute(String instituteName,
                     List<CompetenceCenter> competenceCenters) {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.competenceCenters = competenceCenters;
    }

    public List<CompetenceCenter> getCompetenceCenters() {
        return this.competenceCenters;
    }
}


// Class 4
// Driver class
class InstituteCCStudent {

    // main driver method
    public static void main(String[] args) {

        // Creating independent Student objects
        Student s1 = new Student("John Myers", 1);
        Student s2 = new Student("Jill Hayden", 2);
        Student s3 = new Student("Bill Hudson", 3);
        Student s4 = new Student("Karen McKenzie", 4);
        Student s5 = new Student("Michael Stewart", 5);

        // Creating a competence center BIT with students
        List<Student> bit_students = new ArrayList<Student>();
        bit_students.add(s1);
        bit_students.add(s2);
        CompetenceCenter bit = new CompetenceCenter("bit", bit_students);

        // Creating a competence center SE with students
        List<Student> se_students = new ArrayList<Student>();
        se_students.add(s3);
        se_students.add(s4);
        se_students.add(s5);
        CompetenceCenter se = new CompetenceCenter("se", se_students);

        // Creating an institute CS with two competence centers BIT and SE
        List<CompetenceCenter> competenceCenters = new ArrayList<>();
        competenceCenters.add(bit);
        competenceCenters.add(se);
        Institute inst = new Institute("cs", competenceCenters);

        // Pretty print of all competence centers of the institute cs
        System.out.print("List of Competence Centers: " + inst.getCompetenceCenters().toString().replace("[", "").replace("]", ""));
        System.out.println();

        // Display all students of the two competence centers
        for (int i = 0; i < competenceCenters.size(); i++) {
            System.out.print(competenceCenters.get(i).toString() + " ");
            List<Student> students = competenceCenters.get(i).getStudents();
            for (int j = 0; j < students.size(); j++) {
                System.out.print(students.get(j).toString() + " ");
            }
            System.out.println();
        }

    }

}


