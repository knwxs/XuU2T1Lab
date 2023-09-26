public class Student {

    private String name;
    private int age;

    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    public void introduce() {
        System.out.print("My name is "+name+". I am "+age+" years old.");
    }
}
