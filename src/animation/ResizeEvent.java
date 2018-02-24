package animation;

import shape.Shape;

public class ResizeEvent extends AbstractEvent {

  private final double factor;

  public ResizeEvent(Shape s, int t_start, int t_end, double factor) {
    this.s = s;
    this.t_start = t_start;
    this.t_end = t_end;
    this.factor = factor;
    this.eventType = Events.RESIZE;
  }

  @Override
  public void startEvent() {
    //Insert logic for resize event here.
  }

  @Override
  public String toString() {
    return "Will add resize operation soon\n";
  }

}
