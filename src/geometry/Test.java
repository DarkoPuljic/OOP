package geometry;

public class Test {

	public static void main(String[] args) {
		Point point1=new Point();
		Point point2= new Point();
		Point point_rectangle= new Point();
		point1.setX(10);
		point1.setY(12);
		point2.setX(15);
		point2.setY(7);
		point_rectangle.setX(20);
		point_rectangle.setY(30);
		Line line1= new Line();
		line1.setStartPoint(point1);
		line1.setEndPoint(point2);
		System.out.println("X kordinata tacke1 je " + point1.getX());
		System.out.println("X kordinata tacke2 je " + point2.getX());
		System.out.println("Y kordinata tacke1 je " + point1.getY());
		System.out.println("Y kordinata tacke2 je " + point2.getY());
		System.out.println("Da li je tacka1 selektovana " + point1.isSelected());
		System.out.println("Da li je tacka2 selektovana " + point1.isSelected());
		
		double lenght= line1.lenght(line1.getStartPoint(),line1.getEndPoint() );
		System.out.println(lenght);
		System.out.println(point1.getX());
		System.out.println(line1); 

		Rectangle pravougaonik= new Rectangle();
		pravougaonik.setSirina(25);
		pravougaonik.setDuzina(5);
		System.out.println(pravougaonik.area(pravougaonik.getSirina(), pravougaonik.getDuzina()));
		System.out.println(pravougaonik.circumference(pravougaonik.getSirina(), pravougaonik.getDuzina()));
		Circle krug= new Circle();
		krug.setRadius(4);
		System.out.println(krug.area(krug.getRadius()));
		System.out.println(krug.circumference(krug.getRadius()));
		
	}

}
