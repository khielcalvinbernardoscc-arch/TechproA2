class ShapeAreaCalculator {
    // Calculate area of a square (int side length)
    public int calculateArea(int side) {
        return side * side;
    }

    // Overloaded method to calculate area of a rectangle (double length and width)
    public double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Main method added to the same class
    public static void main(String[] args) {
        ShapeAreaCalculator calc = new ShapeAreaCalculator();

        System.out.println(calc.calculateArea(5));        // Square: 25
        System.out.println(calc.calculateArea(4.5, 2.0)); // Rectangle: 9.0
    }
}
