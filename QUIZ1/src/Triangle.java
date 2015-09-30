import java.math.*;

public class Triangle extends GeometricObject{
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;


public Triangle(double side1, double side2, double side3) {
	super();
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
	}


public double getSide1() {
	return side1;
	}

public double getSide2() {
	return side2;
}

public double getSide3() {
	return side3;
}

public double getArea() {
	double s = (this.side1+this.side2+this.side3)/2;
	double tarea = Math.sqrt((s*(s-this.side1)*(s-this.side2)*(s-this.side3)));
	return tarea;
}

public double getPerimeter() {
	return (this.side1+this.side2+this.side3);
}

public String toString() {
	return "created on " + getDateCreated() + "\ncolor: " + getColor() + " and filled: " + isFilled();


}
}



/*Design a class named Triangle that extends GeometricObject (attached to question). The class contains: 
	 

Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
A no-arg constructor that creates a default triangle.
A constructor that creates a triangle with the specified side1, side2, and side3.
The accessor methods for all three data fields.
A method named getArea() that returns the area of this triangle.
A method named getPerimeter() that returns the perimeter of this triangle.
A method named toString() that returns a string description for the triangle.
Junit test cases (test Area, Perimeter calculations)
*/
