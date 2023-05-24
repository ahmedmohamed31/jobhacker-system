import java.io.IOException;
import java.util.Scanner;


class HighestAndPosition {

    public static void main(String[] args) throws IOException {

        int x = 0,y=0,num=0,pos=0;
        Scanner s1 = new Scanner(System.in);

        for(int i=0;i<100;i++){
            if(x>y)
            y=x;
            x= s1.nextInt();
            if(x>y){
                num=x;
                pos=i+1;}
        }
        System.out.printf("%d\n%d\n", num,pos);
    }}
/*
7
55
5
8
4
7

 */


