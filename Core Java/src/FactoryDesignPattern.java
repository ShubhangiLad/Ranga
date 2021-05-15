interface Shape{
	void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Draw method of circle");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Draw method of rectangle");
	}
}

class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else
			return null;
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape c = shapeFactory.getShape("Circle");
		c.draw();
		Shape r = shapeFactory.getShape("Rectangle");
		r.draw();
	}

}
