Author: Bryce Di Geronimo

CIS 212 Assignment4

Description

The goal of this assignment is to gain exposure to Java Swing and to build a user interface with a mix of standard and custom widgets.This project will involve creating a simple interactive paint application.

Instructions

1. Write a Java application that opens a UI window (hint: see the JFrame class).

2. Implement a class to serve as a template for points that will be drawn to the screen.  Each point can have a distinct 2D position, color, and size, so the class should have private instance variables to represent this state.

3. Add a canvas to your window which draws points when the user clicks the canvas or drags the mouse on the canvas (hint: see the JPanel class).To accomplish this, your application should maintain an ArrayList of instances of your point class from part 2; your mouse listeners should create instances of the class and add them to the list while your implementation of the JPanel paint Component method should paint all point instances in the list to the screen.

4. Add at least four buttons to your window which allow the user to select the current point color.This point color should affect any points drawn from the time the color is selected until the time that another color is selected.

5. Add at least three buttons to your window which will allow the user to select the current point size.This point size should affect any points drawn from the time the size is selected until the time that another size is selected.

6. Add a clear button to your frame which, when clicked, immediately clears anything that has been drawn to your canvas.

7. Write code that is clear and efficient.  Specifically, your code should be indented with respect to code blocks, avoid unnecessarily repetitive code, avoid code that is commented out or otherwise unused, use descriptive and consistent class/method/variable names, etc.

To run application, run Main.java and UI window will be opened. 