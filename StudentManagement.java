public class OOPDemo {

    public static void main(String[] args) {

        // Array
        int[] marks = {85, 72, 90, 65, 78};

        System.out.println("Student Marks:");

        // Loop and Condition
        for (int mark : marks) {
            if (mark >= 75) {
                System.out.println(mark + " - Pass");
            } else {
                System.out.println(mark + " - Fail");
            }
        }

        // Creating objects
        Student student1 = new Student("John", 20, "Computer Science");
        Student student2 = new Student("Emma", 21, "Information Technology");

        // Using setters (Encapsulation)
        student1.setAge(22);

        System.out.println("\nStudent Details:");
        student1.displayInfo();
        System.out.println();

        student2.displayInfo();

        // Polymorphism
        System.out.println("\nPolymorphism Example:");
        Person person = new Student("David", 19, "Software Engineering");
        person.displayInfo();
    }
}

// Parent Class
class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class (Inheritance)
class Student extends Person {

    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + course);
    }
}
