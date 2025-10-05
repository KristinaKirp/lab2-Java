import java.util.Arrays;

public class student {
    private String name;
    private int[] grades;
    private boolean excellentStudent;
    private double gpa;

    public double getGpa(){
        return gpa;
    }

    public String getName(){
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public student(){
        this.name = "Вася";
        this.grades = new int[] {3,4,5};
    }

    public student(student student){
        this.grades = student.grades;
        this.name = "Петя";
    }

//    public student(String name, int[] grades){
//        setName(name);
//        setGrades(grades);
//    }
//    public student(String name, int[] grades){
//        this.name = name;
//        if(grades == null){
//            this.grades = new int[0];
//        }else{
//            this.grades = grades;
//        }
//    }

    public student(String name, int[] grades){
        setName(name);
        setGrades(grades);
        this.gpa = 0;
        int count = 0;
        if(grades == null){
            gpa = 0;
        }else {
            for (int i = 0; i < grades.length; i ++){
                gpa = gpa + grades[i];
                count++;
            }
            gpa = gpa/count;
        }
        if(gpa == 5.0){
            excellentStudent = true;
        }else{
            excellentStudent = false;
        }
    }


    @Override
//    public String toString(){
//        if(grades.length ==0){
//            return "Студент " + name + " без оценок";
//        }else{
//            return "Студент " + name + " " + Arrays.toString(grades);
//        }
//    }
    public  String toString(){
        if(excellentStudent == true){
            return "У студента " + name + " средний балл: " + gpa + ". Он отличник";
        }else {
            return "У студента " + name + " средний балл: " + gpa + ". Он не отличник";
        }
    }
}
