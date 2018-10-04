package AlannaBotscharowCh3pr2;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 10/2
 * Computing the volume of a cylinder
 */
public class Chapter3Program2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.1415;
		//Prompt the user
		
			System.out.println("Please enter the radius of your cylinder.");
			
		
		//get radius of cylinder
		
			double radius = input.nextDouble(); 
			
		//add another prompt	
			
			System.out.println("Now enter the length of your cylinder.");
			
		//get length of cylinder
			
			double length = input.nextDouble(); 
		
		//compute area of the cylinder
			//area = radius * radius * pi 
		
			double area = radius * radius * PI; 
			
		//compute the volume of the cylinder
			//volume = area * length 
		
			double volume = area * length;
			
		//Display the results/ 
			
			System.out.println("The area of your cylinder is: "+area);
			System.out.println("the volume of your cylinder is: "+volume);

	}

}
