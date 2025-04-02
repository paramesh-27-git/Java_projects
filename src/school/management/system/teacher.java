package school.management.system;

public class teacher {
    private int id;
    private String name;
    private int Salary;
    private static int salaryearned;

    public teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.Salary = salary;
        this.salaryearned=0;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }
    public void receive_salary(int salary){
        salaryearned+=salary;
        school.updateTotal_money_spent(salary);
    }
    public static int getreceived_salary(){
        return salaryearned;
    }
}
