package _3_Array.Thuc_hanh;

import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        System.out.println("Mời bạn nhập vào fahrenheit: ");
        fahrenheit = Double.parseDouble(sc.nextLine());
        System.out.println("Số fahrenheit sang celcius là: " + fahrenheitToCelcius(fahrenheit));

        System.out.println("Mời bạn nhập vào celcius: ");
        celcius = Double.parseDouble(sc.nextLine());
        System.out.println("Số celcius sang fahrenheit là: " + celciusToFahrenheit(celcius));
    }

    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
