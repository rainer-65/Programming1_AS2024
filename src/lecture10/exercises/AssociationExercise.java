package lecture10.exercises;

import java.util.ArrayList;
import java.util.List;

// Class 1
// Student class
class Student {

    // Attributes of Student
    private String studentName;
    private String legiNr;
    private List<Module> modules;   // Modules the student is applying for

    // Constructor of Student class
    public Student(String studentName, String legiNr) {
        this.studentName = studentName;
        this.legiNr = legiNr;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public String getLegiNr() {
        return legiNr;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setLegiNr(String legiNr) {
        this.legiNr = legiNr;
    }

    // Student applies for modules
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Module> getModules() {
        return modules;
    }
}

// Class 2
// Module class
class Module {

    // Attributes of Module
    private String moduleName;
    private String moduleNumber;

    // Constructor of Module class
    public Module(String moduleName, String moduleNumber) {
        this.moduleName = moduleName;
        this.moduleNumber = moduleNumber;
    }

    // Getters and Setters
    public String getModuleName() {
        return moduleName;
    }

    public String getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleNumber(String moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    @Override
    public String toString() {
        return "Module Name='" + moduleName + '\'' + ", Module Number='" + moduleNumber + '\'' + '}';
    }
}

// Class 3: Driver class
class StudentModule {

    // Main driver method
    public static void main(String[] args) {
        // Creating Student objects
        Student mayer = new Student("Henrik Mayer", "A13456");
        Student studer = new Student("Claudia Studer", "A53499");
        Student telesko = new Student("Rainer Telesko", "A77652");

        // Adding the students to a list
        List<Student> list_students = new ArrayList<>();
        list_students.add(mayer);
        list_students.add(studer);
        list_students.add(telesko);

        // Creating Module objects
        Module programming1 = new Module("Programming 1", "BIT1234");
        Module intro_bit = new Module("Introduction to BIT", "BIT5467");

        // Adding the modules to a list
        List<Module> list_modules = new ArrayList<>();
        list_modules.add(programming1);
        list_modules.add(intro_bit);

        // Students apply for modules (are linked then to modules)
        mayer.setModules(list_modules.subList(0, 1));   // Applies only for one module
        studer.setModules(list_modules);    // Applies for all modules

        // Traversing and displaying the students
        for (Student student : list_students) {
            if (student.getModules() != null)
                System.out.println("Student: " + student.getStudentName() + ": " + student.getModules());
            else System.out.println("Student: " + student.getStudentName() + " did not apply for modules");
            ;
        }
    }
}

