import java.io.IOException;
import java.util.Scanner;


class LineInArray {

    public static void main(String[] args) throws IOException {

        float x[][] = new float[12][12];
        Scanner s1 = new Scanner(System.in);

        int y=s1.nextInt();
        char SorM=s1.next().charAt(0);

        for(int i=0;i<12;i++) {
            for(int j=0;j<12;j++)
                {
                  x[i][j]= s1.nextFloat();
                }
        }
        float sum=0;


        for(int i=0;i<12;i++)
            sum +=x[y][i];
        if (SorM=='M')
            sum=sum/12;

    System.out.printf("%.1f\n",sum);}}