package DataStructures;

public class Employer {
    private String name;
    private String location;

    public Employer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Employer(){}

    public void employeeDetails(Employee employee){
        System.out.println("ID: " + employee.getIdNumber());
    }

    public void calculateAnnualBonus(Employee employee){
        double annulBonus = (employee.getMonthlySalary() * 0.15) * 11;
        System.out.println("Annual bonus for " + employee.getFirstName() + " is " + annulBonus);
    }

    public boolean areRelated(Employee employee1, Employee employee2){
        if(employee1.getLastName() == employee2.getLastName()){
            return true;
        } else
            return false;
    }
}
