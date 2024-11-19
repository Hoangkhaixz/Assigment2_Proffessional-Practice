package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<Student>();


    private static Scanner scanner = new Scanner(System.in);                        //do{// thực thi
                                                                                    //}while(condition)
    public static void main(String[] args) {
	// write your code here
        int choice = 0;

        while (true) {
            System.out.println("=======Management Students=======");
            System.out.println("=======1.Enter student list==========");
            System.out.println("=======2.Find Students by lastname===");
            System.out.println("===3.Find and edit students by full name===");
            System.out.println("=======4.End=======");
            System.out.print("Enter choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    StudentEnter();
                    break;
                case 2:
                    Findstudentsbylastname();
                    break;
                case 3:
                    Findandeditstudentsbyfullname();
                    break;
                case 4:
                    System.out.println("The End");
                    System.exit(0); // Thoát khỏi vòng lặp và chương trình
                    break;
                default:
                    System.out.println("Selection error..!");
            }
        }
    }
    public static void StudentEnter() {
        System.out.println("Enter the count Students: ");
        int numberOfstudents = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ ký tự xuống dòng sau khi dùng nextInt()

        for (int i = 0; i < numberOfstudents; i++)
        {
            System.out.println("Enter student information " + (i + 1) + ":");

            System.out.println("Enter ID: ");
            String ID = scanner.nextLine();
            System.out.print("Enter firstname: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter the lastname: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter the age student: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // xóa newline
            students.add(new Student(firstName, lastName, age, ID)); // Thêm đối tượng Student vào danh sách
        }
    }
    public static void Findstudentsbylastname() {
        System.out.print("Enter last name to find students: ");
        scanner.nextLine();
        String lastName = scanner.nextLine();
        boolean found = false;

        for (Student student : students) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found with last name: " + lastName);
        }
    }
    public static void Findandeditstudentsbyfullname() {
        scanner.nextLine();  // Xóa dòng trước đó
        System.out.print("Enter the fullname: ");
        String fullName = scanner.nextLine().trim();
        boolean found = false;

        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName.trim()))
            {
                found = true;
                System.out.println("Students found: " + student);
                // New ID
                System.out.println("Enter the new ID: ");
                String ID = scanner.nextLine();
                // nhập họ tên mới
                System.out.print("Enter the new name: ");
                String newFirstName = scanner.nextLine();
                System.out.print("Enter new last name: ");
                String newLastName = scanner.nextLine();
                //new Age
                System.out.println("Enter new Age: ");
                int age = scanner.nextInt();
                //update tên mới họ mới
                student.setID(ID);
                student.setFullName(newFirstName, newLastName);
                student.setAge(age);
                System.out.println("Process Update Finish: " + student);
                break;
            }
        }
        if (!found) {
            System.out.println("No students found with the name: " + fullName);
        }
    }
}
