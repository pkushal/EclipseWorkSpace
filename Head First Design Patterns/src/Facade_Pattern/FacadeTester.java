package Facade_Pattern;

/**
 * Facade Pattern provides a simplified interface while still exposing the full
 * functionality of the system to those who may need it. It doesn't encapsulates
 * the subsystem classes.
 * 
 * Suppose I want to watch movie in a DVD. Without facade pattern, to watch a
 * movie I will need make sure lights are dim, projector is on, wide screen mode
 * is selected on the projector, pop corn is there, surround sound is there.
 * That's a lot a work. What facade pattern does is it will make a facade class
 * and I will only have to call only one method, say, watchmovie() and it will
 * do all those work, making it simple.
 * 
 * Facade not only simplifies an interface it also decouples a client from the
 * subsystem of components. Facade and adaptor may wrap multiple classes,
 * facade's intent is to simplify but the intent of adaptor is to convert the
 * interface to something different
 * 
 * The first step in the facade pattern is to implement the composition
 * behaviour that the subsystem is going to have. After that we will delegate
 * the specific task to the specific components.
 * 
 * We can upgrade the home theatre without affecting the client.
 * 
 * @author Kushal
 * 
 */
public class FacadeTester {
	public static void main(String[] args) {
		Lights light = new Lights();
		Projector proj = new Projector();
		Amplifier amp = new Amplifier();
		Dvd dvd = new Dvd("Pursuit of Happyness");

		HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, light, proj,
				dvd);
		homeTheatre.watchMovie(dvd);
		homeTheatre.endMovie();

	}
}
