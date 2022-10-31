import java.util.Scanner;

class Person {
    String firstName;
    String lastName;

    // Default and alternate constructors.
    public Person() {
        firstName = "John";
        lastName = "Doe";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Two getters (accessors) to return the first and the last name
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // A method named setName to set the fields to the parameters passed
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 2 methods to print:
    // A method named printLastFirst (in this order, use “,” as a separator)
    public String printLastFirst() {
        return lastName + ", " + firstName;
    }

    // A method called print (should print in order first name and last name)
    public String print() {
        return firstName + " " + lastName;
    }

    // A method named toString()
    public String toString() {
        return firstName + " " + lastName;
    }

    // A method named equals (pass an object of the Object class)
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return firstName.equals(p.firstName) && lastName.equals(p.lastName);
        }
        return false;
    }

    // 2 methods named copy and getCopy to make a copy of a Person object into
    // another Person object
    public void copy(Person p) {
        firstName = p.firstName;
        lastName = p.lastName;
    }

    public Person getCopy() {
        return new Person(firstName, lastName);
    }
}

class Employee extends Person{
    double payRate;
    double hoursWorked;
    String department;
    public final int HOURS = 40;
    public final double OVERTIME = 1.5;
    
    public Employee() {
        super();
        payRate = 0;
        hoursWorked = 0;
        department = "None";
    }
    
    public Employee(String firstName, String lastName, double payRate, double hoursWorked, String department) {
        super(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
    }
    
    double calculatePay() {
        if (hoursWorked > HOURS) {
            return (HOURS * payRate) + ((hoursWorked - HOURS) * (payRate * OVERTIME));
        }
        return hoursWorked * payRate;
    }
    
    public String toString() {
        return "The wages for " + super.printLastFirst() + " from the " + department + " department are: $" + calculatePay();
    }
    
    public String print() {
    
        return "The employee " + super.toString() + " from the " + department +
                " department worked " + hoursWorked + " hours with a pay rate of $" + payRate +
                ". The wages for "+super.toString()+" employee are $" + calculatePay();
    
    }
    
    public void setAll(String first, String last, double rate, double hours, String dep) {
        super.setName(first, last);
        payRate = rate;
        hoursWorked = hours;
        department = dep;
    }
    
    public double getPayRate() {
        return payRate;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return super.equals(e) && payRate == e.payRate && hoursWorked == e.hoursWorked
                    && department.equals(e.department);
        }
        return false;
    }
    
    public Employee getCopy() {
        return new Employee(firstName, lastName, payRate, hoursWorked, department);
    }
    public void copy(Employee e) {
        super.copy(e);
        payRate = e.payRate;
        hoursWorked = e.hoursWorked;
        department = e.department;
    }
    
}

public class ClientEmployee {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        Employee e1 = new Employee();
        e1.setAll("John", "Doe", 25.50, 50, "COSC");
        Employee e2 = new Employee();
        System.out.println("Enter employee last name:");
        String lastName = input.nextLine();
        System.out.println("Enter employee first name:");
        String firstName = input.nextLine();
        System.out.println("Enter Department:");
        String department = input.nextLine();
        System.out.println("Enter pay rate:");
        double payRate = input.nextDouble();
        System.out.println("Enter hours worked:");
        double hoursWorked = input.nextDouble();
        e2.setAll(firstName, lastName, payRate, hoursWorked, department);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.print());
        System.out.println(e2.print());
        System.out.println("The wages for "+e2.getFirstName()+" "+e2.getLastName()+" from the department "+e2.getDepartment()+" are $"+e2.calculatePay());
        if(!e1.equals(e2)){
            System.out.println("Couldn't find an employee with same record.");
        }

        input.close();
    }
}
