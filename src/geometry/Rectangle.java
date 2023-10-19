package geometry;

public class Rectangle {
	private int pravougaonik;
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
		Rectangle p = (Rectangle)obj;

		if(p.duzina == this.duzina && p.sirina==this.sirina)

		return true;

		else

		return false;

		} else {

		return false;

		}

		}
	
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
	public int getPravougaonik() {
		return pravougaonik;
	}
	public void setPravougaonik(int pravougaonik) {
		this.pravougaonik = pravougaonik;
	}
	
}
		


