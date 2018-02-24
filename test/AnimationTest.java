import animation.*;
import helpers.Color;
import org.junit.Test;
import shape.Ellipse;
import shape.Rectangle;

import static org.junit.Assert.assertEquals;

public class AnimationTest {

  Rectangle r1 = new Rectangle("R1", 0, 0, 50, 100, new Color(0, 0, 0));
  Rectangle r2 = new Rectangle("R2", 50, 50, 25, 50, new Color(1.0, 1.0, 0));
  Ellipse ell1 = new Ellipse("E1", 100, 100, 75, new Color(0.5, 0.5, 0.5));

  @Test
  public void timelinePrintTest() {
    Animation a = new AnimationModel();
    Event e1 = new MoveEvent(r1, 0, 50, 100, 100);
    Event e2 = new RecolorEvent(r2, 50, 100, new Color(0, 0, 1.0));
    Event e3 = new ResizeEvent(ell1, 20, 40, 0.5);
    a.addEvent(e1);
    a.addEvent(e2);
    a.addEvent(e3);
    String out = a.show();
    assertEquals("Shapes:\n" +
        "Name: R2\n" +
        "Type: rectangle\n" +
        "Bottom-Left Corner: at (50, 50)\n" +
        "Color: (1.0, 1.0, 0.0)\n" +
        "Appears at t = 50\n" +
        "Disappears at t = 100\n" +
        "\n" +
        "Name: E1\n" +
        "Type: ellipse\n" +
        "Center: at (100, 100)\n" +
        "Color: (0.5, 0.5, 0.5)\n" +
        "Appears at t = 20\n" +
        "Disappears at t = 40\n" +
        "\n" +
        "Name: R1\n" +
        "Type: rectangle\n" +
        "Bottom-Left Corner: at (0, 0)\n" +
        "Color: (0.0, 0.0, 0.0)\n" +
        "Appears at t = 0\n" +
        "Disappears at t = 50\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "Shape R1 moves from (0, 0) to (100, 100) from t = 0 to t = 50\n" +
        "Will add resize operation soon\n" +
        "Shape R2 changes from color (1.0, 1.0, 0.0) to color (0.0, 0.0, 1.0) from t = 50 to t = 100\n",
        out);
  }

  @Test (expected = IllegalArgumentException.class)
  public void clashingAnimTest() {
    Animation a = new AnimationModel();
    Event e1 = new MoveEvent(r1, 0, 50, 100, 20);
    Event e2 = new MoveEvent(r1, 20, 70, 40, 60);
    a.addEvent(e1);
    a.addEvent(e2);
  }

}
