package employeeHomeWork;

public class Employee {
    //variables
    private String name;
    private int salary;
    protected String nickName;

    //DEFULT
    public Employee(){
    }

    //CONSTRUCTOR
    public Employee(String name, int salary, String nickName){

        this.name = name;
        this.salary = salary;
        this.nickName = nickName;

    }

    //tO. STRING
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    //METHOD
    int raiseSalary (int x) {

        int raise = x;

        int finalSalary = x + salary;

        return finalSalary;
    }

    String printName(String y, String u){

        String name = y;

        String greeting = "The employee name is " + name;

        String nickname = u;

        String myNickName = greeting + " and employee nick name is " + nickname;

        return myNickName;

    }

        //GETTER AND SETTERS
        public String getName(){
        return name;
    }

        public int getSalary(){
        return salary;
    }

        public void setName(String name){
        this.name = name;
    }

        public void setSalary(int salary){
        this.salary = salary;
    }
}
