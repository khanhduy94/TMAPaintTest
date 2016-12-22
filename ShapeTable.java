package GUI;

import javax.swing.table.AbstractTableModel;

public abstract  class ShapeTable extends AbstractTableModel {
	
	public abstract void addtb(Object[] o );
	public abstract Object[] deletetb(int rowIndex);	
	public abstract int getColumnCount() ;	
	public abstract int getRowCount() ;	
	public abstract Object getValueAt(int rowIndex, int columnIndex);

}
