package Facade_Pattern;

public class HomeTheatreFacade {
	Amplifier amp;
	Lights light;
	Projector proj;
	Dvd dvd;

	public HomeTheatreFacade(Amplifier amp, Lights light, Projector proj,
			Dvd dvd) {
		this.amp = amp;
		this.light = light;
		this.proj = proj;
		this.dvd = dvd;
	}

	public void watchMovie(Dvd dvd) {
		System.out.println("Getting ready to watch movie..");
		light.dim(10);
		amp.on();
		proj.on();
		dvd.setDvd(dvd);
	}

	public void endMovie() {
		// Turn off all the equipments
		System.out.println("\nMovie ended ....Every thing turned off");
	}

}
