package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MKeyListener extends KeyAdapter {

 @Override
 public void keyPressed(KeyEvent event) {
  if (Status.styleDraw == Status.DRAW_CIRCLE) {
   Status.styleDraw = Status.DRAW_RECT;
  } else {
   Status.styleDraw = Status.DRAW_CIRCLE;
  }

 }

}
