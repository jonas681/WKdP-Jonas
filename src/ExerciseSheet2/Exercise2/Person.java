package ExerciseSheet2.Exercise2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getInfo(){
        return firstName + " " + lastName + " " + age;
    }
}
