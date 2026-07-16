package StudentManagementSystem;

public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;
    private String grade;

    public Student(int id, String name, int age, String course, double marks, String grade ) {
        this.id = id;
        this.name= name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nID       : " + id +
                "\nName    : " + name +
                "\nAge     : " + age +
                "\nCourse  : " + course +
                "\nMarks   : " + marks +
                "\nGrade   : " + grade;
    }

}
