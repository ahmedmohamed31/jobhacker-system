import java.io.IOException;
import java.util.Scanner;


class Multiples {

    public static void main(String[] args) throws IOException {

        int x = 0, y = 0;
        Scanner s1 = new Scanner(System.in);
        x = s1.nextInt();
        y = s1.nextInt();
        if (x>y) {
            if(x%y==0)
            System.out.printf("Sao Multiplos\n");
            else
            System.out.printf("Nao sao Multiplos\n");

        }
        else if (y>x) {
            if(y%x==0)
                System.out.printf("Sao Multiplos\n");
            else
                System.out.printf("Nao sao Multiplos\n");

        }
        else
            System.out.printf("Sao Multiplos\n");

        }

    }
