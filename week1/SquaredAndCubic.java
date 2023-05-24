import java.io.IOException;
import java.util.Scanner;


class SquaredAndCubic {

    public static void main(String[] args) throws IOException {

        int x = 0;

        Scanner s1 = new Scanner(System.in);
        x=s1.nextInt();
        for(int i=1;i<=x;i++){

            System.out.printf("%d %d %d\n",i,i*i,i*i*i);

        }

    }}