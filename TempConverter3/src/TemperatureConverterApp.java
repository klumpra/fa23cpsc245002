import java.util.Scanner;

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