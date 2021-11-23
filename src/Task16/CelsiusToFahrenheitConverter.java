package Task16;

public class CelsiusToFahrenheitConverter extends AbstractConverter {
    private static final int CONVERSION_SHIFT = 32;
    private static final double CONVERSION_COEFFICIENT = 1.8;

    @Override
    public double convert(double celsius) {
        return celsius * CONVERSION_COEFFICIENT + CONVERSION_SHIFT;
    }
}
