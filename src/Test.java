import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = scan.nextInt();

        while ((x * x) < 100) {
            sum += x;
            System.out.println("Podaj X");
            x = scan.nextInt();

        }

        sum = sum%2;
        System.out.println(sum);

    }
}


