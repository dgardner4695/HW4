package animation;

import shape.Shape;

public interface Event extends Comparable<Event> {

  int getT_start();
  int getT_end();
  Events getEventType();
  Shape getShape();
  void startEvent();
  String toString();

}
