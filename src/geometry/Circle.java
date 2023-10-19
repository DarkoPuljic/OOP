package geometry;

public class Circle {
	private int radius;
	private Point center;
	private boolean selected;
	
public Circle() {
		
	}
	public Circle(Point center, int radius, boolean selected) {
		this.center=center;
		this.radius=radius;
		this.selected=selected;
}
	public double area (int radius2) {
		
		double resenje=radius2*radius2*Math.PI;
		return resenje;
		
	}
	public double circumference (int radius2) {
		
		double resenje=2*radius2*Math.PI;
		return resenje;
		
	}
	public boolean equals(Object obj) {

		if(obj instanceof Point) {
		Circle p = (Circle)obj;

		if(p.radius == this.radius && p.center==this.center)

		return true;

		else

		return false;

		} else {

		return false;

		}

		}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
	
