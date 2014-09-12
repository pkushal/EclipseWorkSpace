package Observer_Pattern;

public class ForecastWeather implements Observer, DisplayElement {
	private int temp;
	private int pressure;
	private int humidity;
	private Subject sub;

	public ForecastWeather(Subject w) {
		this.sub = w;
		sub.addObserver(this);
	}

	@Override
	public void update(int temp, int pressure, int humidity) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("This is the display from Forecast display: ");
		System.out.println("The temp: " + temp + " and pressure :" + pressure
				+ " and humidity :" + humidity);
	}
}