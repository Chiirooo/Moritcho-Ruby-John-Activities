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
      this.studentId = validateIntData(id);
   }
   
   public void setFirstName(String firstName){
      this.firstName = validateStringData(firstName);
   }
   
   public void setMiddleName(String middleName){
      this.middleName = validateStringData(middleName);
   }
   
   public void setLastName(String lastName){
      this.lastName = validateStringData(lastName);
   }
   
   public void setSuffix(String suffix){
      this.suffix = validateStringData(suffix);
   }
   
   public void setAge(int age){
      this.age = validateIntData(age);
   }
   
   public void setYearLevel(int yearLevel){
      this.yearLevel = validateIntData(yearLevel);
   }
   
   public void setPhoneNumber(int phoneNumber){
      this.phoneNumber = validateIntData(phoneNumber);
   }
   
   public void setEmail(String email){
      this.email = validateStringData(email);
   }
   
   //helper methods
   private int validateIntData(int data){
      if(data == 0){
         return 0;
      }
      else{
         return data;
      }
   }

   private String validateStringData(String data){
      if(data.equals(null)){
         return "none";
      }
      else{
         return data;
      } 
   }

}