public class Overloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading calculator = new Overloading();

        // Calling the add method with two integers
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);

        // Calling the add method with three integers
        int sum2 = calculator.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum2);

        // Calling the add method with two doubles
        double sum3 = calculator.add(2.5, 3.5);
        System.out.println("Sum of 2.5 and 3.5: " + sum3);
    }
}
