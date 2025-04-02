package school.src.management.system;

public class teacher {
    private int id;
    private String name;
    private int salary;
    private static int salaryearned;

    public teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryearned=0;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public void receive_salary(int salary){
        salaryearned+=salary;
        school.updateTotal_money_spent(salary);
    }
    public static int getreceived_salary(){
        return salaryearned;
    }

    @Override
    public String toString() {
        return String.format("Teacher ID: %d\nName: %s\nSalary: %d\n----------------------\n",
                id, name, salary);
    }

}
