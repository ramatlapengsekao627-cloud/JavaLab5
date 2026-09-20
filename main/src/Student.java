/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 7*/

/*Write a class called Student with private fields
name (String), age (int), and gpa (double), a constructor, and a getter for each field.*/

public class Student {
    private String name;
    private int age;
    private double gpa;

    // constructor sets all three fields
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // getter for gpa
    public double getGpa() {
        return gpa;
    }
}
