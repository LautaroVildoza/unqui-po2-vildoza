package ar.edu.unq.po2.tp3;

public class Point {
 public int x = 0;
 public int y = 0;
 
 
  	public int getX() {
  		return x;
  	}	


  	public void setX(int x) {
		this.x = x;
	}	


 	public int getY() {
	 	return y;
	}


	public void setY(int y) {
		this.y = y;
	}	




	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public Point() {
		super();
	}


	public void moverA(int x1, int y1) {
		this.setX(x1);
		this.setY(y1);
 	}
 
	public Point sumarseA(int x1, int y1){
		Point p = new Point();
		p.setX(this.getX() + x1);
		p.setY(this.getY() + y1);
	   return p;
	}
 
}
