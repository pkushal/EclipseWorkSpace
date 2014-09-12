package Facade_Pattern;

public class Dvd {
	public String name;

	public Dvd(String dvd) {
		this.name = dvd;
	}

	public String toString() {
		return name;
	}

	public void setDvd(Dvd dvd) {
		System.out.println("Movie " + dvd + " found and playing now...");
	}
}
