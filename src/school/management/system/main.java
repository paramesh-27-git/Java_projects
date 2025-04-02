package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        teacher jahnvi=new teacher(1,"Jahni",30000);
        teacher Sam=new teacher(2,"Samantha",10000);
        teacher Malavika=new teacher(3,"Malavika",40000);
        List<teacher> teacherlist = new ArrayList<>();
        teacherlist.add(jahnvi);
        teacherlist.add(Sam);
        teacherlist.add(Malavika);
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
        jahnvi.receive_salary(jahnvi.getSalary());
        Sam.receive_salary(Sam.getSalary());
        System.out.println(vijay);
        System.out.println(ghs.getTotal_money_earned());
    }
}
