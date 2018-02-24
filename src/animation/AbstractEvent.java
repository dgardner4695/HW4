package animation;

import shape.Shape;

public abstract class AbstractEvent implements Event {

  int t_start, t_end;
  Events eventType;
  Shape s;

  @Override
  public int getT_start() {
    return this.t_start;
  }

  @Override
  public int getT_end() {
    return t_end;
  }

  @Override
  public Events getEventType() {
    return eventType;
  }

  @Override
  public Shape getShape() { return s; }

  @Override
  public int compareTo(Event e) {
    return Integer.compare(this.t_start, e.getT_start());
  }
}
