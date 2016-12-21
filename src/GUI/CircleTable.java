package GUI;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CircleTable extends AbstractTableModel {

 String[] columnNames = {"Position", "Radius"};
 Object[][] data;
 
 public CircleTable(List<Shap> list) {
  
  int length = 0;
  for (int i = 0; i < list.size(); i++) {
   if ("circle".equals(list.get(i).getType())) {
    length++;
   }
  }
  data = new Object[length][2];
  int i = 0;
  for (Shap shap : list) {
   if (shap.getType().equals("circle")) {
    data[i][0] = "(" + shap.getX() + ", " + shap.getY() + ")";
    data[i][1] = shap.getRadius();
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