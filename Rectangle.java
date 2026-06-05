public class Rectangle {
    // Instance variables
    int length;
    int breadth;

    void findArea() {
        // Local variable
        int area = length * breadth;

        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.findArea();
    }
}