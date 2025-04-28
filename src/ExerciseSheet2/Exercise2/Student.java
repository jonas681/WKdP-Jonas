package ExerciseSheet2.Exercise2;

import java.util.ArrayList;

public class Student extends Person {
    private int matNumber;
    private int semester;

    private ArrayList<String> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int age, int matNumber, int semester) {
        super(firstName, lastName, age);
        this.matNumber = matNumber;
        this.semester = semester;


    }
    public void addCourse(String course) {
        courses.add(course);

    }

    public String printCourseList() {
        return courses.toString();
    }
    public String getInfo(){
      return super.getInfo() + courses.toString();
    }
}
