package Task15;

public class CelsiusToKelvinConverter implements Converter {
    private static final double CONVERSION_SHIFT = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius + CONVERSION_SHIFT;
    }
}
