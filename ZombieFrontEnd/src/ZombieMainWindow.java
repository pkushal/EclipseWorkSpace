import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

@SuppressWarnings("serial")
public class ZombieMainWindow extends JFrame implements TableModelListener {

	JTable table;

	JScrollPane scrollPane;

	/*
	 * Constructor
	 */
	public ZombieMainWindow(ZombieTableModel model) {
		super("Parameters Summary");
		initialize(model);
	}

	private void initialize(ZombieTableModel model) {
		setSize(300, 300);

		model.addTableModelListener(this);
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		setLayout(new BorderLayout());
		add(table.getTableHeader(), BorderLayout.PAGE_START);
		add(scrollPane, BorderLayout.CENTER);
	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		repaint();
	}

}
