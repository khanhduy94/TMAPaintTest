package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class RectangleTable extends AbstractTableModel {

 String[] columnNames = {"X","Y", "Width", "Height"};
 ArrayList<Object[]> data;
 
 public RectangleTable() {
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
  return data.get(rowIndex)[columnIndex];
 }
 
 public String getColumnName(int col) {
  return columnNames[col];
 }
 public void addtbRect(int x,int y,int Width, int Height){
		Object[] o =new Object[]{x,y,Width,Height};
		data.add(o);
	}
 public Object[] deletetbRect(int rowIndex){
		Object[] o=data.remove(rowIndex);
		return o;
	}
}