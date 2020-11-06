package primitive_data_types_and_operators;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the temperature in Celsius degrees: ");
        float degreesCelsius = scanner.nextFloat();

        //double Fahrenheit = 1.8 * degreesCelsius + 32.0;
        float Fahrenheit = 1.8F * degreesCelsius + 32.0F;
        System.out.println("The temperature in Fahrenheit degrees is: " + Fahrenheit);

    }
}
