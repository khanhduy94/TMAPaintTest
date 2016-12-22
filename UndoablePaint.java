package GUI;

import java.util.List;

import javax.swing.undo.AbstractUndoableEdit;

public class UndoablePaint extends AbstractUndoableEdit {
 
 protected List<Shape> listShap;
 protected Shape shape;
 
 public UndoablePaint(List<Shape> listShap, Shape shape) {
  this.listShap = listShap;
  this.shape = shape;
 }
 
 @Override
 public void undo() {
  
  if (!listShap.isEmpty()) {
   super.undo();
   listShap.remove(shape);
  }
 }
 
 @Override
 public void redo() {
  super.redo();
  listShap.add(shape);
 }

}