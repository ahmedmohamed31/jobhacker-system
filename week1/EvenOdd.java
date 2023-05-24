import java.io.IOException;
import java.util.Scanner;


class EvenOdd {

    public static void main(String[] args) throws IOException {
        int array[]=new int[5];
        int pcounter=0,ncounter=0,evencounterr=0,oddcounterr=0;
        Scanner s1 = new Scanner(System.in);

        for (int i=0;i<5;i++){
            array[i] = s1.nextInt();
            if(array[i]>0)
                pcounter++;
            if(array[i]<0)
                ncounter++;
            if(array[i]%2==0)
                evencounterr++;
            if(array[i]%2!=0)
                oddcounterr++;
                             }

        System.out.printf("%d valor(es) par(es)%n", evencounterr);
        System.out.printf("%d valor(es) impar(es)%n", oddcounterr);
        System.out.printf("%d valor(es) positivo(s)%n", pcounter);
        System.out.printf("%d valor(es) negativo(s)%n", ncounter);
}
}
























