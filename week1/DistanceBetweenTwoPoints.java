import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

class DistanceBetweenTwoPoints {

    public static void main(String[] args) throws IOException {
        float x1, y1, x2, y2;
        Scanner s1 = new Scanner(System.in);

        x1 = s1.nextFloat();
        y1 = s1.nextFloat();
        x2 = s1.nextFloat();
        y2 = s1.nextFloat();
        System.out.printf("%f\n", Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }
}
