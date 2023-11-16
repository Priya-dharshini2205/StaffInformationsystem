import java.util.ArrayList;

class StaffInformationSystem {
    public static void main(String[] args) {
       
        Staff staffMember = new Staff("John Doe", 30, "123 Main St", "555-1234");
        Qualification qualification = new Qualification("Bachelor's", "XYZ University", 2010);
        Roles role = new Roles("Software Engineer", "Develop and maintain software applications");
 
     
        // Display staff information
        System.out.println("Staff Information:");
        System.out.println("Name: " + staffMember.getName());
        System.out.println("Age: " + staffMember.getAge());
        System.out.println("Address: " + staffMember.getAddress());
        System.out.println("Phone Number: " + staffMember.getPhoneNumber());
 
        System.out.println("\nQualifications:");
            System.out.println("Degree: " + qualification.getDegree());
            System.out.println("University: " + qualification.getUniversity());
            System.out.println("Year: " + qualification.getYear());
    
 
        System.out.println("\nRoles:");
            System.out.println("Role Name: " + role.getRoleName());
            System.out.println("Responsibilities: " + role.getResponsibilities());
    
    }
}
 
class Staff {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
 
    public Staff(String name, int age, String address, String phoneNumber) {
this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
 
    // Getters and setters for personal details
 
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
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
 
class Qualification {
    private String degree;
    private String university;
    private int year;
 
    public Qualification(String degree, String university, int year) {
this.degree = degree;
this.university = university;
        this.year = year;
    }
 
    // Getters and setters for qualification details
 
    public String getDegree() {
        return degree;
    }
 
    public void setDegree(String degree) {
this.degree = degree;
    }
 
    public String getUniversity() {
        return university;
    }
 
    public void setUniversity(String university) {
this.university = university;
    }
 
    public int getYear() {
        return year;
    }
 
    public void setYear(int year) {
        this.year = year;
    }
}
 
class Roles {
    private String roleName;
    private String responsibilities;
 
    public Roles(String roleName, String responsibilities) {
        this.roleName = roleName;
        this.responsibilities = responsibilities;
    }
 
    // Getters and setters for role details
 
    public String getRoleName() {
        return roleName;
    }
 
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
 
    public String getResponsibilities() {
        return responsibilities;
    }
 
    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }
}
 
