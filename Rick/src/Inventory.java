import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serial, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serial, price, spec);
		inventory.add(instrument);
	}

	public List search(InstrumentSpec whatKushalLikes) {
		List matchedList = new LinkedList();
		for (Object obj : inventory) {
			Instrument ins = (Instrument) obj;
			if (ins.getSpec().matches(whatKushalLikes)) {
				matchedList.add(ins);
			}
		}
		return matchedList;
	}
}
