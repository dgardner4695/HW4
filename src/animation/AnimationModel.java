package animation;

import shape.Shape;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class AnimationModel implements Animation {

  private Map<String, Shape> toDraw;
  private List<Event> timeline;

  public AnimationModel() {
    this.toDraw = new HashMap<>();
    this.timeline = new ArrayList<>();
  }
  /**
   * @inheritDoc
   */
  @Override
  public void draw() {
    //To be implemented later on.
  }

  /**
   * @inheritDoc
   * @param s The shape object to add.
   * @throws IllegalArgumentException
   */
  @Override
  public void add(Shape s) throws IllegalArgumentException {
    if (s == null) {
      throw new IllegalArgumentException("Either name or shape was null");
    }

    for (Shape s1 : toDraw.values()) {
      if (s == s1) {
        throw new IllegalArgumentException("Duplicate shape found in list of drawables");
      }
    }

    for (String n : toDraw.keySet()) {
      if (s.getName().equals(n)) {
        throw new IllegalArgumentException("Duplicate shape names are not permitted");
      }
    }

    toDraw.put(s.getName(), s);

  }

  /**
   * @inheritDoc
   */
  @Override
  public void clear() {
    //add clear logic later.
  }

  /**
   * @inheritDoc
   */
  @Override
  public void redraw() {
    this.clear();
    this.draw();
  }

  /**
   * Method to check if two events clash based on time interval/event type.
   * @param e1  The first event to compare.
   * @param e2  The second event to compare.
   * @return    True if the event is valid and can be added, false otherwise.
   */
  private boolean eventValid(Event e1, Event e2) {
    if (e1.getEventType() == e2.getEventType()) {
      if (e1.getT_start() <= e2.getT_end() && e1.getT_start() > e2.getT_start()
          || e1.getT_end() <= e2.getT_end() && e1.getT_start() > e2.getT_start()) {
        return false;
      } else {
        return true;
      }
    }
    else {
      return true;
    }
  }

  /**
   * @inheritDoc
   */
  @Override
  public void addEvent(Event e) throws IllegalArgumentException {
    if (e == null) {
      throw new IllegalArgumentException("Event must not be null");
    }
    for (Event e1 : timeline) {
      if (!eventValid(e, e1)) {
        throw new IllegalArgumentException("Cannot add conflicting events to same timeline");
      }
    }

    this.add(e.getShape());

    this.timeline.add(e);

    if (e.getT_start() < e.getShape().getAppears() || e.getShape().getAppears() == -1) {
      e.getShape().setAppears(e.getT_start());
    }
    if (e.getT_end() > e.getShape().getDisappears() || e.getShape().getDisappears() == -1) {
      e.getShape().setDisappears(e.getT_end());
    }

    Collections.sort(this.timeline);
  }

  /**
   * @inheritDoc
   * @return  The string representation of the list of Shapes and animation timeline.
   */
  @Override
  public String show() {
    StringBuilder sb = new StringBuilder("");
    sb.append("Shapes:\n");
    for (Map.Entry<String, Shape> entry : toDraw.entrySet()) {
      Shape s = entry.getValue();
      String name = entry.getKey();
      sb.append("Name: ").append(name).append("\n");
      sb.append("Type: ").append(s.toString()).append("\n");
      sb.append(s.getRefString()).append(": at (").append(s.getX()).append(", ").append(s.getY()).append(")\n");
      sb.append("Color: (").append(
          s.getColor().getR()).append(", ").append(
              s.getColor().getG()).append(", ").append(
                  s.getColor().getB()).append(")\n");
      sb.append("Appears at t = ").append(s.getAppears()).append("\n");
      sb.append("Disappears at t = ").append(s.getDisappears()).append("\n\n");
    }
    sb.append("\n\n\n");
    for (Event e : timeline) {
      sb.append(e.toString());
    }
    return sb.toString();
  }

  /**
   * @inheritDoc
   */
  @Override
  public void run() {

  }
}
