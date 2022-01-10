package Inheritance2;

public class Employee extends Person{
    // Extra properties
    private int id;
    private double annualSalary;

    // Instantiating object object
    Object object = new Object().toString();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + ", "
                + "ID: " + getId() + ", "
                + "Salary: " + getAnnualSalary();
    }
}
