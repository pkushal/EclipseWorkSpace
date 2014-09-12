import javax.swing.JFrame;


public class ZombieAlgorithm {
	
	ZombieTableModel model;
	
	
	public ZombieAlgorithm(ZombieTableModel model){
		this.model = model;
	}

	public static void main(String[] args) {
		ZombieTableModel model = new ZombieTableModel();;
			
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		model.addTable("UAB", "BEC");
		model.addTable("Kushal", "Pradhan");
		
		ZombieMainWindow window = new ZombieMainWindow(model);
		//ZombieAlgorithm algorithm = new ZombieAlgorithm(model);
		window.setSize(500, 500);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		
	 }

	public ZombieTableModel getModel() {
		//TODO implement faster algorithm
		return model;
	}

	public void setModel(ZombieTableModel model) {
		this.model = model;
	}

}
