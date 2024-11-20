public class MathOperations {

    // Function to calculate the square of a number
    public static double square(double number) {
        return number * number;
    }

    // Function to calculate the square root of a number
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Function to calculate the cube of a number
    public static double cube(double number) {
        return number * number * number;
    }

    // Function to calculate the cube root of a number
    public static double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public static void main(String[] args) {
        double number = 8.0;

        System.out.println("Number: " + number);
        System.out.println("Square: " + square(number));
        System.out.println("Square Root: " + squareRoot(number));
        System.out.println("Cube: " + cube(number));
        System.out.println("Cube Root: " + cubeRoot(number));
    }
}