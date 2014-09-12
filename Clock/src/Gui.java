import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Gui {
	private JFrame mainFrame;
	private JLabel header;

	public Gui() {
		makeGui();
	}

	private void makeGui() {
		mainFrame = new JFrame("Analog Clock");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		Clock icon = new Clock();
		header = new JLabel(icon);
		mainFrame.add(header);
		mainFrame.pack();
		mainFrame.setVisible(true);

		Timer timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.repaint();

			}
		});
		timer.start();

	}
}
