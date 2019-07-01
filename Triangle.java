package Exercise11_1;

public class Triangle extends GeoObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
	public Triangle(double S1, double S2, double S3, String color, boolean filled) 
				throws IllegalTriangleException{
		super(color, filled);
		if((S1 + S2) <= S3 || (S1 + S3) <= S2 || (S2 + S3) <= S1){
			throw new IllegalTriangleException(S1, S2, S3);
		}
		else {
			this.side1 = S1;
			this.side2 = S2;
			this.side3 = S3;
		}

	}
	
	public double getSide1(){
		return this.side1;
	}
	public double getSide2(){
		return this.side2;
	}
	public double getSide3(){
		return this.side2;
	}
	
	public double getArea(){
		return side1 + side2 + side3;
	}
	
	public double getPerimeter(){
		return side1 * side2 * side3;
	}
	
	public String toString(){
		return "triangle area is " + getArea() + " and perimter is " + getPerimeter() + " is filled "
				+ isFilled() + " and color is " + getColor();
	}
}