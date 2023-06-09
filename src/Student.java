import java.util.ArrayList;

public class Student {

    private String name;

    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void increaseAge(ArrayList<Student> students){
        for (Student student : students){
            if(student.getName().length() > 4){
                student.setAge(student.getAge() + 4);
            }
        }
    }


    public static void removeAdult(ArrayList<Student> students){
        students.removeIf(student -> student.getAge() > 18);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
