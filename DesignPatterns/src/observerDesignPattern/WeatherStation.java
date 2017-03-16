package observerDesignPattern;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay1 = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);
		
		currentDisplay1.display();
		
		currentDisplay2.display();
		
		weatherData.setMeasurements(80, 65, 20.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}
