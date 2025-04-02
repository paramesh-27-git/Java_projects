package school.src.management.system;

public class Student {
        private int id;
        private String name;
        private int grade;
        private int fees_Paid;
        private int fees_total;
        public Student(int id,String name,int grade){
            this.id= id;
            this.name=name;
            this.grade=grade;
            this.fees_Paid=0;
            this.fees_total=300000;
        }
        public void set_grade(int grade){
            this.grade=grade;
        }
        public void update_fees(int fees){
            fees_Paid=fees_Paid+fees;
            school.updateTotal_money_earned(fees_Paid);
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFees_Paid() {
        return fees_Paid;
    }

    public int getFees_total() {
        return fees_total;
    }
    public int remaining_fees(){
        return fees_total-fees_Paid;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", grade=" + grade +
//                ", fees_Paid=" + fees_Paid +
//                ", fees_total=" + remaining_fees() +
//                '}';
//    }
    @Override
    public String toString() {
        return String.format("Student ID: %d\nName: %s\nGrade: %d\nFees Paid: %d\nTotal Fees: %d\n----------------------\n",
                id, name, grade, fees_Paid, remaining_fees());
    }

}
