
public class TemperatureConverter {
	/**
	 * This function converts a fahrenheit temperature to celsius
	 * @param fahr the temperature in fahrenheit
	 * @return the temperature in celsius
	 */
	public double convertToCelsius(double fahr) {
		double celsius = (fahr - 32) * 5/9.0;
		return celsius;
	}
    /**
     * This function converts a celsius temperature to fahrenheit
     * @param celsius the temperature in celsius
     * @return the temperature in fahrenheit
     */
	public double convertToFahrenheit(double celsius) {
		double fahr = 9.0/5*celsius + 32;
		return fahr;
	}	
}