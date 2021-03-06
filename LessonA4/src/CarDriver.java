/**
 * @author: Michelle Li
 * Period: 1
 * 
 */

import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("New car odometer reading: ");
		int start = scan.nextInt();
		Car car = new Car(start);
		
		System.out.println("Filling Station Visit: ");
		System.out.print("odometer reading: ");
		int reading = scan.nextInt();
		System.out.print("gallons to fill tank: ");
		double gallons = scan.nextDouble();
		car.fillUp(reading, gallons);
		System.out.println();
		System.out.printf("Miles per gallon: %.2f",car.calculateMPG());
		car.resetMPG();
		System.out.println();
		System.out.println();
		System.out.println("Filling Station Visit: ");
		System.out.print("odometer reading: ");
		reading = scan.nextInt();
		System.out.print("gallons to fill tank: ");
		gallons = scan.nextDouble();
		car.fillUp(reading, gallons);
		System.out.println();
		System.out.printf("Miles per gallon: %.2f",car.calculateMPG());
		car.resetMPG();		
		System.out.println();

	}

}
