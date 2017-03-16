package observerDesignPatternWithObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current consitions: " + temperature + " " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData)
		{
			WeatherData w = (WeatherData) o;
			this.temperature = w.getTemperature();
			this.humidity = w.getHumidity();
			display();
		}
	}

	

}
