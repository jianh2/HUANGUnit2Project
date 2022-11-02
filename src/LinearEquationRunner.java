import java.util.Scanner;

public class LinearEquationRunner {


    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello how are you");
        System.out.print("Enter coordinates in the form of (x, y) ");
        String coord1 = scan.nextLine();
        System.out.print("Enter  coordinates in the form of (x, y) ");
        String coord2 = scan.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,2));
        int x2 = Integer.parseInt(coord2.substring(1,2));
        int y1 = Integer.parseInt(coord1.substring(4,5));
        int y2 = Integer.parseInt(coord2.substring(4,5));





        if (x1 == x2) {
            System.out.println("Please enter different x values");

        }else {
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println("Equation: " + equation.equation());
            System.out.println("Slope: " + equation.slope());
            System.out.println("y-intercept: " + equation.yIntercept());
            System.out.println("Distance: " + equation.distance());
            System.out.println();
            System.out.println("----- Line info -----");
            System.out.println(equation.lineInfo());
            System.out.println();
            double testX = 4;
            System.out.println("Enter a Coordinate for x: ");
            int xCord = scan.nextInt();
            String Coordinates = equation.coordinateForX(xCord);
            System.out.println(Coordinates);

        }



    }
}
