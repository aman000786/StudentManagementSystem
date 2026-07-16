package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        
        int choice;

        do {

            System.out.println("\n=======================");
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("=========================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort By Name");
            System.out.println("7. Sort By Marks");
            System.out.println("8. Exit");
            System.out.println("Enter choice");

            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    service.addStudent();
                    break;

                case 2:
                    service.displayStudents();
                    break;
                
                case 3:
                    service.searchStudent();
                    break;

                case 4:
                    service.updateStudent();
                    break;

                case 5:
                    service.deleteStudent();
                    break;

                case 6:
                    service.sortByName();

                case 7:
                    service.sortByMarks();
                    break;

                case 8:
                    System.out.println("Thank You!!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8); 
            
        sc.close();
    }
}