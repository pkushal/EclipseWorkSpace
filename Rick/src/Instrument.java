
public class Instrument {
	private String serial;
	private double price;
	private InstrumentSpec spec;

	public Instrument(String serial, double price, InstrumentSpec spec) {
		this.serial = serial;
		this.price = price;
		this.spec = spec;
	}

	public String getSerial() {
		return serial;
	}

	public double getPrice() {
		return price;
	}

	public InstrumentSpec getSpec() {
		return spec;
	}

	@Override
	public String toString() {
		return "Instrument [serial=" + serial + ", price=" + price + ", spec="
				+ spec + ", getSerial()=" + getSerial() + ", getPrice()="
				+ getPrice() + ", getSpec()=" + getSpec() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
