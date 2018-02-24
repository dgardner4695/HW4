package shape;

import helpers.Color;

/**
 * Public interface for shape objects.
 * This interface defines the methods that are common among all shapes,
 * and is implemented by AbstractClass.
 */
public interface Shape {

  /**
   * Method to get the color of the shape object.
   * @return  The color object representing the color of the shape.
   */
  Color getColor();

  /**
   * Method to set the color of the shape object.
   * @param c The new color to set for the shape.
   */
  void setColor(Color c);

  /**
   * Gets the X coordinate associated with the given shape.
   * @return  The X coordinate field of the shape.
   */
  int getX();

  /**
   * Gets the Y coordinate associated with the given shape.
   * @return  The Y coordinate field of the shape.
   */
  int getY();

  /**
   * Sets the X coordinate field of the shape.
   * @param newX  The new X coordinate.
   */
  void setX(int newX);

  /**
   * Sets the Y coordinate field of the shape.
   * @param newY  The new Y coordinate.
   */
  void setY(int newY);

  /**
   * Scales the shape by a given factor.
   * @param factor  The scaling factor, greater than 0.
   * @throws IllegalArgumentException If the factor is invalid.
   */
  void scale(double factor) throws IllegalArgumentException;

  String toString();

  String getRefString();

  int getAppears();
  int getDisappears();
  void setAppears(int newT);
  void setDisappears(int newT);
  String getName();

}
