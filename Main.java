import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Задание 1.1");
            System.out.println("Задание 2.1");
            System.out.println("Задание 3.1");
            System.out.println("Задание 4.1");
            System.out.println("Задание 4.7");
            System.out.println("Задание 5.6");
            System.out.println("Выход 0");
            System.out.println("Выберите номер задания");
            String choice = scanner.next();

            switch (choice){
                case "1.1":
                    System.out.println("Вывод точек каординатной плоскости в текстовой форме");
                    KaordinatePoint point1 = new KaordinatePoint();
                    point1.setX(5);
                    point1.setY(9);
                    KaordinatePoint point2 = new KaordinatePoint();
                    point2.setX(-8);
                    KaordinatePoint point3 = new KaordinatePoint();
                    System.out.println("Первая точка: " + point1);
                    System.out.println("Вторая точка: " + point2);
                    System.out.println("Третья точка: " + point3);
                    break;
                case "2.1":
                    System.out.println("Вывод прямой на плоскости.");
                    StraightLine line1 = new StraightLine(1,3,23,8);
                    System.out.println("1:" + line1);
                    StraightLine line2 = new StraightLine(5, 10, 25, 10);
                    System.out.println("2:" + line2);
                    StraightLine line3 = new StraightLine(line1.getStart(), line2.getEnd());
                    System.out.println("3:" + line3);
                    System.out.println("Изменяем параметры прямых");
                    line1.getStart().setX(12);
                    line1.getStart().setY(32);
                    line1.getEnd().setX(5);
                    line1.getEnd().setY(42);
                    System.out.println("1: " + line1);
                    line2.getStart().setX(-8);
                    line2.getStart().setY(9);
                    line2.getEnd().setX(-8);
                    line2.getEnd().setY(36);
                    System.out.println("2: " + line2);
                    System.out.println("3: " + line3);
                    System.out.println("Изменяем каординаты первой пнрямой, чтобы каординаты второй не изменились");
                    KaordinatePoint line1Start = new KaordinatePoint(3,5);
                    KaordinatePoint line1End = new KaordinatePoint(6,-7);
                    line1 = new StraightLine(line1Start, line1End);
                    System.out.println("1:" + line1);
                    System.out.println("3:" + line3);
                    break;
                case "3.1":
                    System.out.println("Студенты Вася, Петя, Андоей");
                    Student student1 = new Student();
                    Student student2 = new Student(student1);
                    System.out.println(student1);
                    System.out.println(student2);
                    System.out.println("Изменяем первую оценку Васи на 5");
                    student1.getGrades()[0]=5;
                    System.out.println(student1);
                    System.out.println(student2);
                    int[] grades = student1.getGrades();
                    int[] gradesAndrey = new int[grades.length];
                    for(int i = 0; i < grades.length; i++){
                        gradesAndrey[i] = grades[i];
                    }
                    Student student3 = new Student("Андрей", gradesAndrey);
                    System.out.println(student3);
                    student1.getGrades()[1] = 2;
                    System.out.println("Изменяем вторую цоенку Васи на 2");
                    System.out.println(student1);
                    System.out.println(student2);
                    System.out.println(student3);
                    break;
                case "4.1":
                    System.out.println("Точки на плоскости");
                    KaordinatePoint point4 = new KaordinatePoint(3,5);
                    System.out.println("Первая точка на плоскости: " + point4);
                    KaordinatePoint point5 = new KaordinatePoint(25,6);
                    System.out.println("Вторая точка на плоскости: " + point5);
                    KaordinatePoint point6 = new KaordinatePoint(7,8);
                    System.out.println("Третья точка на плоскости " + point6);
                    break;
                case "4.7":
                    System.out.println("Студенты Вася и Максим");
                    Student student4 = new Student("Максим", null);
                    System.out.println(student4);
                    int[] grades1 = {3,4,5,4};
                    Student student5 = new Student("Вася", grades1);
                    System.out.println(student5);
                    break;
                case "5.6":
                    System.out.println("Вывод имение студента, его оценок, среденего балла и является ли он отличником");
                    int[] vasyagrades = {3,4,5,4};
                    Student vasya = new Student("Вася", vasyagrades);
                    int[] petyagrades = {5,5,5,5};
                    Student petya = new Student("Петя", petyagrades);
                    System.out.println(vasya);
                    System.out.println(petya);
                    break;
                case "0":
                    System.out.println("Выход");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор!");

            }
        }
    }
}