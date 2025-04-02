package school.management.system;

import java.util.List;

public class school {
    private List<teacher> teachers;
    private List<Student> Students;
    private static int total_money_earned=0;
    private static int total_money_spent=0;

    public school(List<teacher> teacherlist, List<Student> studentList) {
        this.teachers=teacherlist;
        this.Students=studentList;
    }

    public List<teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(Student student) {
        Students.add(student);
    }



    public static void updateTotal_money_earned(int money_earned) {
        total_money_earned+=money_earned;
    }
    public  int getTotal_money_earned() {
        return total_money_earned;
    }
    public int getTotal_money_spent() {
        return teacher.getreceived_salary();
    }

    public static void updateTotal_money_spent(int total_money_spent) {
        total_money_earned-= total_money_spent;
    }

}
