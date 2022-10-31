// Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
// The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
// Now, assign name, age, phone number, address and salary to an employee and a manager 
// by making an object of both of these classes and print the same.
public class Inheritance2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        e.setName("Rahul");
        e.setAge(25);
        e.setPhone(1234567890);
        e.setAddress("Delhi");
        e.setSalary(10000);
        e.setSpecialization("Java");
        m.setName("Rohit");
        m.setAge(30);
        m.setPhone(1234567891);
        m.setAddress("Mumbai");
        m.setSalary(20000);
        m.setDepartment("IT");
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Phone: " + e.getPhone());
        System.out.println("Address: " + e.getAddress());
        e.printSalary();
        System.out.println("Specialization: " + e.getSpecialization());
        System.out.println("-----------------------------");
        System.out.println("Manager Details:");
        System.out.println("Name: " + m.getName());
        System.out.println("Age: " + m.getAge());
        System.out.println("Phone: " + m.getPhone());
        System.out.println("Address: " + m.getAddress());
        m.printSalary();
        System.out.println("Department: " + m.getDepartment());
    }
}

class Member{
    private String name;
    private int age;
    private long phone;
    private String address;
    private double salary;
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
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    void printSalary(){
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member{
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Manager extends Member{
    private String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
