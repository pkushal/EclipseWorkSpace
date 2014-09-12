import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {

	private Map properties;

	public InstrumentSpec(Map properties) {
		if (properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);
		}
	}

	public boolean matches(InstrumentSpec specs) {

		for (Object obj : specs.getProperties().keySet()) {
			String prop = (String) obj;
			if (!specs.getprop(prop).equals(properties.get(prop))) {
				return false;
			}
		}
		return true;
	}

	public Map getProperties() {
		return properties;
	}

	public Object getprop(String propertyName) {
		return properties.get(propertyName);
	}

}
