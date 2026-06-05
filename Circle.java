public class Circle {
    // Instance variable
    double radius;

    void calculateArea() {
        // Local variable
        double pi = 3.14;

        double area = pi * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 7;

        c.calculateArea();
    }
}