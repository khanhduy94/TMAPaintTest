package GUI;

import java.util.ArrayList;

public class CircleTable extends ShapeTable {
	
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
	public void addtb(Object[] o ){		
		data.add(o);
	}
	public Object[] deletetb(int rowIndex){
		Object[] o=data.remove(rowIndex);
		return o;
	}
}