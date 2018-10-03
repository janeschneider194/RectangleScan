/**
 * 
 * @author jane schneider
 *
 */
import java.util.Scanner;

public class RectangleMain
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter length: " );
		double length = scan.nextDouble();
		scan.nextLine();
	
		
		System.out.print("Enter width: ");
		double width = scan.nextDouble();
		scan.nextLine();
		
		
		double area = length * width;
		System.out.printf("Area:     %20.2f", area);
		System.out.println();
		
		
		double perimeter = (2 * length) + (2 * width);
		System.out.printf("Perimeter:%20.2f", perimeter);
		System.out.println();
		
		double diagonal = Math.sqrt(width * width + length * length);
		System.out.printf("Diagonal: %20.2f", diagonal);
		System.out.println();
	
	}
}
