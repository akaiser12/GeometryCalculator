/**
 * 
 */
package geometry.cvtc.edu;

import java.util.Scanner;

/**
 * @author austi_000
 *
 */
public class GeometryCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Geometry Calculator");		
		System.out.println("Choose a shape calculator.");
		System.out.println("1. Calculate the area of a circle.");
		System.out.println("2. Calculate the area of a rectangle.");
		System.out.println("3. Calculate the area of a triangle.");
		System.out.println("4. Quit");
		
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter your choice (1-4): ");
	    
	    int choice = keyboard.nextInt();
	    
	    if (choice == 1) {
	    	System.out.println("Please enter the radius of the circle:");
	    	
	    	double radius = keyboard.nextDouble();
	    	
	    	Geometry.setRadius(radius);
	    		    	
			if (isNegative(radius)) {				
				System.out.println("Please enter only POSITIVE values.");
				restartProgram();
			}
	    	
			else {
				Geometry.getCircleArea();
				System.out.println("The area of the circle is " + Geometry.getArea());
			}
			
	    }
	    
	    else if (choice == 2) {
	    	System.out.println("Please enter the width of the rectangle:");
	    	
	    	double width = keyboard.nextDouble();   	
	    	Geometry.setWidth(width);
	    	
			if (isNegative(width)) {
				System.out.println("Please enter only POSITIVE values.");
				restartProgram();
			}	  
			
	    	System.out.println("Please enter the length of the rectangle:");
	    	
	    	double length = keyboard.nextDouble();
	    	Geometry.setLength(length);	    	
	    	
	    	if (isNegative(length)) {
				System.out.println("Please enter only POSITIVE values.");
				restartProgram();
			}	
	    	
			else {
				Geometry.getRectangleArea();
				System.out.println("The area of the rectangle is " + Geometry.getArea());
			}	    		    		    		
	    }
	    
	    else if (choice == 3) {
	    	System.out.println("Please enter the base length of the triangle:");
	    	
	    	double length = keyboard.nextDouble();   	
	    	Geometry.setLength(length);
	    	
			if (isNegative(length)) {
				System.out.println("Please enter only POSITIVE values.");
				restartProgram();
			}	  
			
	    	System.out.println("Please enter the height of the triangle:");
	    	
	    	double height = keyboard.nextDouble();
	    	Geometry.setHeight(height);	    	
	    	
	    	if (isNegative(height)) {
				System.out.println("Please enter only POSITIVE values.");
				restartProgram();
			}	
	    	
			else {
				Geometry.getTriangleArea();
				System.out.println("The area of the triangle is " + Geometry.getArea());
			}		    	
	    }
	    
	    else if (choice == 4) {
	    	System.exit(0);
	    }
	    
	    else {
	    	System.out.println("Please enter the number corresponding to the calculator you would like to use.");
	    }
	    
	}
	
	// found @ http://stackoverflow.com/questions/3994531/how-to-determine-if-a-number-is-positive-or-negative
	public static boolean isNegative(Number number) {
	    return (Double.doubleToLongBits(number.doubleValue()) & Long.MIN_VALUE) == Long.MIN_VALUE;
	}
	
	public static void restartProgram() {
		System.out.println("Geometry Calculator");		
		System.out.println("Choose a shape calculator.");
		System.out.println("1. Calculate the area of a circle.");
		System.out.println("2. Calculate the area of a rectangle.");
		System.out.println("3. Calculate the area of a triangle.");
		System.out.println("4. Quit");
		
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter your choice (1-4): ");
	    
	    int choice = keyboard.nextInt();
	    
	    if (choice == 1) {
	    	System.out.println("Please enter the radius of the circle:");
	    	
	    	double radius = keyboard.nextDouble();
	    	
	    	Geometry.setRadius(radius);
	    	
	    	
	    	
			if (isNegative(radius)) {
				System.out.println("Please enter only positive values.");
			}
	    	
			else {
				Geometry.getCircleArea();
				System.out.println("The area of the circle is " + Geometry.getArea());
			}
			
	    }
	    
	    else if (choice == 2) {
	    	System.out.println("Please enter the width of the rectangle:");
	    	
	    	double width = keyboard.nextDouble();   	
	    	Geometry.setWidth(width);
	    	
			if (isNegative(width)) {
				System.out.println("Please enter only positive values.");
			}	  
			
	    	System.out.println("Please enter the length of the rectangle:");
	    	
	    	double length = keyboard.nextDouble();
	    	Geometry.setLength(length);	    	
	    	
	    	if (isNegative(length)) {
				System.out.println("Please enter only positive values.");
			}	
	    	
			else {
				Geometry.getRectangleArea();
				System.out.println("The area of the rectangle is " + Geometry.getArea());
			}	    		    		    		
	    }
	    
	    else if (choice == 3) {
	    	System.out.println("Please enter the base length of the triangle:");
	    	
	    	double length = keyboard.nextDouble();   	
	    	Geometry.setLength(length);
	    	
			if (isNegative(length)) {
				System.out.println("Please enter only positive values.");
			}	  
			
	    	System.out.println("Please enter the height of the triangle:");
	    	
	    	double height = keyboard.nextDouble();
	    	Geometry.setHeight(height);	    	
	    	
	    	if (isNegative(height)) {
				System.out.println("Please enter only positive values.");
			}	
	    	
			else {
				Geometry.getTriangleArea();
				System.out.println("The area of the triangle is " + Geometry.getArea());
			}		    	
	    }
	    
	    else if (choice == 4) {
	    	System.exit(0);
	    }
	    
	    else {
	    	System.out.println("Please enter the number corresponding to the calculator you would like to use.");
	    }
	    
	}		
	
}