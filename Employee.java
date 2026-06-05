public class Employee {
    // Instance variable
    double basicSalary;

    void calculateSalary() {
        // Local variable
        double bonus = 5000;

        double totalSalary = basicSalary + bonus;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.basicSalary = 30000;

        emp.calculateSalary();
    }
}