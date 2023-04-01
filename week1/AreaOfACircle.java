import java.util.Scanner;

class Areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = pi * radius * radius;

        System.out.printf("A=%.4f\n", area);
    }
}
