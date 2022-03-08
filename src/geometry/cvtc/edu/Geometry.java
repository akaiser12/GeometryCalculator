/**
 * 
 */
package geometry.cvtc.edu;

/**
 * @author austi_000
 *
 */
public class Geometry {	

	private static double area;
	private static double radius;
	private static double length;
	private static double height;
	private static double width;
	
	public static double getCircleArea() {			
		area = Math.PI * (radius * radius);			
		return area;
	}
	
	public static double getRectangleArea() {	
		area = length * width;		
		return area;
	}
	
	public static double getTriangleArea() {
		area = length * (height * 0.5);
		return area;
	}
	

	public static double getLength() {
		return length;
	}

	public static void setLength(double length) {
		Geometry.length = length;
	}

	public static double getHeight() {
		return height;
	}

	public static void setHeight(double height) {
		Geometry.height = height;
	}

	public static double getWidth() {
		return width;
	}

	public static void setWidth(double width) {
		Geometry.width = width;
	}

	public static double getArea() {
		return area;
	}

	public static void setArea(double area) {
		Geometry.area = area;
	}

	public static double getRadius() {
		return radius;
	}

	public static void setRadius(double radius) {
		Geometry.radius = radius;
	}
	
}
