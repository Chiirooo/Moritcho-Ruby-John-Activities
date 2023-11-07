package MIDTERM.StudentCLass;

import java.util.Scanner;

public class StudentInterface {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("input First Name: ");
        student.setFirstName(scan.nextLine());
        
        System.out.print("input Middle Name: ");
        student.setMiddleName(scan.nextLine());
        
        System.out.print("input Last Name: ");
        student.setLastName(scan.nextLine());
        
        System.out.print("input Suffix: ");
        student.setSuffix(scan.nextLine());
        
        //display
        System.out.println("\n Student Profile");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("Full name: " + student.getFullName());

    }
}
