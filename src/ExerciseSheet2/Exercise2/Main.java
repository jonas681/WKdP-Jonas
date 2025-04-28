package ExerciseSheet2.Exercise2;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Anna", "Muster", 30);
        System.out.println("Person Info: " + p1.getInfo());


        Student s1 = new Student("Ben", "Beispiel", 22, 123456, 3);
        s1.addCourse("Programmieren 1");
        s1.addCourse("Mathematik 2");
        System.out.println("Student Info: " + s1.getInfo());
        System.out.println("Kursliste: " + s1.printCourseList());


        PhDStudent phd1 = new PhDStudent("Clara", "Doktor", 28, 654321, 6, "KI in der Robotik");
        phd1.addCourse("Forschungskolloquium");
        System.out.println("PhDStudent Info: " + phd1.getInfo());
    }
}
