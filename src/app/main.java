package app;

import entiti.Calculate;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius; ");
        double radius = input.nextDouble();

        Calculate c = new Calculate();
        System.out.printf("Circunferencia: %.2f%n", c.circufence(radius));
        System.out.printf("Volume: %.2f%n", c.volume(radius));
        System.out.printf("PI value: %.2f%n", c.PI);

        input.close();
    }
}
