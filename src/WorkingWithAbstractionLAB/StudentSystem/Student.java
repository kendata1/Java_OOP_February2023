package WorkingWithAbstractionLAB.StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {

        String studentType = "Very nice person.";

        if(getGrade() >= 5.00){
            studentType = "Excellent student.";
        }else if(getGrade()< 5.00 && getGrade() >= 3.50) {
            studentType = "Average student.";
        }

        return String.format("%s is %d years old. %s",getName(),getAge(),studentType);
    }
}
