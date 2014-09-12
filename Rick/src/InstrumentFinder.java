import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstrumentFinder {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.MARTIN);
		properties.put("topWood", Wood.MAHOGANY);
		InstrumentSpec whatKushalLikes = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(whatKushalLikes);
		if (!matchingInstruments.isEmpty()) {
			for (Object ins : matchingInstruments) {
				Instrument instrument = (Instrument) ins;
				System.out.println("We have " + instrument.getSpec().getProperties().get("instrumentType")
						+ " to match your requirement.");
				for (Object propertyName : instrument.getSpec().getProperties()
						.keySet()) {
					String prop = (String) propertyName;
					System.out.println(prop + " : "
							+ instrument.getSpec().getprop(prop));
				}
				System.out.println("It will cost $" + instrument.getPrice()
						+ " only and its serial number is "
						+ instrument.getSerial());
			}
		} else {
			System.out.println("Sorry No matching Instruments found !!");
		}

	}

	public static void initializeInventory(Inventory inventory) {
	    Map properties = new HashMap();
	    properties.put("instrumentType", InstrumentType.GUITAR);
	    properties.put("builder", Builder.COLLINGS);
	    properties.put("model", "CJ");
	    properties.put("type", Type.ACOUSTIC);
	    properties.put("numStrings", 6);
	    properties.put("topWood", Wood.INDIAN_ROSEWOOD);
	    properties.put("backWood", Wood.SITKA);
	    inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.MARTIN);
	    properties.put("model", "D-18");
	    properties.put("topWood", Wood.MAHOGANY);
	    properties.put("backWood", Wood.ADIRONDACK);
	    inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.FENDER);
	    properties.put("model", "Stratocastor");
	    properties.put("type", Type.ELECTRIC);
	    properties.put("topWood", Wood.ALDER);
	    properties.put("backWood", Wood.ALDER);
	    inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
	    inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
	 
	    properties.put("builder", Builder.GIBSON);
	    properties.put("model", "Les Paul");
	    properties.put("topWood", Wood.MAPLE);
	    properties.put("backWood", Wood.MAPLE);
	    inventory.addInstrument("70108276", 2295.95, 
	      new InstrumentSpec(properties));

	    properties.put("model", "SG '61 Reissue");
	    properties.put("topWood", Wood.MAHOGANY);
	    properties.put("backWood", Wood.MAHOGANY);
	    inventory.addInstrument("82765501", 1890.95, 
	      new InstrumentSpec(properties));

	    properties.put("instrumentType", InstrumentType.MANDOLIN);
	    properties.put("type", Type.ACOUSTIC);
	    properties.put("model", "F-5G");
	    properties.put("backWood", Wood.MAPLE);
	    properties.put("topWood", Wood.MAPLE);
	    properties.remove("numStrings");
	    inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

	    properties.put("instrumentType", InstrumentType.BANJO);
	    properties.put("model", "RB-3 Wreath");
	    properties.remove("topWood");
	    properties.put("numStrings", 5);
	    inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	  }
}
