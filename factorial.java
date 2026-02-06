import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        int number, factorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        sc.close();
    }
}
