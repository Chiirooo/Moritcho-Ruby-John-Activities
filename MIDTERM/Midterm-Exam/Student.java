public class Student{
   private int studentId;
   private String firstName;
   private String middleName;
   private String lastName;
   private String suffix;
   private int age;
   private int yearLevel;
   private int phoneNumber;
   private String email;
   
   public Student(){
      this.studentId = 0;
      this.firstName = "";
      this.middleName = "";
      this.lastName = "";
      this.suffix = "";
      this.age = 0;
      this.yearLevel = 0;
      this.phoneNumber = 0;
      this.email = "";
   }
   
   //getters
   public int getStudentId(){
      return studentId;
   }
   
   public String getFirstName(){
      return firstName;
   }
   
   public String getMiddleName(){
      return middleName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public int getAge(){
      return age;
   }
   
   public int getYearlevel(){
      return yearLevel;
   }
   
   public int getPhoneNumber(){
      return phoneNumber;
   }
   
   public String getEmail(){
      return email;
   }
   
   public String getDetails(){
      return firstName + " " + middleName + " " + lastName; 
   }
   
   //setters
   public void setStudentId(int id){
      this.studentId = id;
   }
   
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   
   public void setMiddleName(String middleName){
      this.middleName = middleName;
   }
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   
   public void setSuffix(String suffix){
      this.suffix = suffix;
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public void setYearLevel(int yearLevel){
      this.yearLevel = yearLevel;
   }
   
   public void setPhoneNumber(int phoneNumber){
      this.phoneNumber = phoneNumber;
   }
   
   public void setEmail(String email){
      this.email = email;
   }
   
 
   

}