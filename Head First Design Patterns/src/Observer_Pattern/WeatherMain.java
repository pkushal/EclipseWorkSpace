package Observer_Pattern;

public class WeatherMain {
	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		CurrentWeather cw = new CurrentWeather(weather);
		ForecastWeather fw = new ForecastWeather(weather);

		weather.setMeasurement(1, 2, 3);
		weather.setMeasurement(4, 5, 6);
		weather.setMeasurement(7, 8, 9);
		weather.setMeasurement(10, 11, 12);
	}
}
