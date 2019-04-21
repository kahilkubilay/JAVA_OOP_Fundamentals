package BirGörseliKodlamak;

public class Line {

	private Point begin, end;
	
	//parameters constructor
	public Line(int x1, int y1, int x2, int y2) {
		this.begin = new Point(x1, y1);
		this.end = new Point(x2, y2);
	}
	
	//point value constructor
	public Line(Point firstPoint, Point lastPoint) {
		this.begin = new Point(firstPoint.getX(), firstPoint.getY());
		this.end = new Point(lastPoint.getX(), lastPoint.getY());
	}
	
	//setter & getter
	public Point getBegin() {
		return this.begin;
	}
	
	public Point getEnd() {
		return this.end;
	}
	
	public void setBegin(Point firstPoint) {
		this.begin.setX(firstPoint.getX());
		this.begin.setY(firstPoint.getY());
	}
	
	public void setEnd(Point lastPoint) {
		this.end.setX(lastPoint.getX());
		this.end.setY(lastPoint.getY());
	}
	
	//get set begin & get set end
	public int getBeginX() {
		return this.begin.getX();
	}
	
	public int getBeginY() {
		return this.begin.getY();
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	
	public int getEndY() {
		return this.end.getY();
	}
	
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public void setEndX(int x) {
		this.end.setX(x);
	}
	
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	//getBeginXY:int[2] method
	public int[] getBeginXY() {
		int[] pointArr = new int[2];
		pointArr[0] = this.getBeginX();
		pointArr[1] = this.getBeginY();
		
		return pointArr;
	}
	
	//getEndXY:int[2] method
	public int[] getEndXY() {
		int[] pointArr = new int[2];
		pointArr[0] = this.getEndX();
		pointArr[1] = this.getEndY();
			
		return pointArr;
	}
	
	//setBeginXY(x:int, y:int):void method
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	
	//setBeginXY(x:int, y:int):void method
	public void setEndXY(int x, int y) {
		this.end.setX(x);
		this.end.setY(y);
	}
	
	//toString() method
	public String toString() {
		return "'Line[begin=(" + this.getBeginX() + ", " + this.getBeginY() + "), end=(" +
				    this.getEndX() + ", " + this.getEndY() + ")]'";
	}
	
	//getLength():double
	public double getLength() {
		double result = begin.distance(end);
		
		return result;
	}
	
}
