package geometry;

public class Line {
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

	/*int lstart = startPoint2 - startPoint.getX();
		int lend = endPoint2 - endPoint.getY();
		double duzina = Math.sqrt(lstart * lstart + lend * lend);
		return duzina;
		*/
		int lstart= endPoint2.getX()-startPoint2.getX();
		int lend= endPoint2.getY()-startPoint2.getY();
		double duzina = Math.sqrt(lstart*lstart+lend*lend);
		return duzina;
		
		
	}
	public boolean equals(Object obj) {

		if(obj instanceof Line) {
		Line p = (Line)obj;

		if(p.startPoint == this.startPoint && p.endPoint==this.endPoint)

		return true;

		else

		return false;

		} else {

		return false;

		}

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
}
