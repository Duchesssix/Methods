package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;  //declare and initialize variable
        double length = 0.00, width=0.00, height=0.00, radius=0.00; //declare and initialize parameter variables

        Scanner scanner = new Scanner(System.in);  //create scanner to read user input

        do {
            System.out.println("Please enter the number of your selection: ");  //prompt user for input
            //Display menu selections
            System.out.println("1. Calculate the Area of a Square");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Calculate the Area of a Circle");
            System.out.println("5. Exit");

            option = scanner.nextInt();  //get option as an Int

            switch (option) {
                case 1:
                    System.out.println("Enter the length of the side of the Square: ");
                    length = scanner.nextDouble();  //get length of side from user
                    System.out.println("The area of a square with length " + length + " is " + calcSqArea (length));
                    break;
                case 2:
                    System.out.println("Enter the width of the Rectangle: ");
                    width = scanner.nextDouble();  //get width of rectangle from user
                    System.out.println("Enter the height of the Rectangle: ");
                    length = scanner.nextDouble();  //get height of rectangle from user
                    System.out.println("The area of a rectangle with length " + length + " and a width of " + width + " is " + calcRectArea (width, length));
                    break;
                case 3:
                    System.out.println("Enter the length of the base of the Triangle: ");
                    length = scanner.nextDouble();  //get length of the base of rectangle from user
                    System.out.println("Enter the height of the Triangle: ");
                    height = scanner.nextDouble();  //get height of the triangle from user
                    System.out.println("The area of a triangle with a base length of " + length + " and a height of " + height + " is " + calcTriArea (length, height));
                    break;
                case 4:
                    System.out.println("Enter the radius of the Circle: ");
                    radius = scanner.nextDouble();  //get length of the base of rectangle from user
                    System.out.println("The area of a circle with a radius of " + radius + " is " + calcCirArea (radius));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
            }
        } while (option <1 || option > 5);
    }

    public static double calcTriArea (double base, double height) {
        double area = base * height * .5;
        return area;
    }

    public static double calcRectArea (double w, double h) {
        double area = w * h;
        return area;
    }

    public static double calcCirArea (double radius) {
        double area = (radius * radius) * 3.14;
        return area;
    }

    public static double calcSqArea (double side) {
        double area = side * side;
        return area;
    }
}

