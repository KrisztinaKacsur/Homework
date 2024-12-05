package Exercises;

import org.testng.annotations.Test;

public class HomeworkExercises {

   //INTEGER Exercises

   /*Calculate the Perimeter of a Rectangle:
   Initialize two integers length and width with any values.
   Calculate and print the perimeter of a rectangle using these variables. */

    @Test
    public void rectanglePerimeter(){

        int rectangleLength = 364;
        int rectangleWidth = 250;

        int perimeter = 2 * (rectangleLength + rectangleWidth);
        System.out.println("The perimeter of the rectangle is: " + perimeter + " cm");
    }

    /*Convert Minutes into Seconds:
    Initialize an integer minutes with any value.
    Convert this into seconds and print the result.*/

    @Test
    public void convertMinToSec (){

        int minute = 13;
        int second = 60;

        int minToSec = minute * second;
        System.out.println(minute + " minutes = " + minToSec + " seconds");

    }

    /*Calculate the Area of a Square
    Initialize an integer side representing the side of a square.
    Calculate and print the area of the square.*/

    @Test
    public void areaOfSquare (){

        int squareSide = 6;

        int area = squareSide * squareSide;
        System.out.println("The area of the square is: " + area + " cm");
    }

    /*DOUBLE Exercises
    Calculate the Volume of a Cylinder
    Initialize two doubles radius and height for a cylinder.
    Calculate and print the volume of the cylinder (use Math.PI for π).*/

    @Test
    public void volumeOfCylinder (){

        double heightOfCylinder = 125.3;
        double radiusOfCylinder = 89.7;

        double volume = Math.PI * (radiusOfCylinder * radiusOfCylinder) * heightOfCylinder;
        System.out.println("The volume of the Cylinder is: " + volume);

    }

    /*Convert Fahrenheit to Celsius
    Initialize a double Fahrenheit with any value. Convert this to Celsius and print the result.
    C = (°F - 32) × 5/9*/

    @Test
    public void fahToC (){

        double fahrenheit = 91.3;

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Convert to Celsius: " + celsius + "C");
    }

    /*Calculate the Hypotenuse of a Right-Angled Triangle
    Given the lengths of the two shorter sides of a right-angled triangle, calculate the length of the hypotenuse.
    Use Pythagoras theorem.*/

    @Test
    public void hypotenuseOfTriangle (){

        double sideA = 56.7;
        double sideB = 58.3;

        double sideC = (sideA * sideA) + (sideB * sideB);
        double hypotenuse = Math.sqrt(sideC);
        System.out.println("The hypotenuse of the right-angled triangle is: " + hypotenuse + " cm");
    }

    //BOOLEAN Exercises

    /*
    Boolean Value Assignment and Printing
    Create a program that declares a boolean variable, assigns a value to it, and then prints it.
    This exercise helps you understand how to work with boolean variables.*/

    @Test
    public void trueOrFalse (){
        boolean isTheLightGreen = true;
        System.out.println("Is the light Green? " + isTheLightGreen);
    }
    
}
