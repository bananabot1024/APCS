/** This program provides a method to draw a house with 2 windows, a door, and a roof
 * @author Michelle Li
 */

// import gpdraw.jar
import gpdraw.*;

public class DrawHouse {

	// declaring a private object myPencil as an instance of the DrawingTool class
	private static DrawingTool myPencil;
	// declaring a private object myPaper as an instance of the SketchPad class
	private static SketchPad myPaper;
	
	// constructor (has same name as the class DrawHouse) to initialize myPaper and myPencil
	public DrawHouse() {
		// initializes myPaper, sets dimensions to 500 by 500
		myPaper = new SketchPad(500, 500);
		// initializes myPencil, sets the drawing tool myPencil to draw on myPaper
		myPencil = new DrawingTool(myPaper);
	}
	
	// the draw method draws a house 
	public void draw(){
		// draws the frame of the house
		myPencil.up();
		myPencil.move(0,-50);
		myPencil.down();
		myPencil.drawRect(350,200);

		// draws the roof
		myPencil.up();
		myPencil.move(175,50);
		myPencil.down();
		myPencil.move(0,160);
		myPencil.move(-175,50);

		// draws the windows
		myPencil.up();
		myPencil.move(70,0);
		myPencil.down();
		myPencil.drawRect(40,40);
		myPencil.up();
		myPencil.move(-70,0);
		myPencil.down();
		myPencil.drawRect(40,40);

		// draws the door
		myPencil.up();
		myPencil.move(0,-115);
		myPencil.down();
		myPencil.drawRect(50,70);
	}
}