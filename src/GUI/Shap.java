package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JPanel;


public class Shap {
	 
	 private int X;
	 private int Y;
	 private int radius;
	 private int width;
	 private int height;
	 private int ShapeTYpe;
	 private int stYle2D3D;
	 private Graphics g;	 
	 
	 public Shap(int X, int Y, int radius, int ShapeTYpe, int stYle2D3D) {
	  this.X = X;
	  this.Y = Y;
	  this.radius = radius;
	  this.ShapeTYpe = ShapeTYpe;
	  this.stYle2D3D = stYle2D3D;
	 }
	 
	 public Shap(int X, int Y, int width, int height, int tYpe, int stYle2D3D) {
	  this.X = X;
	  this.Y = Y;
	  this.width = width;
	  this.height = height;
	  this.ShapeTYpe = tYpe;
	  this.stYle2D3D = stYle2D3D;
	 }

	 public int getX() {
	  return X;
	 }

	 public void setX(int X) {
	  this.X = X;
	 }

	 public int getY() {
	  return Y;
	 }

	 public void setY(int Y) {
	  this.Y = Y;
	 }

	 public int getRadius() {
	  return radius;
	 }

	 public void setRadius(int radius) {
	  this.radius = radius;
	 }

	 public int getWidth() {
	  return width;
	 }

	 public void setWidth(int width) {
	  this.width = width;
	 }

	 public int getHeight() {
	  return height;
	 }

	 public void setHeight(int height) {
	  this.height = height;
	 }
	
	 public void setStyleShape(){
		
		 switch(ShapeTYpe){
		 case 1: 
			 g.setColor(Color.BLUE);
			 break;
		 case 2:
			 g.setColor(Color.BLACK);
			 break;
		 }
	 }
	 public void drawShape(JPanel paintPanel){
		 g = paintPanel.getGraphics();
		 this.setStyleShape();
		 switch(stYle2D3D){
		 case 1: 
			 g.fillOval(X, Y, radius, radius);
			 break;
		 case 2:
			 g.fillRect(X, Y, width, height);
			 break;
		 }			 
	 }
	 public void deleteShape(JPanel paintPanel){
		 g = paintPanel.getGraphics();
		 g.setColor(Color.WHITE);
		 switch(stYle2D3D){
		 case 1: 
			 g.fillOval(X, Y, radius, radius);
			 break;
		 case 2:
			 g.fillRect(X, Y, width, height);
			 break;
		 }		
	 }
	 
	 
}


enum STYLE {towD(1),threeD(2);
	private int price;
	STYLE(int p) {
	      price = p;
	   }
	   int getPrice() {
	      return price;
	   } 
	}