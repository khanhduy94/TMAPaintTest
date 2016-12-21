package GUI;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class RectangleTable extends AbstractTableModel {

 String[] columnNames = {"Position", "Width", "Height"};
 Object[][] data;
 
 public RectangleTable(List<Shap> list) {
  int length = 0;
  for (int i = 0; i < list.size(); i++) {
   if ("rectangle".equals(list.get(i).getType())) {
    length++;
   }
  }
  data = new Object[length][3];
  int i = 0;
  for (Shap shap : list) {
   if ("rectangle".equals(shap.getType())) {
    data[i][0] = "(" + shap.getX() + ", " + shap.getY() + ")";
    data[i][1] = shap.getWidth();
    data[i][2] = shap.getHeight();
    i++;
   }
  }
 }
 
 @Override
 public int getRowCount() {
  return data.length;
 }

 @Override
 public int getColumnCount() {
  return columnNames.length;
 }

 @Override
 public Object getValueAt(int rowIndex, int columnIndex) {
  return data[rowIndex][columnIndex];
 }
 
 public String getColumnName(int col) {
  return columnNames[col];
 }

}