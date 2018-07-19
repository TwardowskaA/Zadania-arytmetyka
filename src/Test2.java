import java.util.Random;

public class Test2 {

    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random rand = new Random();

            double suma = 0;

        for (int i = 0; i < tablica.length ; i++) {
            tablica[i] = rand.nextInt(100);
            System.out.println(tablica[i]);

            suma = suma + tablica[i];

        }

        double srednia = suma/tablica.length;
        System.out.println("Srednia liczb wynosi:" + " " + srednia);

        double mniejszasum = 0;
        double wiekszasum = 0;

        for (int i = 0; i < tablica.length ; i++) {

            if(tablica[i] < srednia )
            mniejszasum = mniejszasum + tablica[i];

            if(tablica[i] > srednia)
            wiekszasum = wiekszasum + tablica[i];
        }

        System.out.println("Suma liczb mniejszych od średniej wynosi" + " " + mniejszasum);
        System.out.println("Suma liczb większych od średniej wynosi" + " " + wiekszasum);


    }

}
