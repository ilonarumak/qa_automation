package Task15;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        double celsius = in.nextDouble();

        Converter celsiusToKelvin = new CelsiusToKelvinConverter();
        double kelvinResult = celsiusToKelvin.convert(celsius);

        Converter celsiusToFahrenheit = new CelsiusToFahrenheitConverter();
        double fahrenheitResult = celsiusToFahrenheit.convert(celsius);

        System.out.printf("%.2f \u2103 = %.2f K = %.2f \u2109.", celsius, kelvinResult, fahrenheitResult);
    }
}
