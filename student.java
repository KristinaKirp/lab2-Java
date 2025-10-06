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
        String errorName = Validation.nameError(name);
        if(errorName == null){
            this.name = name;
        }else {
            System.out.println("Данные введены неккоректно, заменяю на базовые: Иван");
            this.name = "Иван";
        }

    }
    public void setGrades(int[] grades) {
        int errorGrades = Validation.errorInArray(grades);
        if(errorGrades == 0 ) {
            this.grades = grades;
        } else {
            System.out.println("Ошибка в веденном массиве! Массив изменен.");
            this.grades = new int[] {3,4,5,3};
        }
    }


    public student(String name, int[] grades){
        setName(name);
        setGrades(grades);
        this.gpa = 0;
        double count = 0;
        if(this.grades == null || this.grades.length == 0){
            gpa = 0;
        }else {
            for (int i = 0; i < this.grades.length; i ++){
                count = count + this.grades[i];
            }
            gpa = count/this.grades.length;
        }
        if(gpa == 5.0){
            excellentStudent = true;
        }else{
            excellentStudent = false;
        }
    }

//    public student(){
//        this.name = "Вася";
//        this.grades = new int[] {3,4,5};
//    }
//
//    public student(student student){
//        this.grades = student.grades;
//        this.name = "Петя";
//    }

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




    @Override
//    public String toString(){
//        if(grades.length ==0){
//            return "Студент " + name + " без оценок";
//        }else{
//            return "Студент " + name + " " + Arrays.toString(grades);
//        }
//    }
    public  String toString(){
        if(excellentStudent){
            return "У студента " + name + " средний балл: " + gpa + ". Он отличник";
        }else {
            return "У студента " + name + " средний балл: " + gpa + ". Он не отличник";
        }
    }
}
