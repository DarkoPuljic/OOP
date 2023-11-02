package geometry;

import java.awt.Graphics;

public class Line extends Shape {
	private Point startPoint;
	private Point endPoint;
	private Point selected;

	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, Point selected) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.selected = selected;
	}

	public double lenght(Point startPoint2, Point endPoint2) {

		/*
		 * int lstart = startPoint2 - startPoint.getX(); int lend = endPoint2 -
		 * endPoint.getY(); double duzina = Math.sqrt(lstart * lstart + lend * lend);
		 * return duzina;
		 */
		int lstart = endPoint2.getX() - startPoint2.getX();
		int lend = endPoint2.getY() - startPoint2.getY();
		double duzina = Math.sqrt(lstart * lstart + lend * lend);
		return duzina;

	}

	public boolean equals(Object obj) {

		if (obj instanceof Line) {
			Line l = (Line) obj;

			if (l.startPoint.equals(this.startPoint)
					&& l.endPoint.equals(this.endPoint)) {
				return true;

			} else {

				return false;

			}
		}
			return false;
		
	}
	public boolean contains(int x, int y) {
		Point newPoint= new Point (x,y);
		return this.lenght(startPoint, newPoint)<=2 || this.lenght(endPoint, newPoint) <=2;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public Point getSelected() {
		return selected;
	}

	public void setSelected(Point selected) {
		this.selected = selected;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		
	}
}
