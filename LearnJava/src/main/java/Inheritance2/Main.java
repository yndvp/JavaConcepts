package Inheritance2;

public class Main {
    public static void main(String[] args) {
        Person james = new Person("James", "Swift", 47);
        System.out.println(james.getAge());

        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setAge(45);
        employee.setId(123456);
        employee.setAnnualSalary(100000);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getId());
        System.out.println(employee.getAnnualSalary());

        Manager manager = new Manager();
        manager.setFirstName("George");
        manager.setLastName("Kilos");
        manager.setAge(35);
        manager.setId(456);
        manager.setAnnualSalary(45000);

        System.out.println(manager.getId() + " " + manager.getFirstName() + ": " + manager.getAnnualSalary());

        // This invoke the toString method
        System.out.println(manager);
        System.out.println(employee);

        // String is an object!
        int a = 12;
        String str = "yvkkbuk";
        String newStr = new String();
        boolean isEmpty = str.isEmpty();
        if(!isEmpty) {
            System.out.println("Our string is not empty");
        } else {
            System.out.println("Our string is empty");
        }
        boolean contains = str.contains("h");
        if(contains){
            System.out.println("Our string contains h");
        } else{
            System.out.println("There is no h in our string");
        }
    }
}
