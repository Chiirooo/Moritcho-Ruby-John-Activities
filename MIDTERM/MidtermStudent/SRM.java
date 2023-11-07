import java.util.Scanner;

public class SRM{
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args){
      System.out.println("Student Record Management App v1");
      System.out.println("Selection Menu:");
      Student s1 = selectionMenu();
      if(s1 != null){ 
         enterStudentDetails(s1);
         selectionMenu(s1);
      }
      else{
         System.out.println("bye");
      }
   }
   
   public static Student selectionMenu(){
      char choice;
      Student s;
      System.out.println("1. Create Student Record");
      System.out.println("0. Exit");
      System.out.print("Enter Selection: ");
      choice = scan.nextLine().charAt(0);
      if(choice == '1'){
         s = new Student();
         s.getDetails();
         return s;
      }
      else return null;
   }
   
   public static void enterStudentDetails(Student s){
      System.out.println("Enter student details");
      System.out.print("Enter student id no. ");
      s.setStudentId(scan.nextInt());
      scan.nextLine();
      System.out.print("Enter firsName. ");
      s.setFirstName(scan.nextLine());
      System.out.print("Enter middleName. ");
      s.setMiddleName(scan.nextLine());
      System.out.print("Enter last Name. ");
      s.setLastName(scan.nextLine());
      System.out.print("Enter suffix. ");
      s.setSuffix(scan.nextLine());
      System.out.print("Enter age. ");
      s.setAge(scan.nextInt());
      System.out.print("Enter yearLevel. ");
      s.setYearLevel(scan.nextInt());
      System.out.print("Enter email. ");
      scan.nextLine();
      s.setEmail(scan.nextLine());
   }
   
   static void setCourse(Student s){
      Course course;
      Course c1 = new Course("BSIT", 1, "CCS");
      Course c2 = new Course("BSIT", 1, "CCS");
      Course c3 = new Course("BSIT", 1, "CCS");
      Course c4 = new Course("BSIT", 1, "CCS");
   }
   
   static void selectionMenu(Student s){
      System.out.println("Student Record Selection Menu");
      System.out.println("1. Update profile");
      System.out.println("2. Update course");
      System.out.println("3. Display Record");
      System.out.println("0. exit");
      
      char option = scan.nextLine().charAt(0);
      switch(option){
         case '1':
            
         case '2':
         case '3':
         default:
      }
   }
}