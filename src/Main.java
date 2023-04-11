import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Valera", 16);
        Student student2 = new Student("John", 19);
        Student student3 = new Student("Ekaterina", 15);
        Student student4 = new Student("Lisa", 18);
        Student student5 = new Student("Sven", 18);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        ///////////////////////////////// проверка работы increaseAge //////////////////////////////////

        // список студней до манипуляций
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        Student.increaseAge(students);

        // список студней после манипуляций
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////// проверка работы removeAdult //////////////////////////////////

        // список студней до манипуляций
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        students = Student.removeAdult(students);

        // список студней после манипуляций
        for (Student student : students) {
            System.out.println(student.toString());
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////

    }

}
