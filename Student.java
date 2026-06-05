class Student {
    // Instance variables
    String name;
    int rollNo;

    void display() {
        // Local variable
        String college = "ABC Engineering College";

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Raj";
        s.rollNo = 101;

        s.display();
    }
}