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
                    kaordinatePoint point1 = new kaordinatePoint(5, 25);
                    kaordinatePoint point2 = new kaordinatePoint(-3,4);
                    kaordinatePoint point3 = new kaordinatePoint();
                    System.out.println("Первая точка: " + point1);
                    System.out.println("Вторая точка: " + point2);
                    System.out.println("Третья точка: " + point3);
                    break;
                case "2.1":
                    System.out.println("Вывод прямой на плоскости.");
                    straightLine line1 = new straightLine(1,3,23,8);
                    System.out.println("1:" + line1);
                    straightLine line2 = new straightLine(5, 10, 25, 10);
                    System.out.println("2:" + line2);
                    straightLine line3 = new straightLine(line1.getStart(), line2.getEnd());
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
                    line1.getEnd().setX(17);
                    line1.getEnd().setY(56);
                    System.out.println("1:" + line1);
                    System.out.println("3:" + line3);
                    break;
                case "3.1":
//                    System.out.println("Студенты Вася, Петя, Андоей");
//                    student student1 = new student();
//                    student student2 = new student(student1);
//                    System.out.println(student1);
//                    System.out.println(student2);
//                    System.out.println("Изменяем первую оценку Васи на 5");
//                    student1.getGrades()[0]=5;
//                    System.out.println(student1);
//                    System.out.println(student2);
//                    int[] grades = student1.getGrades();
//                    int[] gradesAndrey = new int[grades.length];
//                    for(int i = 0; i < grades.length; i++){
//                        gradesAndrey[i] = grades[i];
//                    }
//                    student student3 = new student("Андрей", gradesAndrey);
//                    System.out.println(student3);
//                    student1.getGrades()[1] = 2;
//                    System.out.println("Изменяем вторую цоенку Васи на 2");
//                    System.out.println(student1);
//                    System.out.println(student2);
//                    System.out.println(student3);
//                    break;
                case "4.1":
                    System.out.println("Точки на плоскости");
                    kaordinatePoint point4 = new kaordinatePoint(3,5);
                    System.out.println("Первая точка на плоскости: " + point4);
                    kaordinatePoint point5 = new kaordinatePoint(25,6);
                    System.out.println("Вторая точка на плоскости: " + point5);
                    kaordinatePoint point6 = new kaordinatePoint(7,8);
                    System.out.println("Третья точка на плоскости " + point6);
                    break;
                case "4.7":
                    System.out.println("Студенты Вася и Максим");
                    student student4 = new student("Максим", null);
                    System.out.println(student4);
                    int[] grades1 = {3,4,5};
                    student student5 = new student("Вася", grades1);
                    System.out.println(student5);
                    break;
                case "5.6":
                    System.out.println("Вывод имение студента, его оценок, среденего балла и является ли он отличником");
                    int[] vasyagrades = {3,4,5,4};
                    student vasya = new student("Ва6ся", vasyagrades);
                    int[] petyagrades = {5,5,5,5};
                    student petya = new student("Петя", petyagrades);
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