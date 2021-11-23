package Task16;

public class CelsiusToKelvinConverter extends AbstractConverter {
    private static final double CONVERSION_SHIFT = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius + CONVERSION_SHIFT;
    }
}
