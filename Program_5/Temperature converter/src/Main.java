import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.print(" convert to Celsius or Fahrenheit ? (C or F) : ");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf(" %.1f°",newtemp,unit);

        scanner.close();
    }
}
