package animation;

import shape.Shape;

public class MoveEvent extends AbstractEvent {
  private final int targetX, targetY;

  public MoveEvent(Shape s, int t_start, int t_end, int targetX, int targetY) {
    this.s = s;
    this.t_start = t_start;
    this.t_end = t_end;
    this.targetX = targetX;
    this.targetY = targetY;
    this.eventType = Events.MOVE;
  }

  @Override
  public void startEvent() {
    //Insert logic for move operation here.
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("");
    sb.append("Shape ").append(this.getShape().getName()).append(" moves from (");
    sb.append(this.getShape().getX()).append(", ").append(this.getShape().getY());
    sb.append(") to (").append(this.targetX).append(", ").append(this.targetY);
    sb.append(") from t = ").append(this.t_start).append(" to t = ").append(this.t_end);
    sb.append("\n");
    return sb.toString();
  }

}
