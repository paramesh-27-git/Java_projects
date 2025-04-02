package school.src.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        teacher Radha=new teacher(1,"Radha",30000);
        teacher Sam=new teacher(2,"Sam",10000);
        teacher Saranya=new teacher(3,"Saranya",40000);
        List<teacher> teacherlist = new ArrayList<>();
        teacherlist.add(Radha);
        teacherlist.add(Sam);
        teacherlist.add(Saranya);
        Student vijay= new Student(1,"Vijay",8);
        Student surya= new Student(2,"Surya",7);
        Student ajith= new Student(3,"Ajith",10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(vijay);
        studentList.add(surya);
        studentList.add(ajith);
        school ghs=new school(teacherlist,studentList);
        vijay.update_fees(40000);
        ajith.update_fees(50000);
        Radha.receive_salary(Radha.getSalary());
        Sam.receive_salary(Sam.getSalary());
        System.out.println(ghs.getTotal_money_earned());
        System.out.println(ghs.getTeachers()+" "+ghs.getStudents());

    }
}
