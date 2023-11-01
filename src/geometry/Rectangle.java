package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape {
	private int duzina;
	private int sirina;
	private Point tacka_ugla;
	private boolean selected;
	
public Rectangle() {
		
	}
	public Rectangle(Point tacka_ugla, int duzina , int sirina, boolean selected) {
		this.duzina=duzina;
		this.sirina=sirina;
		this.selected=selected;
		this.tacka_ugla=tacka_ugla; 
	}
	public int area(int duzina2, int sirina2) {
		int resenje=duzina2*sirina2;
		return resenje;
	}
	public int circumference(int duzina2, int sirina2) {
		int resenje=(2*duzina2) + (2*sirina2);
		return resenje;
	}
	public boolean equals(Object obj) {

		if(obj instanceof Rectangle) {
		Rectangle d = (Rectangle)obj;

		if(d.duzina == this.duzina && d.sirina==this.sirina && d.tacka_ugla.equals(this.tacka_ugla))

		return true;

		else

		return false;

		} else {

		return false;

		}

		}
	public boolean contains(int x, int y) {
		return (x >= tacka_ugla.getX() && x <= tacka_ugla.getX() + sirina 
				&& y >= tacka_ugla.getY() && y <= tacka_ugla.getY() + visina);

	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public Point getTacka_ugla() {
		return tacka_ugla;
	}
	public void setTacka_ugla(Point tacka_ugla) {
		this.tacka_ugla = tacka_ugla;
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
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
		


