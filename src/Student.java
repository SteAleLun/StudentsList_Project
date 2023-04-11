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

    public static ArrayList<Student> removeAdult(ArrayList<Student> students){

        ArrayList<Student> getStudents = new ArrayList<>();

        for (Student student : students){
            if(student.getAge() <= 18){
                getStudents.add(student);
            }
        }
        return getStudents;
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
