package Observer_Pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private int temp;
	private int pressure;
	private int humidity;
	private ArrayList<Observer> list;

	public WeatherData() {
		list = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		list.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < list.size(); i++) {
			Observer obs = list.get(i);
			obs.update(temp, pressure, humidity);
		}
	}

	public void measurementChange() {
		notifyObserver();
	}

	public void setMeasurement(int temp, int pressure, int humidity) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChange();
	}
}
