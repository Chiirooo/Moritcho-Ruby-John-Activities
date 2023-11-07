public class Course{
   private String courseName;
   private int courseCode;
   private String department;
   
   public Course(String courseName, int courseCode, String department){
      this.courseName = courseName;
      this.courseCode = courseCode;
      this.department = department;
   }
   
   //getters
   public String getCourseName(){
      return courseName;
   }
   
   public int getCourseCode(){
      return courseCode;
   }
   
   public String getDepartment(){
      return department;
   }
   
   //setters
   public void setCourseName(String courseName){
      this.courseName = courseName;
   }
   
   public void setCourseCode(int courseCode){
      this.courseCode = courseCode;
   }
   
   public void setDepartment(String department){
      this.department = department;
   }

   //methods
   public String toString(){
      return courseName + ", " + courseCode + ", " + department;
   }
   
}