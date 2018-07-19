import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 0;

        while (x < 100) {

            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println(x + " " + "FizzBuzz");

            } else if (x % 3 == 0) {
                System.out.println(x + " " + "Fizz");

            } else if (x % 5 == 0) {
                System.out.println(x + " " + "Buzz");

            }

            x++;
        }


    }
}


