import java.io.IOException;
import java.util.Scanner;


class ArrayChange {

    public static void main(String[] args) throws IOException {

        int x[] = new int[20];
        Scanner s1 = new Scanner(System.in);
        for(int i=0;i<20;i++){
            x[i]=s1.nextInt();
                             }

        for(int i=0;i<20;i++){
            int temp =0;
            temp=x[19-i];
            x[19-i]=x[i];
            x[i]=temp;
            if (i==9)
                break;}
        for(int i=0;i<20;i++){
            System.out.printf("N[%d] = %d\n", i, x[i]);
    }

    }}