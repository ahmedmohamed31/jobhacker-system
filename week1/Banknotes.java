import java.io.IOException;
import java.util.Scanner;


class Banknotes {

    public static void main(String[] args) throws IOException {
        int array[] = {100, 50, 20, 10, 5, 2, 1};
        int x = 0, y = 0;
        Scanner s1 = new Scanner(System.in);
        x = s1.nextInt();
        y = x;
        for (int i = 0; i < 7; i++) {
            if (i > 0) {
                x = y - (x * array[i - 1]);
                y = x;
            }
            x /= array[i];
            System.out.printf("%d nota(s) de R$ %d\n", x, array[i]);
        }

    }
}
