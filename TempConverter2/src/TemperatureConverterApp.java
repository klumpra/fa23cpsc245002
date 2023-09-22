
import java.util.Scanner;

class TemperatureConverter {
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

/**
 * This application converts between temperature scales
 */
public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature and the scale: ");
		double temperature,converted;
		String scale;
		temperature = sc.nextDouble();
		scale = sc.next().toUpperCase();
		TemperatureConverter tc = new TemperatureConverter();
		if (scale.equals("F")) {
			converted = tc.convertToCelsius(temperature);
		} else if (scale.equals("C")) {
			converted = tc.convertToFahrenheit(temperature);
		} else {
			converted = 0;
		}
		System.out.printf("The temperature is %.2f.\n",converted);
	}
}
