package MIDTERM.StudentCLass;

public class Student {
    //attributes
    private String first_name;
    private String middle_name;
    private String last_name;
    private String suffix;

    //setters
    public void setFirstName(String firstName){
        this.first_name = firstName;
    }

    public void setMiddleName(String middleName){
        this.middle_name = middleName;
    }

    public void setLastName(String lastName){
        this.last_name = lastName;
    }

    public void setSuffix(String suffix){
        this.suffix = suffix;
    }

    //getters
    public String getFirstName(){
        return first_name;
    }

    public String getMiddleName(){
        return middle_name;
    }

    public String getLastName(){
        return last_name;
    }

    public String getSuffix(){
        return suffix;
    }

    public String getFullName(){
        return first_name + " " + middle_name + " " + last_name;
    }

}
