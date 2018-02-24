package animation;

import helpers.Color;
import shape.Shape;

public class RecolorEvent extends AbstractEvent {
  private final Color newColor;

  public RecolorEvent(Shape s, int t_start, int t_end, Color newColor) {
    this.s = s;
    this.t_start = t_start;
    this.t_end = t_end;
    this.newColor = newColor;
    this.eventType = Events.RECOLOR;
  }

  @Override
  public void startEvent() {
    //Logic for recolor event here.
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("");
    Color sc = this.getShape().getColor();
    sb.append("Shape ").append(this.getShape().getName()).append(" changes from color (");
    sb.append(sc.getR()).append(", ").append(sc.getG()).append(", ").append(sc.getB());
    sb.append(") to color (").append(newColor.getR()).append(", ").append(newColor.getG());
    sb.append(", ").append(newColor.getB()).append(") from t = ").append(this.t_start);
    sb.append(" to t = ").append(this.t_end).append("\n");
    return sb.toString();
  }

}
