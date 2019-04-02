package employeeHomeWork;

public class Main {
    public static void main(String[] args) {

        Employee myEmployee = new Employee();
        myEmployee.setName("Avonte");
        myEmployee.setSalary(60000);
        myEmployee.getName();
        myEmployee.getSalary();
        System.out.println(myEmployee.raiseSalary(2000));
        System.out.println(myEmployee.printName("Avonte", "GQ"));
    }
}
