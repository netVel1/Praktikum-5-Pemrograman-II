package praktikum5.soal1;

import java.text.DecimalFormat;

public class PaintThings {

    public static void main (String[] args) 
  {
    final double COVERAGE = 350;
    Paint paint = new Paint(COVERAGE);
    Rectangle deck = new Rectangle(20, 35); 
    Sphere bigBall = new Sphere(15); 
    Cylinder tank = new Cylinder(10, 30);
    double deckAmt, ballAmt, tankAmt;
    deckAmt = paint.amount(deck);
    ballAmt = paint.amount(bigBall);
    tankAmt = paint.amount(tank);
    //Instantiate the three shapes to paint
    //Compute the amount of paint needed for each shape
    //Print the amount of paint for each. 
    DecimalFormat fmt = new DecimalFormat("0.#"); 
    System.out.println ("\nNumber of gallons of paint needed...");
    System.out.println ("Deck " + fmt.format(deckAmt)); 
    System.out.println ("Big Ball " + fmt.format(ballAmt)); 
    System.out.println ("Tank " + fmt.format(tankAmt));
  }
    
}
