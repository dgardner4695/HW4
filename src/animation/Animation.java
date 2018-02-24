package animation;

import shape.Shape;
import helpers.Color;

/**
 * Interface for animations.
 * Defines some basic operations expected by an animation, including
 * drawing, adding shapes to be drawn, clearing the drawing, and
 * adding/handling events with a timeline.
 */
public interface Animation {

  /**
   * Method to draw the list of shapes at their respective locations.
   * Will eventually iterate over a list-like structure of object to draw.
   */
  void draw();

  /**
   * Adds a shape object to the list of objects to draw.
   * @param s The shape object to add.
   * @throws IllegalArgumentException   If the shape is already on the list.
   */
  void add(Shape s) throws IllegalArgumentException;

  /**
   * Clears the list of objects to draw.
   * Should not delete the objects, just remove them from the list.
   */
  void clear();

  /**
   * Wrapper for calling clear than draw.
   * Used to remove all objects from the drawing surface.
   */
  void redraw();

  /**
   * Method to add an event to the event list.
   * Associates an event type with a shape object, and places the
   * event in a timeline ordered by start/end times.
   * @param e         The event type to assign to the shape object.
   * @throws IllegalArgumentException   If the event conflicts with another event in some way.
   *                                    Could be simultaneous moves on the same object, or similar.
   */
  void addEvent(Event e)
  throws IllegalArgumentException;

  /**
   * Outputs the list of shapes with their animation details.
   * Formatted like -
   * Name: Name assigned to the object
   * Type: The type of shape
   * -origin-: (x, y) coords of origin point
   * Color: The color in form (r, g, b)
   * Appearance tick/time: When the shape first appears
   * Disappearance tick/time: When the shape is last seen
   *
   * Also prints the full timeline of events to carry out, along with the
   * shapes associated with each event.
   *
   * @return  The string representation of list of Shapes and animation timeline.
   */
  String show();

  /**
   * "Main" method for an animation.
   * Follows the timeline, executing events as their start ticks/times are
   * reached in sequential order.
   */
  void run();

}
