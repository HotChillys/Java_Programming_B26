package day23_05_03_2022.cydeo;

public final class Student extends Person{

    private String schoolName;
    private int studentID;

    public Student(String name, char gender, int age, String schoolName, int studentID) {
        super(name, gender, age);
        this.schoolName = schoolName;
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    public void attendClass(){
        System.out.println(getName() + " attended class today");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                " schoolName='" + schoolName + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
