package GUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CircleTable extends AbstractTableModel {
	
	private static final long serialVersionUID = 7531737054979827467L;
	String[] columnNames = {"X","Y", "Radius"};
	ArrayList<Object[]> data;
	
	
	public CircleTable(){
		this.data= new ArrayList<>();
	}   
	@Override
	public int getRowCount() {
		return data.size();
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data.get(rowIndex)[columnIndex] ;
	}
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}
	public void addtbCircle(int x,int y,int radius){
		Object[] o =new Object[]{x,y,radius};
		data.add(o);
	}
	public Object[] deletetbCircle(int rowIndex){
		Object[] o=data.remove(rowIndex);
		return o;
	}
}