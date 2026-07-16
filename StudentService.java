package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent(){
        System.out.println("Enter the Student ID");
        int id = sc.nextInt();
        sc.nextLine();

        // Check Duplicate ID
        for(Student s : students) {
            if(s.getId() == id) {
                System.out.println("Student already exists!!");
                return;
            }
        }
        
        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Enter Age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course");
        String course = sc.nextLine();

        System.out.println("Enter Marks");
        double marks = sc.nextInt();

        String grade = calculateGrade(marks); 

        Student student = new Student(id, name, age, course, marks, grade);
        students.add(student);

        System.out.println("\nStudent Added Successfully!");
    }

    // Display Student
    public void displayStudents() {

        if(students.isEmpty()) {
            System.out.println("No Student Found");
            return;
        }

        System.out.println("\n===== Student List =====");

        for(Student s : students) {
            System.out.println(s);
        }
    }

    // Search Student
    public void searchStudent(){

        System.out.println("Enter Student ID");
        int id = sc.nextInt();

        for(Student s : students) {
            if(s.getId() == id) {
                System.out.println("\nStudent Found");
                System.out.println(s);
                return;
            }

            System.out.println("Student Not Found");
        }
    }

    // Update Student
    public void updateStudent() {
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        sc.nextLine();

        for(Student s : students) {

            if(s.getId() == id) {

                System.out.println("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.println("Enter New Age: ");
                s.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println("Enter New Course: ");
                s.setCourse(sc.nextLine());

                System.out.println("Enter New Marks: ");
                double marks = sc.nextDouble();

                s.setMarks(marks);
                s.setGrade(calculateGrade(marks));

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    public void deleteStudent() {

        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            
            if(s.getId() == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully.");
                return;
            }

            System.out.println("Student Not Found.");
        }
    }

    // Sort by Name
    public void sortByName() {

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Student Sorted By Name");
    }

    // Sort by Marks
    public void sortByMarks() {

        students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
    }

    // Grade Calculation
    private String calculateGrade(double marks) {

        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }
}
