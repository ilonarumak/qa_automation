package Task16;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        double celsius = in.nextDouble();

        CelsiusToKelvinConverter celsiusToKelvin = new CelsiusToKelvinConverter();
        double kelvinResult = celsiusToKelvin.convert(celsius);

        CelsiusToFahrenheitConverter celsiusToFahrenheit = new CelsiusToFahrenheitConverter();
        double fahrenheitResult = celsiusToFahrenheit.convert(celsius);

        System.out.printf("%.2f\u2103 = %.2fK = %.2f\u2109.", celsius, kelvinResult, fahrenheitResult);
    }
}
