public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;

    private int y2;

    private int x2;


    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        if (x1 == x2) {

            return;
        }
             this.x1 = x1;
             this.y1 = y1;
             this.x2 = x2;
             this.y2 = y2;


    }
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated)
    public LinearEquation(int x1, int y1, int x2, int y2)



 */
/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance()
    {
        //double x;
        //x = x1;
        //double Secondx;
        //Secondx = x2;
        //double y;
        //y = y1;
        //double Secondy;
        //Secondy = y2;
        //y = (y2-y1);
        return roundedToHundredth(Math.hypot((double)x2 - (double)x1, (double)y2 - (double)y1));

    }





    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept()
    {
        double Intercept;
        Intercept = 0;
        if (x1>0) {
             double yIntercept = roundedToHundredth((double)y1 - ((double)x1 * slope()));
             Intercept = yIntercept;
        }else{
             double yIntercept2 = roundedToHundredth((double)y1 + ((double)x1 * slope()));
             Intercept = yIntercept2;
        }
        return Intercept;
    }



    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope()
    {

        return Math.round((double) y2- (double) y1 )/ ( (double) x2 - (double) x1 );

    }



    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".

        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7

        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)

        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!


        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0 	- 2.35	      + 12.5		- 8.0		+ 17.19

        Here are non-examples of "printable" y-intercepts:
           - -1.0 	+ -2.35	- -12.5	+ -8.0	     - -17.19	+ 0	- 0

        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation()
    {
        return "y = " + slope() + "x" + "+ " + yIntercept();
    }





    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue)
    {
        return "(" + x1 + ", " + y1 + " )";
    }





    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth

        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound)
    {
        return Math.round(toRound * 100) / 100;
    }

    public String lineInfo()
    {
        String originalPoints = "The original points were (" + x1 + "," + y1 + ")" + "and" + "( " + x2 + "," + y2 + " )";
        String equation = "The equation is " + equation();
        return originalPoints + "\n" + equation + "\n" + "The slope is " + slope() + " The y-intercept of the line is " + yIntercept() + " The distance is " + distance();
    }
}
