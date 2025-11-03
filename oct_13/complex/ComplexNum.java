public class ComplexNum {
    private double real;
    private double imaginary;

    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNum add(ComplexNum other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNum(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(5, 4);
        ComplexNum num2 = new ComplexNum(7, 2);

        ComplexNum sum = num1.add(num2);

        System.out.println("Complex Number 1: " + num1);
        System.out.println("Complex Number 2: " + num2);
        System.out.println("Sum of Complex Numbers: " + sum);
    }
}
