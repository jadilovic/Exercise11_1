package Exercise11_1;

import java.util.Scanner;

public class testTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double sides[] = new double[3];
		
		System.out.println("What color is the triangle?");
		String color = input.nextLine();
		
		System.out.println("if it is filled enter true if it is not filled enter false");
		boolean filled = input.nextBoolean();
		
		System.out.println("Please enter three sides of the triangle ");
		for(int i = 0; i < 3; i++){
			sides[i] = input.nextDouble();
		}
		

		

		try{
		Triangle tri = new Triangle(sides[0], sides[1], sides[2], color, filled);
		System.out.println(tri.toString());
		System.out.println(tri.getDateCreated());
		}
		catch(IllegalTriangleException ex) {
			System.out.println(ex);
		}
		

		
		// tri.setColor(color);
		// tri.setFilled(filled);
		
		
		
	}

}
