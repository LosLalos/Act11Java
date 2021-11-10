import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UI {

    // Initializes the program.
    public static void main(String[] args) {
        int areaOrPerimeterInput;
        int chosenShapeInput;

        areaOrPerimeterInput = areaOrPerimeter();
        chosenShapeInput = chooseShape();
        uiMenu(chosenShapeInput, areaOrPerimeterInput);

    }

    /**
     * Displays the user a menu of choices he or she can make.
     * This menu is for knowing if the user wants to calculate the perimeter or area of a geometric shape.
     * @return The chosen menu option.
     */
    private static int areaOrPerimeter() {
        int userInput = 0;
        boolean error;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(
                """
                
                [!] Do you want to calculate the area of a geometric shape, or do you want to calculate its perimeter?
                
                [1] Calculate the perimeter.
                [2] Calculate the area.
                
                
                >>>\040""");

        do {
            try {
                userInput = Integer.parseInt(bufferedReader.readLine());

                if (userInput > 2 || userInput < 1) {
                    throw new Exception();
                }

                error = false;
            } catch (NumberFormatException e) {
                System.out.print("\n[!] Please insert a whole number! Please try again.\n>>> ");
                error = true;
            } catch (Exception e) {
                System.out.print("\n[!] Please insert a valid menu option! Please try again.\n>>> ");
                error = true;
            }
        }
        while (error);

        return userInput;
    }

    /**
     * Displays the user a menu of choices he or she can make.
     * This menu is for knowing want geometric shape the user is going to use.
     * @return The chosen menu option.
     */
    private static int chooseShape() {
        int userInput = 0;
        boolean error;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(
                """
                
                [!] Which geometric shape are you going to use?
                
                [1] Circle.
                [2] Square.
                [3] Triangle.
                
                
                >>>\040""");

        do {
            try {
                userInput = Integer.parseInt(bufferedReader.readLine());

                if (userInput > 3 || userInput < 1) {
                    throw new Exception();
                }

                error = false;
            } catch (NumberFormatException e) {
                System.out.print("\n[!] Please insert a whole number! Please try again.\n>>> ");
                error = true;
            } catch (Exception e) {
                System.out.print("\n[!] Please insert a valid menu option! Please try again.\n>>> ");
                error = true;
            }
        }
        while (error);


        return userInput;
    }

    /**
     * This method offers a way for the user to input the measurements of the geometric shape he is going to use, in
     * order to make the calculation he chose.
     * @param chosenShape The geometric shape the user chose.
     * @param areaOrPerimeter The calculation the user chose.
     */
    private static void uiMenu(int chosenShape, int areaOrPerimeter) {
        double userInput1, userInput2, userInput3;

        switch (chosenShape) {
            case 1 -> {
                Circle circle;
                switch (areaOrPerimeter) {
                    case 1 -> {
                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the radius of the circle, in order to calculate its perimeter.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput1 = checkUserInput();

                        circle = new Circle(userInput1);
                        System.out.print("\n[!] The perimeter of a circle with a radius of " + userInput1 + " is: " + circle.getPerimeter() + "\n\n");
                    }
                    case 2 -> {
                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the radius of the circle, in order to calculate its area.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput1 = checkUserInput();

                        circle = new Circle(userInput1);
                        System.out.print("\n[!] The area of a circle with a radius of " + userInput1 + " is: " + circle.getArea() + "\n\n");
                    }
                }
            }
            case 2 -> {
                Square square;
                switch (areaOrPerimeter) {
                    case 1 -> {
                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the length of the square's sides, in order to calculate its perimeter.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput1 = checkUserInput();

                        square = new Square(userInput1);
                        System.out.print("\n[!] The perimeter of a square with sides of length " + userInput1 + " is: " + square.getPerimeter() + "\n\n");
                    }
                    case 2 -> {
                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the length of the square's sides, in order to use to calculate its area.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput1 = checkUserInput();

                        square = new Square(userInput1);
                        System.out.print("\n[!] The area of a square with sides of length " + userInput1 + " is: " + square.getArea() + "\n\n");
                    }
                }
            }
            case 3 -> {
                Triangle triangle;
                switch (areaOrPerimeter) {
                    case 1 -> {
                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the length of the first side of the triangle, in order to calculate its perimeter.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput1 = checkUserInput();

                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the length of the second side of the triangle, in order to calculate its perimeter.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput2 = checkUserInput();

                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the length of the third side of the triangle, in order to calculate its perimeter.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput3 = checkUserInput();

                        triangle = new Triangle(userInput1, userInput2, userInput3);

                        System.out.print("\n[!] The perimeter of a triangle with sides of length " + userInput1 + ", " + userInput2 + ", and " + userInput3 + " is: " + triangle.getPerimeter() + "\n\n");
                    }
                    case 2 -> {
                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the base of the triangle, in order to calculate its area.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput1 = checkUserInput();

                        System.out.print(
                                """
                                                                        
                                        [!] Please insert the height of the triangle, in order to calculate its area.
                                                                        
                                                                        
                                        >>>\040""");

                        userInput2 = checkUserInput();

                        triangle = new Triangle(userInput1, userInput2);

                        System.out.print("\n[!] The area of a triangle with a base of " + userInput1 + " and a height of " + userInput2 + " is: " + triangle.getArea() + "\n\n");
                    }
                }
            }
        }

    }

    /**
     * This method checks that the numeric value the user inserted is positive and has correct format.
     * @return The numeric value the user inserted into the console.
     */
    private static double checkUserInput() {
        double userInput = 0;
        boolean error;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                userInput = Double.parseDouble(bufferedReader.readLine());

                if (userInput <= 0) {
                    throw new Exception();
                }

                error = false;
            } catch (NumberFormatException e) {
                System.out.print("\n[!] Please insert a number! Please try again.\n>>> ");
                error = true;
            } catch (Exception e) {
                System.out.print("\n[!] Please insert a positive number! Please try again.\n>>> ");
                error = true;
            }
        }
        while (error);

        return userInput;
    }

}
