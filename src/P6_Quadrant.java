
import java.util.Scanner;
/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P6_Quadrant {
         public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
                System.out.print("Enter X as a double ");
                Double xValue= console.nextLine();
                System.out.print("Enter Y as a double ");
                Double yValue= console.nextLine();
                whatQuadrant(xValue, yValue);
                }
                private static void whatQuadrant(x, y) {
                          if (x < 0 && y > 0 ) {
                          System.out.println("Quadrant II");
                                }
                          else if (x > 0 && y > 0) {
                          System.out.println("Quadrant I");
                                }
                          else if (x > 0 && y < 0) {
                          System.out.println("Quadrant IV");
                                }
                           else if (x < 0 && y < 0) {
                           System.out.println("Quadrant III");

                                }

                }


