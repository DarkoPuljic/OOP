package geometry;

import java.awt.Graphics;

public class Circle extends Shape {
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

		if (obj instanceof Line) {
			Circle r = (Circle) obj;

			if (r.radius== this.radius && r.center.equals(this.center)) {
				return true;

			} else {

				return false;

			}
		}
			return false;
		
	}
	public boolean contains(int x, int y) {
		return (center.distance(x,y)<=radius);
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
