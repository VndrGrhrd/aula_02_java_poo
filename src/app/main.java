package app;

import entiti.Calculate;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculate.circufence(radius));
        System.out.printf("Volume: %.2f%n", Calculate.volume(radius));
        System.out.printf("PI value: %.2f%n", Calculate.PI);

        input.close();
    }
}
