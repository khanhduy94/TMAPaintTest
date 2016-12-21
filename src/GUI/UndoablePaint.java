package GUI;

import java.util.List;

import javax.swing.undo.AbstractUndoableEdit;

public class UndoablePaint extends AbstractUndoableEdit {
 
 protected List<Shap> listShap;
 protected Shap shap;
 
 public UndoablePaint(List<Shap> listShap, Shap shap) {
  this.listShap = listShap;
  this.shap = shap;
 }
 
 @Override
 public void undo() {
  
  if (!listShap.isEmpty()) {
   super.undo();
   listShap.remove(shap);
  }
 }
 
 @Override
 public void redo() {
  super.redo();
  listShap.add(shap);
 }

}