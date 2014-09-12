import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ZombieTableModel extends AbstractTableModel {

	private List<String[]> values = new ArrayList<String[]>();
	private String[] columns = { "S.N.", "Description", "Values" };

	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return values.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		if(col == 0) return String.valueOf(row + 1);
		return values.get(row)[col - 1];
	}

	@Override
	public String getColumnName(int i) {
		return columns[i];
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int i) {
		return String.class;
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		if (row >= values.size()) {
			values.add(new String[2]);
		}
		values.get(row)[col] = (String) value;
		fireTableDataChanged();
	}
	
	public void addTable(Object value1, Object value2) {
		int row = getRowCount();
		setValueAt(value1, row, 0);
		setValueAt(value2, row, 1);
	}

}
