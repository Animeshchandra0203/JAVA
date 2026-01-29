import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print("*");
            for (int space = 0; space <= n - 1 - i; space++)
                System.out.print(" ");

            System.out.print("*");

            for (int s = 0; s <= 2 * i - 1; s++)
                System.out.print(" ");

            System.out.print("*");

            for (int s = 0; s < n - i; s++)
                System.out.print(" ");

            System.out.print("*");

            System.out.println("");

        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int space = 0; space <= n - 1 - i; space++)
                System.out.print(" ");

            System.out.print("*");

            for (int s = 0; s <= 2 * i - 1; s++)
                System.out.print(" ");

            System.out.print("*");

            for (int s = 0; s < n - i; s++)
                System.out.print(" ");

            System.out.print("*");

            System.out.println("");

        }

        sc.close();
    }
}
