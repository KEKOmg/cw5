import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Zadanie Nr1
        int average[] = new int[10];
        int i;


        for(i = 0; i < average.length; i++)
        {
            average[i] = i + 0;
        }

        for (int num: average)
        {
            System.out.println(num);
        }
        //Zadanie Nr2
        int array[] = new int [99];
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = ((int)(Math.random() * 101));
            System.out.println(array[i]);
        }

        for (int i = 1; i <= 10; i++)
        {
            if (array[i] < min) {
                min = array[i];
            }
            else if(array[i] > max){
                max = array[i];
            }

        }

        System.out.println("min = " +  min);
        System.out.println("max = " + max);

        //Zadanie Nr3
        int N = 10;
        int masiv[][] = new int[N][N];
        int suma = 0;

        for (int i = 0; i < N; i++) {
            masiv[i][i] = (i);

            suma += masiv[i][i];
        }



        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%3d",masiv[i][j]);
            System.out.println();
        }


        System.out.println("Suma: " + suma);

        //Zdadnie Nr4

        String a, b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadż text nr1: ");
        a = scanner.nextLine();

        System.out.println("Wprowadż text nr2: ");
        b = scanner.nextLine();

        String q;
        q = a.concat(b);
        System.out.println(q);

        String s1;
        s1 = b.concat(a);
        System.out.println(s1);

        System.out.println(a.equals(b));

        if (a == b){
            System.out.println(a + " = " + b);
        }
        else{
            System.out.println(a + " != " + b);
        }


    }
}