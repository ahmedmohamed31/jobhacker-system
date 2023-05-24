import java.io.IOException;
import java.util.Scanner;


class ArrayFill {

    public static void main(String[] args) throws IOException {

        int x[] = new int[1000];
        Scanner s1 = new Scanner(System.in);

        int y=s1.nextInt();
        int z=0;
        for(int i=0;i<=y;i++) {

            if(i==y){
               i=0;
            }
            x[z]= i;
            if(z==999)
                break;
            z++;
        }


        for(int i=0;i<1000;i++){
            System.out.printf("N[%d] = %d\n", i, x[i]);
        }

    }}